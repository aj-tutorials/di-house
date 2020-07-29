package di.dagger.fieldinjection;

import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = AppModule.class)
public interface HouseComponentFieldInjection {
  House buildHouse();
}
