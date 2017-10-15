import org.junit.Test;

public class ArraysTest {
  @Test
  public void testConcatenate_String_array_String_array() {
    String[] a = {"", "a", "aa", "ab"};
    String[] b = {"", "z", "zz", "zy"};

    String[] ab = {"", "a", "aa", "ab", "", "z", "zz", "zy"};
    String[] ab2 = {"", "", "a", "z"};

    assert (java.util.Arrays.equals(zb_utils.Arrays.concatenate(a, b), ab));
    assert (!java.util.Arrays.equals(zb_utils.Arrays.concatenate(a, b), ab2));
  }

  @Test
  public void testEachToString_T_array() {
    class Date {
      private int day, month, year;

      public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
      }

      @Override
      public String toString() {
        return day + "/" + month + "/" + year;
      }
    }

    Date[] dates = {
      new Date(1, 2, 3), new Date(2, 3, 4), new Date(3, 4, 5), new Date(4, 5, 6),
    };

    String[] dateStrings = {"1/2/3", "2/3/4", "3/4/5", "4/5/6"};

    assert (java.util.Arrays.equals(zb_utils.Arrays.eachToString(dates), dateStrings));
  }

  @Test
  public void testEachToString_boolean_array() {
    boolean[] bits = {false, true, true, false, true};

    String[] bitStrings = {"false", "true", "true", "false", "true"};

    assert (java.util.Arrays.equals(zb_utils.Arrays.eachToString(bits), bitStrings));
  }

  @Test
  public void testEachToString_byte_array() {
    byte[] bytes = {-128, 127, -127, 126, -126, 125};

    String[] byteStrings = {"-128", "127", "-127", "126", "-126", "125"};

    assert (java.util.Arrays.equals(zb_utils.Arrays.eachToString(bytes), byteStrings));
  }

  @Test
  public void testEachToString_char_array() {
    char[] chars = {'a', 'B', 'z', 'Y'};

    String[] charStrings = {"a", "B", "z", "Y"};

    assert (java.util.Arrays.equals(zb_utils.Arrays.eachToString(chars), charStrings));
  }

  @Test
  public void testEachToString_short_array() {
    short[] shorts = {-32768, 32767, -32767, 32766};

    String[] shortStrings = {"-32768", "32767", "-32767", "32766"};

    assert (java.util.Arrays.equals(zb_utils.Arrays.eachToString(shorts), shortStrings));
  }

  @Test
  public void testEachToString_int_array() {
    int[] ints = {
      Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE + 1, Integer.MAX_VALUE - 1
    };

    String[] intStrings = {
      Integer.toString(Integer.MIN_VALUE),
      Integer.toString(Integer.MAX_VALUE),
      Integer.toString(Integer.MIN_VALUE + 1),
      Integer.toString(Integer.MAX_VALUE - 1)
    };

    assert (java.util.Arrays.equals(zb_utils.Arrays.eachToString(ints), intStrings));
  }

  @Test
  public void testEachToString_long_array() {
    long[] longs = {Long.MIN_VALUE, Long.MAX_VALUE, Long.MIN_VALUE + 1, Long.MAX_VALUE - 1};

    String[] longStrings = {
      Long.toString(Long.MIN_VALUE),
      Long.toString(Long.MAX_VALUE),
      Long.toString(Long.MIN_VALUE + 1),
      Long.toString(Long.MAX_VALUE - 1)
    };

    assert (java.util.Arrays.equals(zb_utils.Arrays.eachToString(longs), longStrings));
  }

  @Test
  public void testEachToString_float_array() {
    float[] floats = {Float.MIN_VALUE, Float.MAX_VALUE, Float.MIN_VALUE + 1, Float.MAX_VALUE - 1};

    String[] floatStrings = {
      Float.toString(Float.MIN_VALUE),
      Float.toString(Float.MAX_VALUE),
      Float.toString(Float.MIN_VALUE + 1),
      Float.toString(Float.MAX_VALUE - 1)
    };

    assert (java.util.Arrays.equals(zb_utils.Arrays.eachToString(floats), floatStrings));
  }

  @Test
  public void testEachToString_double_array() {
    double[] doubles = {
      Double.MIN_VALUE, Double.MAX_VALUE, Double.MIN_VALUE + 1, Double.MAX_VALUE - 1
    };

    String[] doubleStrings = {
      Double.toString(Double.MIN_VALUE),
      Double.toString(Double.MAX_VALUE),
      Double.toString(Double.MIN_VALUE + 1),
      Double.toString(Double.MAX_VALUE - 1)
    };

    assert (java.util.Arrays.equals(zb_utils.Arrays.eachToString(doubles), doubleStrings));
  }

  @Test
  public void testIndexOf_T_T_array() {
    String[] data = {"A", "B", "C", "D", "E"};

    assert (zb_utils.Arrays.indexOf("A", data) == 0);
    assert (zb_utils.Arrays.indexOf("B", data) == 1);
    assert (zb_utils.Arrays.indexOf("C", data) == 2);
    assert (zb_utils.Arrays.indexOf("D", data) == 3);
    assert (zb_utils.Arrays.indexOf("E", data) == 4);
  }

  @Test
  public void testIndexOf_boolean_boolean_array() {
    boolean[] data = {true, false, true, true, false};

    assert (zb_utils.Arrays.indexOf(true, data) == 0);
    assert (zb_utils.Arrays.indexOf(false, data) == 1);
  }

  @Test
  public void testIndexOf_byte_byte_array() {
    byte[] data = {-128, 127, -127, 126, -126, 125};

    byte b0 = -128;
    byte b1 = 127;
    byte b2 = -127;
    byte b3 = 126;
    byte b4 = -126;
    byte b5 = 125;

    assert (zb_utils.Arrays.indexOf(b0, data) == 0);
    assert (zb_utils.Arrays.indexOf(b1, data) == 1);
    assert (zb_utils.Arrays.indexOf(b2, data) == 2);
    assert (zb_utils.Arrays.indexOf(b3, data) == 3);
    assert (zb_utils.Arrays.indexOf(b4, data) == 4);
    assert (zb_utils.Arrays.indexOf(b5, data) == 5);
  }
}
