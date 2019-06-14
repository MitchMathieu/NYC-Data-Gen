public class RouteGenerator {
   public static void main(String[] args) {
      System.out.println("Hello RouteGenerator!");
      Route route = new Route("res-work-route-3.csv", 86400);
      System.out.println(route.getCoords());
      System.out.println("Current position (csv):");
      System.out.println(route.getLocation());
      System.out.println("Current position (HC):");
      for (double d:route.getHCLocation())
         System.out.printf("%f ", d);
   }

}
