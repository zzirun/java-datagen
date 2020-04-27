package generators;

public class FixedIntegerSequenceGenerator implements IntegerGenerator{

  private int latest;

  public FixedIntegerSequenceGenerator() {
    latest = -1;
  }

  @Override
  public Integer next() {
    if(hasNext()) {
      latest++;
      return latest;
    } else {
      throw new UnsupportedOperationException("Next integer unavailable");
    }
  }

  @Override
  public Boolean hasNext() {
    return latest < 29;
  }
}
