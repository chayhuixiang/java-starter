package ControlFlow;

public class SharedDigit {
  public static boolean hasSharedDigit(int a, int b) {
    if (a < 10 || b < 10 || a > 99 || b > 99) {
      return false;
    }
    if (a/10 == b/10 || a/10 == b%10 || a%10 == b/10 || a%10 == b%10) {
      return true;
    } else return false;
  }
  public static void main(String[] args) {
    boolean result = hasSharedDigit(11, 32);
    System.out.println(result);
  }
}
