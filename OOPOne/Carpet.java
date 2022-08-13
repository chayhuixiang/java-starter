package OOPOne;

public class Carpet {
  // write your code here
  private double cost;
  public Carpet(double cost) {
      this.cost = cost < 0 ? 0 : cost;
  }
  public double getCost() {
      return this.cost;
  }
}
