package di.guice.fieldinjection;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class AppModule extends AbstractModule {

  @Override
  public void configure() {
    bind(Sink.class).annotatedWith(Names.named("Kitchen")).to(KitchenSink.class);
    bind(Sink.class).annotatedWith(Names.named("Bathroom")).to(BathroomSink.class);
  }
}
