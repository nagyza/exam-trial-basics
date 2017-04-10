
public class Cuboid {
  private int sideA;
  private int sideB;
  private int sideC;

  public Cuboid(int sideA, int sideB, int sideC) {
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }

  public int getSurface() {
    return 2 * (sideA * sideB + sideB * sideC + sideA * sideC);
  }

  public int getVolume() {
    return sideA * sideB * sideC;
  }
}
