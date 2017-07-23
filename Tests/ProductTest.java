import static org.junit.Assert.*;
import org.junit.*;
import Models.*;
import Interfaces.*;

public class ProductTest {
  Product product;
  

  @Before
  public void before(){
    product = new Football("Football", 18.49, "Suitable for Ages 10+", "Nike", true, 5, "Outdoor");
  }
  
  @Test
  public void hasName() {
    assertEquals("Football", product.getName());
  }

  @Test
  public void hasPrice() {
    assertEquals(18.49, product.getPrice(), 0);
  }

  @Test 
  public void hasDescription() {
    assertEquals("Suitable for Ages 10+", product.getDescription());
  }

 @Test
 public void hasManufacturer() {
  assertEquals("Nike", product.getManufacturer());
 }

 @Test
 public void hasBuyOneGetOneFree() {
  assertEquals(true, product.getHasBuyOneGetOneFree());
 }



  
  }