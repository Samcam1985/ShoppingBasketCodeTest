import static org.junit.Assert.*;
import org.junit.*;
import Models.*;
import Interfaces.*;

public class FootballTest {
  Football football;
  

  @Before
  public void before(){
    football = new Football("Football", 15.49, "Suitable for Ages 7+", "Nike", true, 5, "Indoor");
  }
 
  @Test
  public void hasSize() {
    assertEquals(5, football.getSize());
  }
  
  @Test
  public void hasType() {
    assertEquals("Indoor", football.getType());
  }

  
  }