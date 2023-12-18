import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenIndexArrayTest{
	@Test
	public void shouldPrintArrayInEvenIndex(){
	EvenIndexArray evenArray = new EvenIndexArray();
	int[] array = {1,2,3,4,5,6,7,8};
	int[] output = {1,3,5,7};
	assertEquals(output, evenArray.evenIndexArray(array));
	}

}