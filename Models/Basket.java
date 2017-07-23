package Models;
import Interfaces.*;
import java.util.ArrayList;

public class Basket implements Buyable{
  private ArrayList<Product> products;
  private ArrayList<Discountable> discounts;
  private double totalValue = 0;

  public Basket() {
    this.products = new ArrayList<Product>();
  }

  public void add(Product product) {
    this.products.add(product);
  }

  public int countProducts() {
    return this.products.size();
  }

  public void remove(Product product) {
    this.products.remove(product);
  }

  public void empty(){
    this.products.clear();
  }

  public double totalValue() {  
    
    for (Product product : products) {   
      totalValue += product.price;        
    }

    if(totalValue > 20)
    {
       TenPercentDiscountOverTwenty tenPercentDiscountOverTwenty = new TenPercentDiscountOverTwenty();
        totalValue = applyDiscount(tenPercentDiscountOverTwenty);
    }

    return totalValue;
  }


  public double applyDiscount(Discount discount)
  {
      return discount.discount(totalValue);
  }

  }
