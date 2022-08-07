package ControlFlow;

public class NumberPalindrome {
  public static boolean isPalindrome(int number) {
    number = number < 0 ? -number : number;
    String numberString = Integer.toString(number);
    String reversedString = "";
    for (int i = 0; i < numberString.length(); i++) {
      char character = numberString.charAt(i);
      reversedString = character + reversedString;
    }
    System.out.println(reversedString + " " + numberString);
    return reversedString.equals(numberString);
  }
  public static void main(String[] args) {
    // System.out.println(isPalindrome(7007));
    // System.out.println(isPalindrome(1001));
    // System.out.println(isPalindrome(20));
    System.out.println(isPalindrome(-1221));
  }
}
