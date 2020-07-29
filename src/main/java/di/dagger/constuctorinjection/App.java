package di.dagger.constuctorinjection;

public class App {

  public static void main(String[] args) {
    HouseComponent component = DaggerHouseComponent.create();
    House house = component.buildHouse();
  }
}

