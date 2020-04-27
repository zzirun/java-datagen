package generators;

public final class Pair<S, T> {
  private final S elem1;
  private final T elem2;

  public Pair(S elem1, T elem2) {
    this.elem1 = elem1;
    this.elem2 = elem2;
  }

  public S getElem1() {
    return elem1;
  }

  public T getElem2() {
    return elem2;
  }

  @Override
  public String toString() {
    StringBuilder str = new StringBuilder();
    str.append('{')
        .append(elem1.toString())
        .append(", ")
        .append(elem2.toString())
        .append('}');
    return str.toString();
  }

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof Pair)) {
      return false;
    } else {
      Pair o = (Pair) other;
      return getElem1().equals(o.getElem1()) && getElem2().equals(o.getElem2());
    }
  }

  @Override
  public int hashCode() {
    return getElem1().hashCode() * 10 + getElem2().hashCode();
  }
}
