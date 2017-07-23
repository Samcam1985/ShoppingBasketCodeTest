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
  public void hasName() {
    assertEquals("Bicycle", bike.getName());
  }

  @Test
  public void hasPrice() {
    assertEquals(99.99, bike.getPrice(), 0);
  }

  @Test 
  public void hasDescription() {
    assertEquals("Suitable for Ages 12+", bike.getDescription());
  }

 @Test
 public void hasManufacturer() {
  assertEquals("Raleigh", bike.getManufacturer());
 }

 @Test
 public void hasBuyOneGetOneFree() {
  assertEquals(false, bike.getHasBuyOneGetOneFree());
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