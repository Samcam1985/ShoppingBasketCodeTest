package Models;
public class Bike extends Product{
  private String type;
  private int numberOfWheels;

  public Bike(String name, double price, String description, String manufacturer, Boolean hasBuyOneGetOneFree, String type, int numberOfWheels){
    super(name, price, description, manufacturer, hasBuyOneGetOneFree);
    this.type = type;
    this.numberOfWheels = numberOfWheels;
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

  public int getNumberOfWheels() {
    return this.numberOfWheels;
  }


}