public class Application {
   public static void main(String[] args) {
      int period = 86400;
      ResidentialCar resCar = new ResidentialCar(period);
      System.out.println("Current position:");
      double[] coords = resCar.getLocation();
      System.out.printf("(%f, %f)\n", coords[0], coords[1]);

      CsvReader reader = new CsvReader("subway-4.csv");
      System.out.println(reader.getLines());

      Subway subway = new Subway(period, "4");
      System.out.println("\nSubway location");
      coords = subway.getLocation();
      System.out.printf("(%f, %f)\n", coords[0], coords[1]);
   }
}
