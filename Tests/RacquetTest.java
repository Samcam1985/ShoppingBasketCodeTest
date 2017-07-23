import static org.junit.Assert.*;
import org.junit.*;
import Models.*;
import Interfaces.*;

public class RacquetTest {
  Racquet racquet;
  

  @Before
  public void before(){
    racquet = new Racquet("Power Racquet", 50.00, "Suitable for Ages 12+", "Adidas", true, "Tennis Racquet", 36);
  }
  
  @Test
  public void hasName() {
    assertEquals("Power Racquet", racquet.getName());
  }

  @Test
  public void hasPrice() {
    assertEquals(50.00, racquet.getPrice(), 0);
  }

  @Test 
  public void hasDescription() {
    assertEquals("Suitable for Ages 12+", racquet.getDescription());
  }

 @Test
 public void hasManufacturer() {
  assertEquals("Adidas", racquet.getManufacturer());
 }

 @Test
 public void hasBuyOneGetOneFree() {
  assertEquals(true, racquet.getHasBuyOneGetOneFree());
 }

  @Test
  public void hasType() {
    assertEquals("Tennis Racquet", racquet.getType());
  }
  
  @Test
  public void hasNumberOfStrings() {
    assertEquals(36, racquet.getNumberOfStrings());
  }
}
