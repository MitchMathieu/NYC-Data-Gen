import java.time.Instant;
import java.util.Random;

public abstract class Route {
   private double period;

   public Route() {
      this.period = 86400;
   }

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

   protected double[] randomPoint(double[][] triangle) {
      double[] v0 = triangle[0];
      double[] v1 = triangle[1];
      double[] v2 = triangle[2];

      double gamma;
      double alpha = 1;
      double beta = 1;

      while ((alpha + beta) > 1) {
         alpha = (double)(getRandom(99) + 1) / 100;
         beta = (double)(getRandom(99) + 1) / 100;
      }
      gamma = 1 - alpha - beta;

      double px = gamma*v0[0] + alpha*v1[0] + beta*v2[0];
      double py = gamma*v0[1] + alpha*v1[1] + beta*v2[1];
      double[] p = {px, py};
      return p;
   }

   public double getPeriod() {
      return period;
   }

   public void setPeriod(double period) {
      this.period = period;
   }
}
