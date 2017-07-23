package Models;
public class Tent extends Product{
  private int size;

    public Tent(String name, double price, String description, String manufacturer, Boolean hasBuyOneGetOneFree, int size){
      super(name, price, description, manufacturer, hasBuyOneGetOneFree);
      this.size = size;
    
    }
  }



