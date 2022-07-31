package SecondSteps;

public class SpeedConverter {
  // write your code here
  public static long toMilesPerHour(double kilometersPerHour) {
      if (kilometersPerHour < 0) {
          return -1L;
      } else {
          return (long)Math.round(kilometersPerHour / 1.609);
      }
  }
  
  public static void printConversion(double kilometersPerHour) {
      long value = toMilesPerHour(kilometersPerHour);
      if (value < 0) {
          System.out.println("Invalid Value");
      } else {
          System.out.println(kilometersPerHour + " km/h = " + value + " mi/h");
      }
  }
}
