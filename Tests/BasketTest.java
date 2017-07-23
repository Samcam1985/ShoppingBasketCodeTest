import static org.junit.Assert.*;
import org.junit.*;
import Models.*;
import Interfaces.*;

public class BasketTest {
  Basket basket;
  Product product;

  @Before
  public void before(){
    basket = new Basket();
    product = new Football("Football", 7.99, "Suitable for ages 3 and over", "Nike", 5, "Indoor");
  }

  @Test
  public void add() {
    basket.add(product);
    assertEquals(1, basket.countProducts());
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
}