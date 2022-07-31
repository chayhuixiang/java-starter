package FirstSteps;

public class Challenge {
  public static void main(String[] args) {
    double firstVar = 20.00d;
    double secondVar = 80.00d;
    double sum = (firstVar + secondVar)*100.00;
    double remainder = sum%40.00;

    boolean isZero = remainder == 0;
    System.out.println("isZero: "+isZero);

    if (!isZero) {
      System.out.println("Got some remainder");
    }
  }
}
