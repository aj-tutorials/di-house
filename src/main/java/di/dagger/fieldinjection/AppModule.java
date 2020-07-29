package di.dagger.fieldinjection;

import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;

@Module
public class AppModule {

  @Provides
  @Singleton
  public House provideHouse() {
    return new House();
  }

  @Provides
  @Named("Bathroom")
  public Sink provideBathroomSink() {
    return new BathroomSink();
  }

  @Provides
  @Named("Kitchen")
  public Sink provideKitchenSink() {
    return new KitchenSink();
  }
}
