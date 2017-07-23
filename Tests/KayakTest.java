import static org.junit.Assert.*;
import org.junit.*;
import Models.*;
import Interfaces.*;

public class KayakTest {
  Kayak kayak;
  

  @Before
  public void before(){
    kayak = new Kayak("Kayak", 300.00, "Suitable for Ages 18+", "Sevylor", false, true, 2);
  }
  
  @Test
  public void hasName() {
    assertEquals("Kayak", kayak.getName());
  }

  @Test
  public void hasPrice() {
    assertEquals(300.00, kayak.getPrice(), 0);
  }

  @Test 
  public void hasDescription() {
    assertEquals("Suitable for Ages 18+", kayak.getDescription());
  }

 @Test
 public void hasManufacturer() {
  assertEquals("Sevylor", kayak.getManufacturer());
 }

 @Test
 public void hasBuyOneGetOneFree() {
  assertEquals(false, kayak.getHasBuyOneGetOneFree());
 }

  @Test
  public void hasHasPaddles() {
    assertEquals(true, kayak.getHasPaddles());
  }
  
  @Test
  public void hasNumberOfSeats() {
    assertEquals(2, kayak.getNumberOfSeats());
  }

  
  }