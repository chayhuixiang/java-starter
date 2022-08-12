package SecondSteps;

public class NumberToWords {
  // write your code here
  public static int getDigitCount(int number) {
    int count = 0;
    if (number < 0) {
        return -1;
    }
    if (number == 0) {
        return 1;
    }
    while (number > 0) {
        number /= 10;
        count++;
    }
    return count;
  }
  public static int reverse(int number) {
    int answer = 0;
    while (number != 0) {
        int digit = number % 10;
        number /= 10;
        answer = answer * 10 + digit;
    }
    return answer;
  }
  public static void numberToWords(int number) {
    if (number < 0) {
        System.out.println("Invalid Value");
    }
    int reversedNumber = reverse(number);
    int digitDiff = getDigitCount(number) - getDigitCount(reversedNumber);
    if (reversedNumber == 0) {
      System.out.println("Zero");
    }
    while (reversedNumber > 0) {
      int digit = reversedNumber % 10;
      reversedNumber /= 10;
      switch (digit) {
        case 0:
          System.out.println("Zero");
          break;
        
        case 1:
          System.out.println("One");
          break;

        case 2:
          System.out.println("Two");
          break;

        case 3:
          System.out.println("Three");
          break;

        case 4:
          System.out.println("Four");
          break;

        case 5:
          System.out.println("Five");
          break;

        case 6:
          System.out.println("Six");
          break;

        case 7:
          System.out.println("Seven");
          break;

        case 8:
          System.out.println("Eight");
          break;

        case 9:
          System.out.println("Nine");

        default:
          break;
      }
    } 
    for (int i = 0; i < digitDiff; i++) {
      System.out.println("Zero");
    }
  }
  public static void main(String[] args) {
    numberToWords(100);
    // System.out.println(reverse(100));
  }
}
