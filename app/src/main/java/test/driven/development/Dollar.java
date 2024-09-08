package test.driven.development;

public class Dollar extends Money {

  Dollar(int amount) {
    this.amount = amount;
  };

  public Money times(int multiple) {
     return new Dollar(amount * multiple);
  }
}
