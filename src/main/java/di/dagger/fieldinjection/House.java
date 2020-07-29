package di.dagger.fieldinjection;

import com.google.inject.Inject;

public class House {
  @Inject
  private Bathroom bathroom;
  @Inject
  private Kitchen kitchen;

  public void print() {
    System.out.println(bathroom);
    System.out.println(kitchen);
  }
}
