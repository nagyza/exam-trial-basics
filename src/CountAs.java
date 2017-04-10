import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountAs {
  private String fileName;
  private int numberOfAs;
  private Path filePath;
  private List<String> lines;

  public int countAsInFile(String fileName) {
    if ()
    return this.numberOfAs;
  }

  public void readFile(String fileName) {
    this.filePath = Paths.get(fileName);
    this.lines = new ArrayList<>();
    try {
      this.lines = Files.readAllLines(filePath);
    } catch (IOException e) {
      this.lines = null;
    }
  }
}
