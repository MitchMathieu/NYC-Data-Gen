public class RouteGenerator {
   public static void main(String[] args) {
      Route route = new Route(86400);
      System.out.println("Current position:");
      double[] coords = route.getLocation();
      System.out.printf("(%f, %f)\n", coords[0], coords[1]);
   }

}
