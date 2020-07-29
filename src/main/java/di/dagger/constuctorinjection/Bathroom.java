package di.dagger.constuctorinjection;

import javax.inject.Inject;
import javax.inject.Named;

public class Bathroom {
  private final Sink sink;
  private final Shower shower;

  @Inject
  public Bathroom(@Named("Bathroom") Sink aSink, Shower aShower) {
    this.sink = aSink;
    this.shower = aShower;
  }
}
