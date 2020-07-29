package di.dagger.constuctorinjection;

import javax.inject.Inject;

public class House {
  private final Bathroom bathroom;
  private final Kitchen kitchen;

  @Inject
  public House(Bathroom aBathroom, Kitchen aKitchen) {
    this.bathroom = aBathroom;
    this.kitchen = aKitchen;
  }
}
