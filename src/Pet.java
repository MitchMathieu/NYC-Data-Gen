public class Pet extends Residential {

   public Pet() {
      super();
   }

   public Pet(double period) {
      super(period);
   }

   public Pet(double period, int location) {
      super(period, location);
   }

   public double[] getLocation() {
      double percent = getPeriodPercent();
      System.out.printf("Period percent: %f\n", getPeriodPercent());

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
