package di.dagger.fieldinjection;

import javax.inject.Inject;
import javax.inject.Named;

public class Bathroom {
  @Inject @Named("Bathroom")
  Sink sink;
  @Inject
  Shower shower;
}
