package Interfaces;
import Models.*;

public interface Buyable {
void add(Product product);
void remove(Product product);
void empty();
double totalValue();
}