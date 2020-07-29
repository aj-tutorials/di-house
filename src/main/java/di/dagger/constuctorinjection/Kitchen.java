package di.dagger.constuctorinjection;

import javax.inject.Inject;
import javax.inject.Named;

public class Kitchen {
  private final Sink sink;
  private final Stove stove;

  @Inject
  public Kitchen(@Named("Kitchen") Sink aSink, Stove aStove) {
    this.sink = aSink;
    this.stove = aStove;
  }
}
