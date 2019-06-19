public class Pet extends Route {
   private final double[][] WALK1 = {{40.72283, -74.0097}, {40.72276, -74.00971}, {40.72218, -74.00981}, {40.72211, -74.00983}, {40.7215, -74.00994}, {40.72143, -74.00996}, {40.72112, -74.01001}, {40.72077, -74.01007}, {40.72031, -74.01015}, {40.72015, -74.01017}, {40.72007, -74.01018}, {40.7198, -74.01023}, {40.71945, -74.01029}, {40.71917, -74.01034}, {40.71885, -74.01039}, {40.71877, -74.0104}, {40.71846, -74.01046}, {40.71812, -74.01053}, {40.71751, -74.01067}};
   private final double[][] WALK2 = {{40.61213, -74.03438}, {40.61215, -74.03437}, {40.61216, -74.03434}, {40.61217, -74.0343}, {40.61218, -74.03427}, {40.61229, -74.03418}, {40.61235, -74.03413}, {40.61282, -74.03372}, {40.61288, -74.03367}, {40.61339, -74.03323}, {40.61345, -74.03318}, {40.614, -74.0327}, {40.61415, -74.03301}, {40.61419, -74.03308}, {40.61458, -74.03387}, {40.61491, -74.03452}, {40.61495, -74.0346}, {40.61498, -74.03468}, {40.615, -74.03471}, {40.61503, -74.03473}, {40.61506, -74.03476}, {40.61509, -74.03478}, {40.61515, -74.03481}, {40.61534, -74.03493}, {40.6154, -74.03496}, {40.61598, -74.03531}, {40.61604, -74.03535}, {40.61619, -74.03543}, {40.61663, -74.03571}, {40.61669, -74.03575}, {40.61707, -74.03598}, {40.61723, -74.03609}, {40.61727, -74.03611}, {40.61734, -74.03615}, {40.61768, -74.03635}, {40.61794, -74.03651}, {40.61795, -74.03652}, {40.61801, -74.03656}, {40.61862, -74.03692}, {40.61868, -74.03696}, {40.61883, -74.03705}, {40.61926, -74.03732}, {40.61933, -74.03736}, {40.6197, -74.03759}, {40.61991, -74.03772}, {40.61997, -74.03776}, {40.62057, -74.03813}, {40.62064, -74.03813}, {40.62107, -74.03798}, {40.62125, -74.03791}, {40.62132, -74.03788}, {40.62194, -74.03761}, {40.62263, -74.03734}, {40.62269, -74.03731}, {40.62331, -74.03707}, {40.62338, -74.03704}, {40.62398, -74.03678}, {40.62405, -74.03675}, {40.62471, -74.0365}, {40.62478, -74.03647}, {40.62522, -74.03628}, {40.62529, -74.03626}, {40.62558, -74.03614}, {40.62559, -74.03621}, {40.62561, -74.03626}, {40.62575, -74.03682}, {40.62595, -74.03766}};
   private final double[][] WALK3 = null;
   private final double[][] PARK1 = {{40.716834, -74.011730}, {40.717559, -74.011667}, {40.717476, -74.010817}};
   private final double[][] PARK2 = {{40.626298, -74.038696}, {40.627283, -74.037179}, {40.625834, -74.036707}};
   private final double[][] PARK3 = null;

   private double[] home;
   private double[][] walk;
   private double[][] park;

   public Pet(double period, int location) {
      super(period);
      init(location);
      this.home = walk[0];
   }

   private void init(int location) {
      switch (location) {
         case 1:
            this.walk = WALK1;
            this.park = PARK1;
            break;
         case 2:
            this.walk = WALK2;
            this.park = PARK2;
            break;
      }
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

   private double[] randomPoint(double[][] triangle) {
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

   public double[] getHome() {
      return home;
   }

   public void setHome(double[] home) {
      this.home = home;
   }

   public double[][] getWalk() {
      return walk;
   }

   public void setWalk(double[][] walk) {
      this.walk = walk;
   }

   public double[][] getPark() {
      return park;
   }

   public void setPark(double[][] park) {
      this.park = park;
   }
}
