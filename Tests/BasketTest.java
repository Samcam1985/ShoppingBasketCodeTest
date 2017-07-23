import static org.junit.Assert.*;
import org.junit.*;
import Models.*;
import Interfaces.*;

public class BasketTest {
  Basket basket;
  Product product;
  Product productOver20;
  Product productBuyOneGetOneFree;

  @Before
  public void before(){
    basket = new Basket();
    product = new Football("Football", 7.99, "Suitable for ages 3 and over", "Nike", false, 5, "Indoor");
    productOver20 = new Football ("Football", 40.00, "Suitable for ages 3 and over", "Nike", false, 5, "Indoor");
    productBuyOneGetOneFree = new Football ("Football", 40.00, "Suitable for ages 3 and over", "Nike", true, 5, "Indoor");


  }

  @Test
  public void addProductNotOnBuyOneGetOneFree() {
    basket.add(product);
    assertEquals(1, basket.countProducts());
  }

  @Test
  public void addProductOnBuyOneGetOneFree() {
    basket.add(productBuyOneGetOneFree);
    assertEquals(2, basket.countProducts());
  }

  @Test
  public void remove() {
    basket.add(product);
    basket.add(product);
    basket.remove(product);
    assertEquals(1, basket.countProducts());

  }

  @Test 
  public void empty() {
    basket.add(product);
    basket.empty();
    assertEquals(0, basket.countProducts());
  }

  @Test
  public void totalValue() {
    basket.add(product);
    assertEquals(7.99, basket.totalValue(), 0);
  }

  @Test
  public void applyDiscount() {
    basket.add(productOver20);
    TenPercentDiscountOverTwenty tenPercentDiscountOverTwenty = new TenPercentDiscountOverTwenty();
    basket.applyDiscount(tenPercentDiscountOverTwenty);
    
  }
}