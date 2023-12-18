import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseArrayTest{
	@Test
	public void arrayShouldReturnReverse(){
	ReverseArray reverse = new ReverseArray();
	int[] inputArray = {1,2,3,4,5};
	int[] outputArray = {5,4,3,2,1};
	// int[] result = reverse.reverseArray(inputArray);
	reverse.reverseArray(inputArray);

	assertArrayEquals(outputArray, inputArray);
	
	}

}
