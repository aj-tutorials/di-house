package di.basics;

public class Bathroom {
  private final Sink sink;
  private final Shower shower;

  public Bathroom(Sink aSink, Shower aShower) {
    this.sink = aSink;
    this.shower = aShower;
  }
}
