package OOPOne;

public class Calculator {
  // write your code here
  private Floor floor;
  private Carpet carpet;
  
  public Calculator(Floor floor, Carpet carpet) {
      this.floor = floor;
      this.carpet = carpet;
  }
  
  public double getTotalCost() {
      return this.floor.getArea() * this.carpet.getCost();
  }
}
