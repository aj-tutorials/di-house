package di.guice.providerpattern;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;

public class AppModule extends AbstractModule {

  @Override
  protected void configure() { }

  @Provides
  @Named("Bathroom")
  protected Sink provideBathroomSink() {
    return new BathroomSink();
  }

  @Provides
  @Named("Kitchen")
  protected Sink provideKitchenSink() {
    return new KitchenSink();
  }

  @Provides
  protected Stove provideStove() {
    return new Stove();
  }

  @Provides
  protected Shower provideShower() {
    return new Shower();
  }
  
  @Provides
  protected Kitchen provideKitchen(@Named("Kitchen") Sink aSink, Stove aStove) {
    return new Kitchen(aSink, aStove);
  }

  @Provides
  protected Bathroom provideBathroom(@Named("Bathroom") Sink aSink, Shower aShower) {
    return new Bathroom(aSink, aShower);
  }

  @Provides
  protected House provideHouse(Bathroom aBathroom, Kitchen aKitchen) {
    return new House(aBathroom, aKitchen);
  }
}
