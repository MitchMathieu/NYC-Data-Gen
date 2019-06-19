public class Application {
   public static void main(String[] args) {
      CsvReader reader = new CsvReader("pet-walk-2.csv");
      System.out.println(reader.getLines());


      int period = 86400;
      ResidentialCar resCar = new ResidentialCar(period);
      System.out.println("Car location:");
      double[] coords = resCar.getLocation();
      System.out.printf("(%f, %f)\n", coords[0], coords[1]);


      Subway subway = new Subway(period, "4");
      System.out.println("\nSubway location");
      coords = subway.getLocation();
      System.out.printf("(%f, %f)\n", coords[0], coords[1]);

      Pet pet = new Pet(period, 1);
      System.out.println("Pet location:");
      coords = pet.getLocation();
      System.out.printf("(%f, %f)\n", coords[0], coords[1]);
   }
}
