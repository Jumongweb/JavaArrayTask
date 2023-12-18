import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ArrayCheckElementTest{
	@Test
	public void elementIsPresent(){
	ArrayCheckElement element = new ArrayCheckElement();
	int[] array1 = {1,2,3,4,5};
	assertTrue(element.haveElement(array1, 3));
	}
	@Test
	public void elementIsNotPresent(){
	ArrayCheckElement element = new ArrayCheckElement();
	int[] array2 = {2,4,6,8,10};
	assertFalse(element.haveElement(array2, 5));
	}
	@Test
	public void elementIsNotPresentAgain(){
	ArrayCheckElement element = new ArrayCheckElement();
	int[] array3 = {};
	assertFalse(element.haveElement(array3, 3)); 	
	}
	@Test
	public void canReturnNegativeNumberIfFound(){
	ArrayCheckElement element = new ArrayCheckElement();
	int[] array4 = {-1,4,-6,-9,-2};
	assertTrue(element.haveElement(array4, -2));
	}
	@Test
	public void checkForFive(){
	int[] array = {2,4,7, 5, 9,1};
	 ArrayCheckElement element = new ArrayCheckElement();
	assertTrue(element.haveElement(array, 5));
	}
	

}