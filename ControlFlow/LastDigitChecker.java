package ControlFlow;

public class LastDigitChecker {
  public static boolean isValid(int number) {
    return number >= 10 && number <= 1000;
  }
  public static boolean hasSameLastDigit(int a, int b, int c) {
    if (!isValid(a) || !isValid(b) || !isValid(c)) {
      return false;
    }
    int aDigit = a % 10;
    int bDigit = b % 10;
    int cDigit = c % 10;
    return (aDigit == bDigit || aDigit == cDigit || bDigit == cDigit);
  }
}
