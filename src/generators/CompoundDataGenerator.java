package generators;

import java.util.List;

public class CompoundDataGenerator<T> implements DataGenerator<T> {

  private final List<DataGenerator<T>> genList;
  private int curr;
  private DataGenerator<T> currGen;

  public CompoundDataGenerator(List<DataGenerator<T>> genList) {
    this.genList = genList;
    curr = 0;
  }

  @Override
  public T next() {
    return genList.stream()
        .dropWhile(gen -> !gen.hasNext())
        .findFirst()
        .get()
        .next();
  }

  @Override
  public Boolean hasNext() {
    return genList.stream()
        .anyMatch(DataGenerator::hasNext);
  }
}
