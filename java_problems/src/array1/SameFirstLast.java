package array1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SameFirstLast {

	// Given an array of ints, return true if the array is length 1 or more,
	// and the first element and the last element are equal.
	public boolean sameFirstLast(int[] nums) {
		if (nums.length < 1)
			return false;

		if (nums[0] == nums[nums.length - 1])
			return true;
		else
			return false;
	}

	@Test
	public void test() {
		assertEquals(true, sameFirstLast(new int[] { 1, 2, 1 }));
		assertEquals(false, sameFirstLast(new int[] {}));
		assertEquals(false, sameFirstLast(new int[] { 1, 2, 3 }));
	}
}
