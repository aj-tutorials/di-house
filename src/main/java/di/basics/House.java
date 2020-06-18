package di.basics;

public class House {
  private final Bathroom bathroom;
  private final Kitchen kitchen;

  public House(Bathroom aBathroom, Kitchen aKitchen) {
    this.bathroom = aBathroom;
    this.kitchen = aKitchen;
  }
}
