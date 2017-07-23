package Models;
public class Tent extends Product{
  private int size;

    public Tent(String name, double price, String description, String manufacturer, Boolean hasBuyOneGetOneFree, int size){
      super(name, price, description, manufacturer, hasBuyOneGetOneFree);
      this.size = size;
    
    }

    public String getName() {
      return this.name;
    }

    public double getPrice() {
      return this.price;
    }

    public String getDescription() {
      return this.description;
    }

    public String getManufacturer() {
      return this.manufacturer;
    }

    public Boolean getHasBuyOneGetOneFree() {
      return this.hasBuyOneGetOneFree;
    }

    public int getSize() {
      return this.size;
    }


      

    
  }



