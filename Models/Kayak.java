package Models;
public class Kayak extends Product{
  private Boolean hasPaddles;
  private int numberOfSeats;

  public Kayak(String name, double price, String description, String manufacturer, Boolean hasPaddles, int numberOfSeats){
    super(name, price, description, manufacturer);
    this.hasPaddles = hasPaddles;
    this.numberOfSeats = numberOfSeats;
  }
}