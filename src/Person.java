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
      System.out.println(percent);
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
      // asleep
      if (percent < 20)
         return home;
      // walking to the park
      else if (percent < 22.5)
         return getRouteCoordinate(walk, (percent%2.5) / 2.5, false);
      // at the park
      else if (percent < 27.5)
         return randomPoint(park);
      // walking home
      else if (percent < 30)
         return getRouteCoordinate(walk, (percent%2.5) / 2.5, true);
      // driving to work
      else if (percent < 40)
         return getRouteCoordinate(commute, (percent%10) / 10.0, false);
      // at work
      else if (percent < 70)
         return work;
      // driving home
      else if (percent < 80)
         return getRouteCoordinate(commute, (percent%10) / 10.0, true);
      // walking to the park
      else if (percent < 82.5)
         return getRouteCoordinate(walk, (percent%2.5) / 2.5, false);
      // at the park
      else if (percent < 87.5)
         return randomPoint(park);
      // walking home
      else if (percent < 90)
         return getRouteCoordinate(walk, (percent%2.5) / 2.5, true);
      // home for the night
      else
         return home;
   }

   public boolean isPet() {
      return pet;
   }

   public void setPet(boolean pet) {
      this.pet = pet;
   }
}
