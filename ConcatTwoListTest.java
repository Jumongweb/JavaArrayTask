import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConcatTwoListTest{
	@Test
	public void shouldReturnConcatenatedList(){
	ConcatTwoList concat = new ConcatTwoList();
	int[] alpha = {a,b,c};
	int[] beta = {1,2,3};
	int[] output = {a,b,c,1,2,3};
	assertEquals(output, concatTwoList(alpha, beta));
	}


}