package generators;

public class PairGenerator <S, T> implements DataGenerator<Pair<S, T>>{

  private final DataGenerator<S> sGenerator;
  private final DataGenerator<T> tGenerator;

  public PairGenerator(DataGenerator<S> sGenerator, DataGenerator<T> tGenerator) {
    this.sGenerator = sGenerator;
    this.tGenerator = tGenerator;
  }

  @Override
  public Pair<S, T> next() {
    if(hasNext()) {
      return new Pair<>(sGenerator.next(), tGenerator.next());
    } else {
      throw new UnsupportedOperationException("Next pair unavailable");
    }
  }

  @Override
  public Boolean hasNext() {
    return sGenerator.hasNext() && tGenerator.hasNext();
  }
}
