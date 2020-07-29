package di.dagger.constuctorinjection;

import dagger.Component;

@Component(modules = AppModule.class)
public interface HouseComponentConstructorInjection {
  House buildHouse();
}
