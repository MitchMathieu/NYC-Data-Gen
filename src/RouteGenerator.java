public class RouteGenerator {
   public static void main(String[] args) {
      int period = 86400;
      ResidentialCar resCar = new ResidentialCar(period);
      System.out.println("Current position:");
      double[] coords = resCar.getLocation();
      System.out.printf("(%f, %f)\n", coords[0], coords[1]);

      CsvReader reader = new CsvReader("n-r.csv");
      System.out.println(reader.getLines());

      Subway subway = new Subway(period, "NR");
      System.out.println("Subway location");
      coords = subway.getLocation();
      System.out.printf("(%f, %f)\n", coords[0], coords[1]);
   }
}
