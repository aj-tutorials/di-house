package di.dagger.providerpattern;

import dagger.Component;
import di.dagger.fieldinjection.AppModule;
import di.dagger.fieldinjection.House;
import javax.inject.Singleton;

@Singleton
@Component(modules = AppModule.class)
public interface HouseComponentProviderPattern {
  House buildHouse();
}
