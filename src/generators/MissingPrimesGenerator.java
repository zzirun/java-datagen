package generators;

public class MissingPrimesGenerator implements IntegerGenerator{

  private int latest;

  public MissingPrimesGenerator() {
    latest = 0;
  }

  @Override
  public Integer next() {
    while (true) {
      latest++;
      if(hasNext()) {
        return latest;
      }
    }
  }

  @Override
  public Boolean hasNext() {
    int mulTwo = latest % 2;
    int mulFive = latest % 5;
    if (mulTwo == 0) {
      if (mulFive == 0) {
        return true;
      }
      return false;
    } else if (mulFive == 0) {
      return false;
    } else {
      return true;
    }
  }
}
