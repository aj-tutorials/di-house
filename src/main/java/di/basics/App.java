package di.basics;

public class App {

  public static void main(String[] args) {

    Sink bathroomSink = new BathroomSink();
    Sink kitchenSink = new KitchenSink();
    Stove stove = new Stove();
    Shower shower = new Shower();
    Bathroom bathroom = new Bathroom(bathroomSink, shower);
    Kitchen kitchen = new Kitchen(kitchenSink, stove);
    House house = new House(bathroom, kitchen);
  }
}

