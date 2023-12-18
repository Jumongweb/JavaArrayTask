import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeWaySumTest{
	@Test
	public void shouldAddTheArrayUsingWhileLoop(){
	int[] array = {2,4,6,8,10};
	ThreeWaySum total = new ThreeWaySum();
	assertEquals(30, total.sumUsingWhileLoop(array));
	}
	@Test
	public void shouldAddTheArrayUsingForLoop(){
	int[] array = {12,4,6,8,10};
	ThreeWaySum total = new ThreeWaySum();
	assertEquals(40, total.sumUsingForLoop(array));
	}
	@Test
	public void shoudAddTheArrayUsingDoWhileLoop(){
	int[] array = {10,20,30,40,50};
	ThreeWaySum total = new ThreeWaySum();
	assertEquals(150, total.sumUsingDoWhileLoop(array));
	}
}