package Models;
public abstract class Product {
protected String name;
protected double price;
protected String description;
protected String manufacturer;


public Product(String name, double price, String description, String manufacturer) {
  this.name = name;
  this.price = price;
  this.description = description;
  this.manufacturer = manufacturer;
}

}