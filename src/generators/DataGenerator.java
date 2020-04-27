package generators;

public interface DataGenerator<T> {

  T next();

  Boolean hasNext();

}
