import java.time.Instant;
import java.util.Random;
import java.lang.Math;

public abstract class Route {
   private double period;
   private double orientation;

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
      double[] coords;
      int index;

      if (!reverse) {
         index = (int) (route.length * percent);
         coords = route[index];
         setOrientation(getOrientationDegrees(route, index,false));
      } else {
         index = (int) (route.length * (1.0 - percent));
         coords = route[index];
         setOrientation(getOrientationDegrees(route, index, true));
      }
      return coords;
   }

   private double getOrientationDegrees(double[][] route, int index, boolean reverse) {
      if (!reverse) {
         if (route[index+1] != null)
            return getOrientationDegrees(route[index], route[index+1]);
         else
            return getOrientationDegrees(route[index-1], route[index]);
      } else {
         if (route[index-1] != null)
            return getOrientationDegrees(route[index], route[index-1]);
         else
            return getOrientationDegrees(route[index+1], route[index]);
      }
   }

   private double getOrientationDegrees(double[] startPoint, double[] endPoint) {
      double lat1 = startPoint[0];
      double lon1 = startPoint[1];
      double lat2 = endPoint[0];
      double lon2 = endPoint[1];

      double radians = Math.atan2((lat2-lat1), (lon2-lon1));

      return convertRadiansToDegrees(radians);
   }

   private double convertRadiansToDegrees(double radians) {
      // convert radians to degrees
      double degrees = radians * (180 / Math.PI);

      // convert range from (-pi, pi) to (0, 360)
      if (degrees > 0)
         degrees = 360 - degrees;
      else
         degrees = (-1) * degrees;

      // rotate orientation so 0 = north, 90 = east, etc.
      degrees = (degrees + 90) % 360;

      return degrees;
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

   public double getOrientation() {
      return orientation;
   }

   public void setOrientation(double orientation) {
      this.orientation = orientation;
   }
}
