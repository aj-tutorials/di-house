package di.dagger.fieldinjection;

import dagger.Component;

@Component(modules = AppModule.class)
public interface HouseComponentFieldInjection {
  House buildHouse();
}
