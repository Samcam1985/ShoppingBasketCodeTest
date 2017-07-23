package Models;
public class Racquet extends Product{
  private String type;
  private int numberOfStrings;

  public Racquet(String name, double price, String description, String manufacturer, String type, int numberOfStrings){
    super(name, price, description, manufacturer);
    this.type = type;
    this.numberOfStrings = numberOfStrings;
  
  }
}