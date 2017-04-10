import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SecondsTest {
  @Test
  public void selectSecondElementsTest() throws Exception {
    List<String> testListAll = new ArrayList<>();
    List<String> testListSeconds = new ArrayList<>();
    Seconds seconds = new Seconds();
    for (int i = 0; i < 6; i++) {
      testListAll.add(Integer.toString(i));
      if (i % 2 == 0) {
        testListSeconds.add(Integer.toString(i));
      }
    }
    assertTrue(seconds.selectSecondElements(testListAll) == testListAll);
  }
}
