public class Application {
   public static void main(String[] args) {
//      CsvReader reader = new CsvReader("pet-walk-3.csv");
//      System.out.println(reader.getLines());


      int period = 86400;
      Car car = new Car();
      System.out.println("Car location:");
      double[] coords = car.getLocation();
      System.out.printf("(%f, %f)\n", coords[0], coords[1]);

      Subway subway = new Subway();
      System.out.println("\nSubway location");
      coords = subway.getLocation();
      System.out.printf("(%f, %f)\n", coords[0], coords[1]);

      Pet pet = new Pet();
      System.out.println("Pet location:");
      coords = pet.getLocation();
      System.out.printf("(%f, %f)\n", coords[0], coords[1]);

      Person person = new Person();
      person.setPet(true);
      System.out.println("Person location:");
      coords = person.getLocation();
      System.out.printf("(%f, %f)\n", coords[0], coords[1]);
   }
}
