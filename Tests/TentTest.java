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
  public void hasSize() {
    assertEquals(8, tent.getSize());
  }
}
