package FinalExam;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Lab10.SelectionSort;

class testSelectionSort {
	public SelectionSort temp1;
	@Test
	void test() {
		//testPositive();
		//	testNegative();
			testMixed();
	}
	
	 public testSelectionSort() {
	 }
	 
	 public void testPositive(){
	        int[] arr = new int[5];
	        arr[0] = 8;
	        arr[1] = 9;
	        arr[2] = 7;
	        arr[3] = 10;
	        arr[4] = 2;
	        
	        SelectionSort temp1 = new SelectionSort();
	        temp1.sort(arr);
	        assertEquals(arr[0], 2);
	        
	    }
	 
	 public void testNegative(){
	        int[] arr = new int[5];
	        arr[0] = -8;
	        arr[1] = -9;
	        arr[2] = -7;
	        arr[3] = -10;
	        arr[4] = -2;
	        
	        SelectionSort temp1 = new SelectionSort();
	        temp1.sort(arr);
	        assertEquals(arr[0], -10);
	        
	    }
	 
	 public void testMixed(){
	        int[] arr = new int[5];
	        arr[0] = 0;
	        arr[1] = 2;
	        arr[2] = -3;
	        arr[3] = 5;
	        arr[4] = -1;
	        
	        SelectionSort temp1 = new SelectionSort();
	        temp1.sort(arr);
	        assertEquals(arr[2], 0);
	        
	    }
	 

}
