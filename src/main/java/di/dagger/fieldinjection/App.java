package di.dagger.fieldinjection;

public class App {
  public static void main(String[] args) {
    HouseComponentFieldInjection component = DaggerHouseComponentFieldInjection.create();
    House house = component.buildHouse();
  }
}

