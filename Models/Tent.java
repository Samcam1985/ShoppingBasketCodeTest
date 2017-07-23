package Models;
public class Tent extends Product{
  private int size;

    public Tent(String name, double price, String description, String manufacturer, int size){
      super(name, price, description, manufacturer);
      this.size = size;
    
    }
  }



