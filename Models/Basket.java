package Models;
import Interfaces.*;
import java.util.ArrayList;

public class Basket implements Buyable{
  private ArrayList<Product> products;

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
    double totalValue = 0;
    for (Product product : products) {   
      totalValue += product.price;        
    }
    return totalValue;

  }
}