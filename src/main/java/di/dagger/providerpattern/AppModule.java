package di.dagger.providerpattern;

import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;

@Module
public class AppModule {

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
