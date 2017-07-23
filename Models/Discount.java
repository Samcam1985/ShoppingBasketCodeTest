package Models;
import Interfaces.*;
public abstract class Discount implements Discountable{
  
   public abstract double discount(double price);
}