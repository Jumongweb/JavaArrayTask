import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayAtOddIndexTest{
	@Test
	public void shouldPrintElementAtOddIndex(){
	ArrayAtOddIndex oddIndex = new ArrayAtOddIndex();
	int[] array1 = {1,2,3,4,5,6,7};
	int[] output = {2,4,6};
	oddIndex.arrayAtOddIndex(array1);
	assertEquals(output, array1);
	}
}