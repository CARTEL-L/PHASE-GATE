import org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayManipulationTest{

	@Test
	static void TestThatManipulationFindsTheLargestToFindTheNumbersToSumItUp(){
		int[] arr = {1,2,3,4,7,3,9,4,5};
		int target = 9;
		int[] actual = manipulation.ArrayManipulation(arr, target);
		assertEquals([4,5], result);

	}
	
	@Test
	static void TestThatManipulationFindsTheLargestToFindTheNumbersToSumItUp(){
		int[] arr = {1,2,3,4,7,3,9,4,5};
		int target = 9;
		int[] expected = [4,5];
		int[] actual = manipulation.ArrayManipulation(target, arr);
		assertEquals(expected, actual);

	}
 

	}