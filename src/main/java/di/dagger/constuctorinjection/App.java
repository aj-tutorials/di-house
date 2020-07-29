package di.dagger.constuctorinjection;

public class App {

  public static void main(String[] args) {
    HouseComponentConstructorInjection component =
        DaggerHouseComponentConstructorInjection.create();
    House house = component.buildHouse();
  }
}

