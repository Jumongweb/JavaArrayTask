import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumArrayTest{
	@Test
	public void shouldPrintSumOfArray(){
	SumArray total = new SumArray();
	int[] array = {2,5,3,20,10};
	assertEquals(40, total.sumArray(array));
	}

}