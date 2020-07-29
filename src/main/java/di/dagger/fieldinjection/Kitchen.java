package di.dagger.fieldinjection;

import javax.inject.Inject;
import javax.inject.Named;

public class Kitchen {
  @Inject @Named("Kitchen")
  Sink sink;
  @Inject
  Stove stove;
}
