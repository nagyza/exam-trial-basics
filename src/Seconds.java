import java.util.ArrayList;
import java.util.List;

public class Seconds {
  private List<String> secondElements;
  public  List<String> selectSecondElements(List<String> allElements) {
    this.secondElements = new ArrayList<>();
    for (int i = 0; i < allElements.size(); i++) {
      if (i % 2 == 0) {
        this.secondElements.add(allElements.get(i));
      }
    }
    return this.secondElements;
  }
}
