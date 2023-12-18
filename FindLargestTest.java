import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindLargestTest{
	@Test
	public void shouldPrintTheLargestNumberFromArray(){
	System.out.println("Test 1");
	FindLargest largest = new FindLargest();
	int[] array = {12, 15, 35, 80, 2, 5};
	int result = largest.findLargest(array);
	assertEquals(80, result);
	}
	@Test
	public void shouldAlsoPrintLargestNumberInTheArray(){
	System.out.println("Test 2");
	FindLargest largest = new FindLargest();
	int[] array = {-4, -8, -2, -5, -9, -1};
	int result = largest.findLargest(array);
	assertEquals(-1, result);
	}


}