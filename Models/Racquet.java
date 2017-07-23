package Models;
public class Racquet extends Product{
  private String type;
  private int numberOfStrings;

  public Racquet(String name, double price, String description, String manufacturer, Boolean hasBuyOneGetOneFree, String type, int numberOfStrings){
    super(name, price, description, manufacturer, hasBuyOneGetOneFree);
    this.type = type;
    this.numberOfStrings = numberOfStrings;
  
  }

      public String getType() {
        return this.type;
      }

      public int getNumberOfStrings() {
        return this.numberOfStrings;
      }
          }

    
 