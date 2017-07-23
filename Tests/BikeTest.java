import static org.junit.Assert.*;
import org.junit.*;
import Models.*;
import Interfaces.*;

public class BikeTest {
  Bike bike;
  

  @Before
  public void before(){
    bike = new Bike("Bicycle", 99.99, "Suitable for Ages 12+", "Raleigh", false, "Mountain", 2);
  }
  

  @Test
  public void hasType() {
    assertEquals("Mountain", bike.getType());
  }
  
  @Test
  public void hasNumberOfWheels() {
    assertEquals(2, bike.getNumberOfWheels());
  }

  
  }