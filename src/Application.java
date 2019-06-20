public class Application {
   public static void main(String[] args) {
//      CsvReader reader = new CsvReader("pet-walk-3.csv");
//      System.out.println(reader.getLines());

      int period = 86400;
      double[] coords;
      double orientation;
      for (int i=1; i<4; i++) {
         Subway subway = new Subway(period, i);
         coords = subway.getLocation();
         orientation = subway.getOrientation();
         System.out.printf("Subway%d location: (%f, %f) in direction %f\n", i, coords[0], coords[1], orientation);
      }

      for (int i=1; i<4; i++) {
         Car car = new Car(period, i);
         coords = car.getLocation();
         orientation = car.getOrientation();
         System.out.printf("Car%d location: (%f, %f) in direction %f\n", i, coords[0], coords[1], orientation);
      }

      for (int i=1; i<4; i++) {
         Person person = new Person(period, i);
         coords = person.getLocation();
         orientation = person.getOrientation();
         System.out.printf("Person%d location: (%f, %f) in direction %f\n", i, coords[0], coords[1], orientation);
      }

      for (int i=1; i<4; i++) {
         Pet pet = new Pet(period, i);
         coords = pet.getLocation();
         orientation = pet.getOrientation();
         System.out.printf("Pet%d location: (%f, %f) in direction %f\n", i, coords[0], coords[1], orientation);
      }
   }
}
