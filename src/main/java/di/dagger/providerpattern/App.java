package di.dagger.providerpattern;

import di.dagger.fieldinjection.House;

public class App {
  public static void main(String[] args) {
    HouseComponentProviderPattern component = DaggerHouseComponentProviderPattern.create();
    House house = component.buildHouse();
  }
}

