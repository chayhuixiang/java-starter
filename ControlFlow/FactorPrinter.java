package ControlFlow;

public class FactorPrinter {
  // write your code here
  public static void printFactors(int number) {
      if (number < 1) {
          System.out.println("Invalid Value");
      }
      int count = 1;
      while (count <= number) {
          if (number % count == 0) {
              System.out.println(count);
          }
          count++;
      }
  }
}