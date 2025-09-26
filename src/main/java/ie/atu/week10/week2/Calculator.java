package ie.atu.week10.week2;

public class Calculator {
  private int total;
  private String operation;

  public Calculator(int total, String operation) {
    this.total = total;
    this.operation = operation;
  }

  public int getTotal() {
    return total;
  }

  public String getOperation() {
    return operation;
  }
}