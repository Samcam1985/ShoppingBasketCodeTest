import static org.junit.Assert.*;
import org.junit.*;
import Models.*;
import Interfaces.*;

public class TentTest {
  Tent tent;
  

  @Before
  public void before(){
    tent = new Tent("8 Man Tent", 250.00, "Suitable for Ages 18+", "Regatta", false, 8);
  }
  
  @Test
  public void hasName() {
    assertEquals("8 Man Tent", tent.getName());
  }

  @Test
  public void hasPrice() {
    assertEquals(250.00, tent.getPrice(), 0);
  }

  @Test 
  public void hasDescription() {
    assertEquals("Suitable for Ages 18+", tent.getDescription());
  }

 @Test
 public void hasManufacturer() {
  assertEquals("Regatta", tent.getManufacturer());
 }

 @Test
 public void hasBuyOneGetOneFree() {
  assertEquals(false, tent.getHasBuyOneGetOneFree());
 }

  @Test
  public void hasSize() {
    assertEquals(8, tent.getSize());
  }
}
