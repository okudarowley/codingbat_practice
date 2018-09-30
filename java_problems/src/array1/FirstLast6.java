package array1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstLast6 {

	// Given an array of ints, return true if 6 appears as either the first or last element in the array.
	// The array will be length 1 or more.
	public boolean firstLast6(int[] nums) {
		if(nums[0] == 6 || nums[nums.length - 1] == 6)
		    return true;
		else
		    return false;
	}
	
	
	@Test
	public void test() {
		assertEquals(true, firstLast6(new int[] { 1, 2, 3, 4, 5, 6}));
		assertEquals(false, firstLast6(new int[] { 1, 2, 3}));
	}

}
