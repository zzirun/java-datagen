package generators;

import org.junit.Assert;
import org.junit.Test;

public class Question4Tests {

    class AnotherStringGenerator implements DataGenerator<String> {

      private int step = 0;

      @Override
      public String next() {
        step++;
        switch (step - 1) {
          case 0:
            return "A";
          case 1:
            return "B";
          case 2:
            return "C";
          default:
            throw new UnsupportedOperationException("Out of strings.");
        }
      }

      @Override
      public Boolean hasNext() {
        return step <= 2;
      }
    }

    class AnotherIntegerGenerator implements IntegerGenerator {

      private int nextValue = 0;

      @Override
      public Integer next() {
        final int result = nextValue;
        nextValue = 1 - nextValue;
        return result;
      }

      @Override
      public Boolean hasNext() {
        return true;
      }
    }

    @Test
    public void testAnotherStringGenerator() {
      final DataGenerator<String> generator = new AnotherStringGenerator();
      Assert.assertTrue(generator.hasNext());
      Assert.assertEquals("A", generator.next());
      Assert.assertTrue(generator.hasNext());
      Assert.assertEquals("B", generator.next());
      Assert.assertTrue(generator.hasNext());
      Assert.assertEquals("C", generator.next());
      Assert.assertFalse(generator.hasNext());
      try {
        generator.next();
        Assert.fail("An exception was expected.");
      } catch (UnsupportedOperationException exception) {
        // Good: an exception should have been thrown.
      }
    }

    @Test
    public void testPairGenerator1() {
      final PairGenerator<String, Integer> generator = new PairGenerator<>(
              new AnotherStringGenerator(), new AnotherIntegerGenerator()
      );

      Assert.assertTrue(generator.hasNext());
      final Pair<String, Integer> p1 = generator.next();
      Assert.assertEquals("A", p1.getElem1());
      Assert.assertEquals(0, p1.getElem2().intValue());
    }

    @Test
    public void testPairGenerator2() {
      final PairGenerator<String, Integer> generator = new PairGenerator<>(
              new AnotherStringGenerator(), new AnotherIntegerGenerator()
      );

      Assert.assertTrue(generator.hasNext());
      final Pair<String, Integer> p1 = generator.next();
      Assert.assertEquals("A", p1.getElem1());
      Assert.assertEquals(0, p1.getElem2().intValue());

      Assert.assertTrue(generator.hasNext());
      final Pair<String, Integer> p2 = generator.next();
      Assert.assertEquals("B", p2.getElem1());
      Assert.assertEquals(1, p2.getElem2().intValue());

      Assert.assertTrue(generator.hasNext());
      final Pair<String, Integer> p3 = generator.next();
      Assert.assertEquals("C", p3.getElem1());
      Assert.assertEquals(0, p3.getElem2().intValue());

      Assert.assertFalse(generator.hasNext());
    }

}
