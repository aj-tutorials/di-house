package di.guice.constuctorinjection;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class Kitchen {
  private final Sink sink;
  private final Stove stove;

  @Inject
  public Kitchen(@Named("Kitchen") Sink aSink, Stove aStove) {
    this.sink = aSink;
    this.stove = aStove;
  }
}
