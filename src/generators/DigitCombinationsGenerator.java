package generators;

public class DigitCombinationsGenerator implements StringGenerator {

  private String latest;
  private int curr;
  private int digitNumber;

  public DigitCombinationsGenerator() {
    latest = "";
    digitNumber = 0;

  }

  @Override
  public String next() {
    while (true) {
      for (int i = latest.length() - 1; i > -1; i--) {
        curr = Integer.parseInt(String.valueOf(latest.charAt(i)));
        if (hasNext()) {
          curr++;
          latest = latest.substring(0, latest.length() - 2) + curr;
          return latest;
        } else {
          latest = latest.substring(0, latest.length() - 2) + '5';
        }
      }
      if (digitNumber < latest.length()) {
        latest += '5';
      }
      digitNumber++;
      return latest;
    }
  }

  @Override
  public Boolean hasNext() {
    return curr < 8;
  }
}
