package FirstSteps;

public class IntegerWrapper {
  public static void main(String[] args) {
    int myMinValue = Integer.MIN_VALUE;
    int myMaxValue = Integer.MAX_VALUE;
    System.out.println("myMinValue (32bits): " + myMinValue);
    System.out.println("myMaxValue (32bits): " + myMaxValue);
    System.out.println("Busted MAX value = " + (myMaxValue + 1));

    byte myMinByteValue = Byte.MIN_VALUE;
    byte myMaxByteValue = Byte.MAX_VALUE;
    System.out.println("Byte Minimum Value (8bits): " + myMinByteValue);
    System.out.println("Byte Maximum Value (8bits): " + myMaxByteValue);

    Short myMinShortValue = Short.MIN_VALUE;
    Short myMaxShortValue = Short.MAX_VALUE;
    System.out.println("Short Minimum Value (16bits): " + myMinShortValue);
    System.out.println("Short Maximum Value (16bits): " + myMaxShortValue);

    Long myMinLongValue = Long.MIN_VALUE;
    Long myMaxLongValue = Long.MAX_VALUE;
    System.out.println("Long Minimum Value (64bits): " + myMinLongValue);
    System.out.println("Long Maximum Value (64bits): " + myMaxLongValue);

    Long testLong = 100L;
    System.out.println("Test Long: " + testLong);
  }
}
