package Models;
public class Bike extends Product{
  private String type;
  private int numberOfWheels;

  public Bike(String name, double price, String description, String manufacturer, String type, int numberOfWheels){
    super(name, price, description, manufacturer);
    this.type = type;
    this.numberOfWheels = numberOfWheels;
  }
}