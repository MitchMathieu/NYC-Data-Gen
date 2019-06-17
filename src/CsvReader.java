import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class CsvReader {

   private List<List<String>> lines;

   public CsvReader(String filename) {
      lines = getCoordsFromCsv(filename);
   }

   // get file from classpath, resources folder
   private List<List<String>> getCoordsFromCsv(String filename) {
      List<String> rawCoords = readAllLines(filename);
      List<List<String>> coords = new ArrayList<>();
      for (String c : rawCoords) {
         String[] arr = c.split(",");
         coords.add(Arrays.asList(arr));
      }
      return coords;
   }

   private BufferedReader getBufferedReaderFromResources(String fileName) {

      ClassLoader classLoader = getClass().getClassLoader();

      InputStream stream = classLoader.getResourceAsStream(fileName);
      if (stream == null) {
         throw new IllegalArgumentException("file is not found!");
      }
      return new BufferedReader(new InputStreamReader(stream));
   }

   private List<String> readAllLines(String fileName) {
      BufferedReader br = getBufferedReaderFromResources(fileName);

      List<String> lines = br.lines().skip(1).filter(s->!s.isBlank()).collect(Collectors.toList());

      return lines;
   }

   public List<List<String>> getLines() {
      return lines;
   }

   public void setLines(List<List<String>> lines) {
      this.lines = lines;
   }
}
