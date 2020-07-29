package di.dagger.fieldinjection;

import javax.inject.Inject;

public class House {
  @Inject
  Bathroom bathroom;
  @Inject
  Kitchen kitchen;

  public void print() {
    System.out.println(bathroom);
    System.out.println(kitchen);
  }
}
