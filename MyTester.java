import junit.framework.TestCase;


public class MyTester extends TestCase {

	public void testNfactorial() {
		MyCalculator mc = new MyCalculator();
		int result;
		result = mc.nfactorial(0);
		assertEquals("0!", 1, result, 0.0);		//test 0!
		result = mc.nfactorial(1);
		assertEquals("1!", 1, result, 0.0);		//test 1!
		result = mc.nfactorial(5);
		assertEquals("5!", 120, result, 0.0);	//test n! ; n > 1
	}

	public void testBinarySearch() {
		MyCalculator mc = new MyCalculator();
		int result;
		int arr[];
		arr = new int[0];
		result = mc.binarySearch(arr, 1);
		assertEquals("empty array", -1, result, 0.0);		//test no value
		arr = new int[1];
		arr[0] = 1;
		result = mc.binarySearch(arr, 1);
		assertEquals("1 element; in array", 0, result, 0.0);	//test single value and in array
		result = mc.binarySearch(arr, 0);
		assertEquals("1 element; not in array", -1, result, 0.0);	//test single value and not in array
		arr = new int[5];
		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 5;
		arr[3] = 7;
		arr[4] = 9;
		result = mc.binarySearch(arr, 1);
		assertEquals("mulitple elements; first element", 0, result, 0.0);	//test more than 1 value and first element
		result = mc.binarySearch(arr, 9);
		assertEquals("mulitple elements; last element", 4, result, 0.0);	//test more than 1 value and last element
		result = mc.binarySearch(arr, 5);
		assertEquals("mulitple elements; middle element", 2, result, 0.0);	//test more than 1 value and middle element
		result = mc.binarySearch(arr, 0);
		assertEquals("mulitple elements; not in array", -1, result, 0.0);	//test more than 1 value and not in array
	}

}
