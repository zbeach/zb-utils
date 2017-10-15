package zb_utils;

import java.util.NoSuchElementException;

public class Arrays {
  /**
   * Concatenates two arrays of Strings.
   *
   * @param a First array
   * @param b Second array
   * @return the concatenated array
   */
  public static String[] concatenate(String[] a, String[] b) {
    String[] c = (String[]) new String[a.length + b.length];

    for (int i = 0; i < a.length; i++) c[i] = a[i];
    for (int i = a.length; i < a.length + b.length; i++) {
      c[i] = b[i - a.length];
    }

    return c;
  }

  /**
   * Makes a String array of the String representation of each element in an array of objects.
   *
   * @param <T>
   * @param data An array of objects
   * @return String array of the String representation of each element in the array of objects
   */
  public static <T> String[] eachToString(T[] data) {
    String[] dataStrings = new String[data.length];

    for (int i = 0; i < data.length; i++) dataStrings[i] = data[i].toString();

    return dataStrings;
  }

  /**
   * Makes a String array of the String representation of each element in an array of booleans.
   *
   * @param data An array of booleans
   * @return String array of the String representation of each element in the array of booleans
   */
  public static String[] eachToString(boolean[] data) {
    String[] dataStrings = new String[data.length];

    for (int i = 0; i < data.length; i++) dataStrings[i] = "" + data[i];

    return dataStrings;
  }

  /**
   * Makes a String array of the String representation of each element in an array of bytes.
   *
   * @param data An array of bytes
   * @return String array of the String representation of each element in the array of bytes
   */
  public static String[] eachToString(byte[] data) {
    String[] dataStrings = new String[data.length];

    for (int i = 0; i < data.length; i++) dataStrings[i] = "" + data[i];

    return dataStrings;
  }

  /**
   * Makes a String array of the String representation of each element in an array of chars.
   *
   * @param data An array of chars
   * @return String array of the String representation of each element in the array of chars
   */
  public static String[] eachToString(char[] data) {
    String[] dataStrings = new String[data.length];

    for (int i = 0; i < data.length; i++) dataStrings[i] = "" + data[i];

    return dataStrings;
  }

  /**
   * Makes a String array of the String representation of each element in an array of shorts.
   *
   * @param data An array of shorts
   * @return String array of the String representation of each element in the array of shorts
   */
  public static String[] eachToString(short[] data) {
    String[] dataStrings = new String[data.length];

    for (int i = 0; i < data.length; i++) dataStrings[i] = "" + data[i];

    return dataStrings;
  }

  /**
   * Makes a String array of the String representation of each element in an array of ints.
   *
   * @param data An array of ints
   * @return String array of the String representation of each element in the array of ints
   */
  public static String[] eachToString(int[] data) {
    String[] dataStrings = new String[data.length];

    for (int i = 0; i < data.length; i++) dataStrings[i] = "" + data[i];

    return dataStrings;
  }

  /**
   * Makes a String array of the String representation of each element in an array of longs.
   *
   * @param data An array of longs
   * @return String array of the String representation of each element in the array of longs
   */
  public static String[] eachToString(long[] data) {
    String[] dataStrings = new String[data.length];

    for (int i = 0; i < data.length; i++) dataStrings[i] = "" + data[i];

    return dataStrings;
  }

  /**
   * Makes a String array of the String representation of each element in an array of floats.
   *
   * @param data An array of floats
   * @return String array of the String representation of each element in the array of floats
   */
  public static String[] eachToString(float[] data) {
    String[] dataStrings = new String[data.length];

    for (int i = 0; i < data.length; i++) dataStrings[i] = "" + data[i];

    return dataStrings;
  }

  /**
   * Makes a String array of the String representation of each element in an array of doubles.
   *
   * @param data An array of doubls
   * @return String array of the String representation of each element in the array of doubles
   */
  public static String[] eachToString(double[] data) {
    String[] dataStrings = new String[data.length];

    for (int i = 0; i < data.length; i++) dataStrings[i] = "" + data[i];

    return dataStrings;
  }

  /**
   * Searches an array for a matching object and returns its index.
   *
   * @param element Element to search for
   * @param data Array of elements
   * @return Index of the matching element
   */
  public static <T> int indexOf(T element, T[] data) {
    for (int i = 0; i < data.length; i++) if (data[i].equals(element)) return i;

    throw new NoSuchElementException("Element not found.");
  }

  /**
   * Searches an array for a matching boolean and returns its index.
   *
   * @param element Element to search for
   * @param data Array of elements
   * @return Index of the matching element
   */
  public static int indexOf(boolean element, boolean[] data) {
    for (int i = 0; i < data.length; i++) if (data[i] == element) return i;

    throw new NoSuchElementException("Element not found.");
  }

  /**
   * Searches an array for a matching byte and returns its index.
   *
   * @param element Element to search for
   * @param data Array of elements
   * @return Index of the matching element
   */
  public static int indexOf(byte element, byte[] data) {
    for (int i = 0; i < data.length; i++) if (data[i] == element) return i;

    throw new NoSuchElementException("Element not found.");
  }

  /**
   * Searches an array for a matching char and returns its index.
   *
   * @param element Element to search for
   * @param data Array of elements
   * @return Index of the matching element
   */
  public static int indexOf(char element, char[] data) {
    for (int i = 0; i < data.length; i++) if (data[i] == element) return i;

    throw new NoSuchElementException("Element not found.");
  }

  /**
   * Searches an array for a matching short and returns its index.
   *
   * @param element Element to search for
   * @param data Array of elements
   * @return Index of the matching element
   */
  public static int indexOf(short element, short[] data) {
    for (int i = 0; i < data.length; i++) if (data[i] == element) return i;

    throw new NoSuchElementException("Element not found.");
  }

  /**
   * Searches an array for a matching int and returns its index.
   *
   * @param element Element to search for
   * @param data Array of elements
   * @return Index of the matching element
   */
  public static int indexOf(int element, int[] data) {
    for (int i = 0; i < data.length; i++) if (data[i] == element) return i;

    throw new NoSuchElementException("Element not found.");
  }

  /**
   * Searches an array for a matching long and returns its index.
   *
   * @param element Element to search for
   * @param data Array of elements
   * @return Index of the matching element
   */
  public static int indexOf(long element, long[] data) {
    for (int i = 0; i < data.length; i++) if (data[i] == element) return i;

    throw new NoSuchElementException("Element not found.");
  }

  /**
   * Searches an array for a matching float and returns its index.
   *
   * @param element Element to search for
   * @param data Array of elements
   * @return Index of the matching element
   */
  public static int indexOf(float element, float[] data) {
    for (int i = 0; i < data.length; i++) if (data[i] == element) return i;

    throw new NoSuchElementException("Element not found.");
  }

  /**
   * Searches an array for a matching double and returns its index.
   *
   * @param element Element to search for
   * @param data Array of elements
   * @return Index of the matching element
   */
  public static double indexOf(double element, double[] data) {
    for (int i = 0; i < data.length; i++) if (data[i] == element) return i;

    throw new NoSuchElementException("Element not found.");
  }
}
