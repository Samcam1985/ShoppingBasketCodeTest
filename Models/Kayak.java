package Models;
public class Kayak extends Product{
  private Boolean hasPaddles;
  private int numberOfSeats;

  public Kayak(String name, double price, String description, String manufacturer, Boolean hasBuyOneGetOneFree, Boolean hasPaddles, int numberOfSeats){
    super(name, price, description, manufacturer, hasBuyOneGetOneFree);
    this.hasPaddles = hasPaddles;
    this.numberOfSeats = numberOfSeats;
  }


    public Boolean getHasPaddles() {
      return this.hasPaddles;
    }

    public int getNumberOfSeats() {
      return this.numberOfSeats;
    }

  
}