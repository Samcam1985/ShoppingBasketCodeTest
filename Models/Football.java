package Models;
public class Football extends Product{
  private int size;
  private String type;

  public Football (String name, double price, String description, String manufacturer, Boolean hasBuyOneGetOneFree, int size, String type){
    super(name, price, description, manufacturer, hasBuyOneGetOneFree);
    this.size = size;
    this.type = type;
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

  public String getType() {
    return this.type;
  }

}