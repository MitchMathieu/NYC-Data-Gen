import java.time.Instant;
import java.util.Random;

public abstract class Route {
   // the possible parent class for res-car and subway
   private double period;


   public Route(double period) {
      this.period = period;

   }

   protected double getPeriodPercent() {
      return (Instant.now().getEpochSecond() % period) / period * 100;
   }

   protected int getRandom(int range) {
      Random rand = new Random();
      return rand.nextInt(range);
   }

   protected double[] getRouteCoordinate (double[][] route, double percent, boolean reverse) {
      if (!reverse)
         return route[(int)(route.length*percent)];
      else
         return route[(int)(route.length*(1.0 - percent))];
   }

   public double getPeriod() {
      return period;
   }

   public void setPeriod(double period) {
      this.period = period;
   }
}
