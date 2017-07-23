package Models;
public class Bike extends Product{
  private String type;
  private int numberOfWheels;

  public Bike(String name, double price, String description, String manufacturer, Boolean hasBuyOneGetOneFree, String type, int numberOfWheels){
    super(name, price, description, manufacturer, hasBuyOneGetOneFree);
    this.type = type;
    this.numberOfWheels = numberOfWheels;
  }


  public String getType() {
    return this.type;
  }

  public int getNumberOfWheels() {
    return this.numberOfWheels;
  }


}