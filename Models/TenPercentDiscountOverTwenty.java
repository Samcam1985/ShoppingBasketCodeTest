package Models;
import Interfaces.*;
public class TenPercentDiscountOverTwenty extends Discount{

  public TenPercentDiscountOverTwenty()
  {
  }

  @Override
  public double discount(double price)
  {
      return price - (price / 10);
  }
}