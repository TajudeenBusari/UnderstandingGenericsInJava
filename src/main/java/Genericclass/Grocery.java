package Genericclass;

public class Grocery {

  private String item;

  public Grocery(String item) {
    this.item = item;
  }

  @Override
  public String toString() {
    return "Grocery: " + item;
  }
}
