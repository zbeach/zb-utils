package zb_utils;

public class Arrays {
	/**
	 * Makes a String array of the String representation of each element in an
	 * array of objects.
	 * @param <T>
	 * @param data An array of objects
	 * @return String array of the String representation of each element in the
	 * array of objects
	 */
	public static <T> String[] eachToString(T[] data) {
		String[] dataStrings = new String[data.length];

		for (int i = 0; i < data.length; i++)
			dataStrings[i] = data[i].toString();

		return dataStrings;
	}

	/**
	 * Makes a String array of the String representation of each element in an
	 * array of booleans.
	 * @param data An array of booleans
	 * @return String array of the String representation of each element in the
	 * array of booleans
	 */
	public static String[] eachToString(boolean[] data) {
		String[] dataStrings = new String[data.length];

		for (int i = 0; i < data.length; i++)
			dataStrings[i] = "" + data[i];

		return dataStrings;
	}

	/**
	 * Makes a String array of the String representation of each element in an
	 * array of bytes.
	 * @param data An array of bytes
	 * @return String array of the String representation of each element in the
	 * array of bytes
	 */
	public static String[] eachToString(byte[] data) {
		String[] dataStrings = new String[data.length];

		for (int i = 0; i < data.length; i++)
			dataStrings[i] = "" + data[i];

		return dataStrings;
	}

	/**
	 * Makes a String array of the String representation of each element in an
	 * array of chars.
	 * @param data An array of chars
	 * @return String array of the String representation of each element in the
	 * array of chars
	 */
	public static String[] eachToString(char[] data) {
		String[] dataStrings = new String[data.length];

		for (int i = 0; i < data.length; i++)
			dataStrings[i] = "" + data[i];

		return dataStrings;
	}

	/**
	 * Makes a String array of the String representation of each element in an
	 * array of shorts.
	 * @param data An array of shorts
	 * @return String array of the String representation of each element in the
	 * array of shorts
	 */
	public static String[] eachToString(short[] data) {
		String[] dataStrings = new String[data.length];

		for (int i = 0; i < data.length; i++)
			dataStrings[i] = "" + data[i];

		return dataStrings;
	}

	/**
	 * Makes a String array of the String representation of each element in an
	 * array of ints.
	 * @param data An array of ints
	 * @return String array of the String representation of each element in the
	 * array of ints
	 */
	public static String[] eachToString(int[] data) {
		String[] dataStrings = new String[data.length];

		for (int i = 0; i < data.length; i++)
			dataStrings[i] = "" + data[i];

		return dataStrings;
	}

	/**
	 * Makes a String array of the String representation of each element in an
	 * array of longs.
	 * @param data An array of longs
	 * @return String array of the String representation of each element in the
	 * array of longs
	 */
	public static String[] eachToString(long[] data) {
		String[] dataStrings = new String[data.length];

		for (int i = 0; i < data.length; i++)
			dataStrings[i] = "" + data[i];

		return dataStrings;
	}

	/**
	 * Makes a String array of the String representation of each element in an
	 * array of floats.
	 * @param data An array of floats
	 * @return String array of the String representation of each element in the
	 * array of floats
	 */
	public static String[] eachToString(float[] data) {
		String[] dataStrings = new String[data.length];

		for (int i = 0; i < data.length; i++)
			dataStrings[i] = "" + data[i];

		return dataStrings;
	}

	/**
	 * Makes a String array of the String representation of each element in an
	 * array of doubles.
	 * @param data An array of doubls
	 * @return String array of the String representation of each element in the
	 * array of doubles
	 */
	public static String[] eachToString(double[] data) {
		String[] dataStrings = new String[data.length];

		for (int i = 0; i < data.length; i++)
			dataStrings[i] = "" + data[i];

		return dataStrings;
	}

	/**
	 * Concatenates two arrays of objects.
	 * @param a First array
	 * @param b Second array
	 * @return the concatenated array
	 */
	public static <T> T[] concatenate(T[] a, T[] b) {
		T[] c = (T[]) new Object[a.length + b.length];

		for (int i = 0; i < a.length; i++)
			c[i] = a[i];
		for (int i = a.length; i < a.length + b.length; i++) {
			c[i] = b[i - a.length];
		}

		return c;
	}
}
