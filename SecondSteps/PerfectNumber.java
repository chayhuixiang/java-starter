package SecondSteps;

public class PerfectNumber {
  // write your code here
  public static boolean isPerfectNumber(int number) {
      int sum = 0;
      for (int i = 1; i < number; i++) {
          if (number % i == 0) {
              sum += i;
          }
      }
      if (number == 0) {
          return false;
      }
      return sum == number;
  }
}
