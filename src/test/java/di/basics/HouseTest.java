package di.basics;

import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class HouseTest {

  @Mock
  private Bathroom mockBathroom;
  @Mock
  private Kitchen mockKitchen;

  private House houseToTest;

  @Before
  public void setUp() {
    MockitoAnnotations.initMocks(this);

    houseToTest = new House(mockBathroom, mockKitchen);
  }
}
