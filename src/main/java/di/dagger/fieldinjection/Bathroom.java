package di.dagger.fieldinjection;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class Bathroom {
  @Inject @Named("Bathroom")
  private Sink sink;
  @Inject
  private Shower shower;
}
