package SecondSteps;

public class EqualSumChecker {
  public static boolean hasEqualSum(int one, int two, int three) {
    if (three == two + one) {
        return true;
    } else {
        return false;
    }
  }
}
