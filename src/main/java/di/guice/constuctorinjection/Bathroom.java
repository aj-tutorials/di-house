package di.guice.constuctorinjection;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class Bathroom {
  private final Sink sink;
  private final Shower shower;

  @Inject
  public Bathroom(@Named("Bathroom") Sink aSink, Shower aShower) {
    this.sink = aSink;
    this.shower = aShower;
  }
}
