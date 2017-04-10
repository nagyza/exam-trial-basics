import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by nagyza on 2017.04.10..
 */
public class CuboidTest {
  @Test
  public void getSurfaceCube10() throws Exception {
    Cuboid box = new Cuboid(10, 10, 10);
    assertEquals(600, box.getSurface());
  }

  @Test
  public void getSurfaceCube10and20and30() throws Exception {
    Cuboid box = new Cuboid(10, 20, 30);
    assertEquals(2200, box.getSurface());
  }

}