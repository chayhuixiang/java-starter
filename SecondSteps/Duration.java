package SecondSteps;

public class Duration {
  public static String getDurationString(int minutes, int seconds) {
    if (minutes < 0 || seconds < 0 || seconds > 59) {
      return "Invalid value";
    }
    int hours = minutes / 60;
    int remainderMins = minutes % 60;
    return hours + "h " + remainderMins + "m " + seconds + "s";
  }

  public static String getDurationString(int seconds) {
    if (seconds < 0) {
      return "Invalid value";
    }
    int hours = seconds / 3600;
    int remainderSecs = seconds % 3600;
    int minutes = remainderSecs / 60;
    int secs = remainderSecs % 60;
    return hours + "h " + minutes + "m " + secs + "s";
  }

  public static void main(String[] args) {
    System.out.println(getDurationString(123213, 12));
    System.out.println(getDurationString(123213));
  }
}
