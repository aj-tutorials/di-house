package di.basics;

public class Kitchen {
  private final Sink sink;
  private final Stove stove;

  public Kitchen(Sink aSink, Stove aStove) {
    this.sink = aSink;
    this.stove = aStove;
  }
}
