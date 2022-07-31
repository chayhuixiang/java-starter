package SecondSteps;
public class MinutesToYearsDaysCalculator {
  // write your code here
  public static void printYearsAndDays(long minutes) {
      if (minutes < 0) {
          System.out.println("Invalid Value");
      } else {
          long year = minutes / (60*24*365);
          long remainder = minutes % (60*24*365);
          long days = remainder / (60*24);
          System.out.println(minutes + " min = " + year + " y and " + days + " d");
      }
  }
}
