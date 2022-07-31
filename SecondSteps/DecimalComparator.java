package SecondSteps;

public class DecimalComparator{
  public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secNum) {
    int adjustedFirstNum = (int)(firstNum * 1000);
    int adjustedSecNum = (int)(secNum * 1000);
    
    if (adjustedFirstNum == adjustedSecNum) {
        return true;
    } else {
        return false;
    }
  }
}
