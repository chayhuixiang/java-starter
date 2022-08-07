package ControlFlow;

public class FirstLastDigitSum {
  public static int sumFirstAndLastDigit(int number) {
    int firstDigit = number % 10;
    int lastDigit = 0;
    while (number != 0) {
      lastDigit = number % 10;
      number /= 10;
    }
    int sum = firstDigit + lastDigit;
    return sum < 0 ? -1 : sum;
  }
  public static void main(String[] args) {
    System.out.println(sumFirstAndLastDigit(5));
  }
}
