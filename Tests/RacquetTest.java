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
  public void hasType() {
    assertEquals("Tennis Racquet", racquet.getType());
  }
  
  @Test
  public void hasNumberOfStrings() {
    assertEquals(36, racquet.getNumberOfStrings());
  }
}
