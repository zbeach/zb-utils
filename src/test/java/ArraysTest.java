

import static org.junit.Assert.*;

import org.junit.Test;

import zb_utils.Arrays;

public class ArraysTest {
	@Test
	public void testEachToString_Object_array() {
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
				new Date(1, 2, 3),
				new Date(2, 3, 4),
				new Date(3, 4, 5),
				new Date(4, 5, 6),
		};
		
		String[] dateStrings = {"1/2/3", "2/3/4", "3/4/5", "4/5/6"};
		
		assert(java.util.Arrays.equals(
				zb_utils.Arrays.eachToString(dates),
				dateStrings));
	}
	
	@Test
	public void testEachToString_int_array() {
		int[] nums = {0, 1, 2, 3, 4, 5};
		
		String[] numStrings = {"0", "1", "2", "3", "4", "5"};
		
		assert(java.util.Arrays.equals(
				zb_utils.Arrays.eachToString(nums), numStrings));
	}
	
	@Test
	public void testMerge_generic_array_generic_array() {
		String[] a = {"", "a", "aa", "ab"};
		String[] b = {"", "z", "zz", "zy"};
		Integer[] c = {new Integer(0), new Integer(1), new Integer(2)};
		
		String[] ab = {"", "a", "aa", "ab", "", "z", "zz", "zy"};
		String[] ab2 = {"", "", "a", "z"};
		
		Object[] ac = {"", "a", "aa", "ab", new Integer(0), new Integer(1), new Integer(2)};
		
		assert(java.util.Arrays.equals(
				zb_utils.Arrays.merge(a, b),
				ab));
		assert(!java.util.Arrays.equals(
				zb_utils.Arrays.merge(a, b),
				ab2));
		assert(java.util.Arrays.equals(
				zb_utils.Arrays.merge(a, c),
				ac));
	}
}
