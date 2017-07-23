import static org.junit.Assert.*;
import org.junit.*;
import Models.*;
import Interfaces.*;

public class DiscountTest {
  TenPercentDiscountOverTwenty discount;

  @Before
  public void before(){
    discount = new TenPercentDiscountOverTwenty();
  }

  @Test
  public void discountTenPercentOverTwenty()
  {
    assertEquals(36, discount.discount(40), 0);
  }
}