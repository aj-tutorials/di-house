package di.dagger.constuctorinjection;

import dagger.Component;

@Component(modules = AppModule.class)
public interface HouseComponent {
  House buildHouse();
}
