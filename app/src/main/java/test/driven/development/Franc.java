package test.driven.development;

public class Franc extends Money {

  Franc(int amount) {
    this.amount = amount;
  };

  public Money times(int multiple) {
     return new Franc(amount * multiple);
  }
}
