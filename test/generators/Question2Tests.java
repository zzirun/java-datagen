package generators;

import org.junit.Assert;
import org.junit.Test;

public class Question2Tests {

    @Test
    public void testDigitCombinationsGenerator1() {
      final StringGenerator generator = new DigitCombinationsGenerator();
      Assert.assertTrue(generator.hasNext());
      Assert.assertEquals("", generator.next());
      Assert.assertTrue(generator.hasNext());
      Assert.assertEquals("5", generator.next());
      Assert.assertTrue(generator.hasNext());
      Assert.assertEquals("6", generator.next());
      Assert.assertTrue(generator.hasNext());
      Assert.assertEquals("7", generator.next());
      Assert.assertTrue(generator.hasNext());
      Assert.assertEquals("8", generator.next());
      Assert.assertTrue(generator.hasNext());
      Assert.assertEquals("55", generator.next());
      Assert.assertTrue(generator.hasNext());
      Assert.assertEquals("56", generator.next());
      Assert.assertTrue(generator.hasNext());
      Assert.assertEquals("57", generator.next());
      Assert.assertTrue(generator.hasNext());
      Assert.assertEquals("58", generator.next());
      Assert.assertTrue(generator.hasNext());
      Assert.assertEquals("65", generator.next());
      Assert.assertTrue(generator.hasNext());
      Assert.assertEquals("66", generator.next());
      Assert.assertTrue(generator.hasNext());
      Assert.assertEquals("67", generator.next());
      Assert.assertTrue(generator.hasNext());
      Assert.assertEquals("68", generator.next());
      Assert.assertTrue(generator.hasNext());
      Assert.assertEquals("75", generator.next());
      Assert.assertTrue(generator.hasNext());
      Assert.assertEquals("76", generator.next());
      Assert.assertTrue(generator.hasNext());
      Assert.assertEquals("77", generator.next());
      Assert.assertTrue(generator.hasNext());
      Assert.assertEquals("78", generator.next());
      Assert.assertTrue(generator.hasNext());
      Assert.assertEquals("85", generator.next());
      Assert.assertTrue(generator.hasNext());
      Assert.assertEquals("86", generator.next());
      Assert.assertTrue(generator.hasNext());
      Assert.assertEquals("87", generator.next());
      Assert.assertTrue(generator.hasNext());
      Assert.assertEquals("88", generator.next());
      Assert.assertTrue(generator.hasNext());
      Assert.assertEquals("555", generator.next());
    }

    @Test
    public void testDigitCombinationsGenerator2() {
      final StringGenerator generator = new DigitCombinationsGenerator();
      for (int i = 0; i < 5000; i++) {
        Assert.assertTrue(generator.hasNext());
        final String value = generator.next();
        switch (i) {
          case 4:
            Assert.assertEquals("8", value);
            break;
          case 5:
            Assert.assertEquals("55", value);
            break;
          case 6:
            Assert.assertEquals("56", value);
            break;
          case 16:
            Assert.assertEquals("78", value);
            break;
          case 17:
            Assert.assertEquals("85", value);
            break;
          case 18:
            Assert.assertEquals("86", value);
            break;
          case 64:
            Assert.assertEquals("778", value);
            break;
          case 65:
            Assert.assertEquals("785", value);
            break;
          case 66:
            Assert.assertEquals("786", value);
            break;
          case 256:
            Assert.assertEquals("7778", value);
            break;
          case 257:
            Assert.assertEquals("7785", value);
            break;
          case 258:
            Assert.assertEquals("7786", value);
            break;
          case 1024:
            Assert.assertEquals("77778", value);
            break;
          case 1025:
            Assert.assertEquals("77785", value);
            break;
          case 1026:
            Assert.assertEquals("77786", value);
            break;
          case 4096:
            Assert.assertEquals("777778", value);
            break;
          case 4097:
            Assert.assertEquals("777785", value);
            break;
          case 4098:
            Assert.assertEquals("777786", value);
            break;
          default:
            break;
        }

      }

    }

}
