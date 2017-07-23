package Models;
public class Football extends Product{
  private int size;
  private String type;

  public Football (String name, double price, String description, String manufacturer, Boolean hasBuyOneGetOneFree, int size, String type){
    super(name, price, description, manufacturer, hasBuyOneGetOneFree);
    this.size = size;
    this.type = type;
  }
}