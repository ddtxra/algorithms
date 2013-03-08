package ddt.algorithms;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import ddt.algorithms.sort.BubbleSort;
import ddt.algorithms.sort.Sort;

public class SortTest {

	Integer[] arrayOrdered, arrayUnordered;
	
	@Before
	public void initialize (){
		arrayOrdered = new Integer[]{1,6,8,12};
		arrayUnordered = new Integer[]{8,6,1,12};
	}
	
	
	@Test
	public void testBubbleSort(){
	
		Sort bubbleSort = new BubbleSort();
		bubbleSort.sort(arrayUnordered);
		
		assertTrue(Arrays.equals(arrayUnordered, arrayOrdered));
		
	}
	
	

}
