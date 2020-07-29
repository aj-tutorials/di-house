package di.dagger.constuctorinjection;

import dagger.Module;
import dagger.Provides;
import javax.inject.Named;

@Module
public class AppModule {

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
