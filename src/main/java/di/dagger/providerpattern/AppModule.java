package di.dagger.providerpattern;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

public class AppModule extends AbstractModule {

  @Override
  public void configure() { }

  @Provides
  @Named("Bathroom")
  public Sink provideBathroomSink() {
    return new BathroomSink();
  }

  @Provides
  @Named("Kitchen")
  @Singleton
  public Sink provideKitchenSink() {
    return new KitchenSink();
  }

  @Provides
  public Stove provideStove() {
    return new Stove();
  }

  @Provides
  public Shower provideShower() {
    return new Shower();
  }
  
  @Provides
  public Kitchen provideKitchen(@Named("Kitchen") Sink aSink, Stove aStove) {
    return new Kitchen(aSink, aStove);
  }

  @Provides
  public Bathroom provideBathroom(@Named("Bathroom") Sink aSink, Shower aShower) {
    return new Bathroom(aSink, aShower);
  }

  @Provides
  public House provideHouse(Bathroom aBathroom, Kitchen aKitchen) {
    return new House(aBathroom, aKitchen);
  }
}
