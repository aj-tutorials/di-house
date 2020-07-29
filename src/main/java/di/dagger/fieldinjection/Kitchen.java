package di.dagger.fieldinjection;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class Kitchen {
  @Inject @Named("Kitchen")
  private Sink sink;
  @Inject
  private Stove stove;
}
