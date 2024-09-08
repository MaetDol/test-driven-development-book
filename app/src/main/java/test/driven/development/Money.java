package test.driven.development;

public abstract class Money {
  protected int amount;

  public boolean equals(Object d) {
    Money money = (Money)d;
    return amount == money.amount && 
      getClass().equals(money.getClass());
  }

  abstract Money times(int multiplier);

  static Dollar dollar(int amount) {
    return new Dollar(amount);
  }

  static Franc franc(int amount) {
    return new Franc(amount);
  }

}
