package Models;
import Interfaces.*;
public class BuyOneGetOneFree extends Discount{

  public BuyOneGetOneFree()
  {
  }

  public Boolean CheckBuyOneGetOneFree(Product product) {
    return product.hasBuyOneGetOneFree;
  }
  
   @Override
   public double discount(double price)
   {
       return 0;
   }
}