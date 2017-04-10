import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountAs {
  private int numberOfAs;
  private Path filePath;
  private List<String> lines;

  public int countAsInFile(String fileName) {
    numberOfAs = 0;
    readFile(fileName);
    String toCheckAs = buildOneString(this.lines).toString();
    if (this.lines == null) {
      this.numberOfAs = 0;
    } else {
      for (int i = 0; i < toCheckAs.length(); i++) {
        if (toCheckAs.charAt(i) == 'a') {
          this.numberOfAs++;
        }
      }
    }
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

  public StringBuilder buildOneString(List<String> lines) {
    StringBuilder textInFile = new StringBuilder();
    for (String line : lines) {
      textInFile.append(line);
    }
    return textInFile;
  }
}