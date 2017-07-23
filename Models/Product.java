package Models;
public abstract class Product {
protected String name;
protected double price;
protected String description;
protected String manufacturer;
protected Boolean hasBuyOneGetOneFree;


public Product(String name, double price, String description, String manufacturer, Boolean hasBuyOneGetOneFree) {
  this.name = name;
  this.price = price;
  this.description = description;
  this.manufacturer = manufacturer;
  this.hasBuyOneGetOneFree = hasBuyOneGetOneFree;
}

}