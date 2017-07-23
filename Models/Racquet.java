package Models;
public class Racquet extends Product{
  private String type;
  private int numberOfStrings;

  public Racquet(String name, double price, String description, String manufacturer, Boolean hasBuyOneGetOneFree, String type, int numberOfStrings){
    super(name, price, description, manufacturer, hasBuyOneGetOneFree);
    this.type = type;
    this.numberOfStrings = numberOfStrings;
  
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

      public String getType() {
        return this.type;
      }

      public int getNumberOfStrings() {
        return this.numberOfStrings;
      }
          }

    
 