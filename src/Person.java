public class Person extends Residential {

   private boolean pet;

   public Person() {
      super();
      init();
   }

   public Person(double period) {
      super(period);
      init();
   }

   public Person(double period, int location) {
      super(period, location);
      init();
   }

   private void init() {
      int rand = getRandom(2);
      if (rand == 0)
         pet = true;
      else
         pet = false;
   }

   public double[] getLocation() {
      double percent = getPeriodPercent();
      if (pet)
         return getLocationWithPet(percent);

      if (percent < 30)
         return home;
      else if (percent < 40)
         return getRouteCoordinate(commute, (percent%10) / 10.0, false);
      else if (percent < 70)
         return work;
      else if (percent < 80)
         return getRouteCoordinate(commute, (percent%10) / 10.0, true);
      else
         return home;
   }

   private double[] getLocationWithPet(double percent) {
      if (percent < 20)
         return home;
      else if (percent < 22.5)
         return getRouteCoordinate(walk, (percent%2.5) / 2.5, false);
      else if (percent < 27.5)
         return randomPoint(park);
      else if (percent < 30)
         return getRouteCoordinate(walk, (percent%2.5) / 2.5, true);
      else if (percent < 80)
         return home;
      else if (percent < 82.5)
         return getRouteCoordinate(walk, (percent%2.5) / 2.5, false);
      else if (percent < 87.5)
         return randomPoint(park);
      else if (percent < 90)
         return getRouteCoordinate(walk, (percent%2.5) / 2.5, true);
      else
         return home;
   }
}
