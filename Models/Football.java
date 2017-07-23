package Models;
public class Football extends Product{
  private int size;
  private String type;

  public Football (String name, double price, String description, String manufacturer, int size, String type){
    super(name, price, description, manufacturer);
    this.size = size;
    this.type = type;
  }
}