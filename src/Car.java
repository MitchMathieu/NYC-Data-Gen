public class Car extends Residential {

   public Car() {
      super();
   }

   public Car(double period) {
      super(period);
   }

   public Car(double period, int location) {
      super(period, location);
   }

   public double[] getLocation() {
      double percent = getPeriodPercent();
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
}
