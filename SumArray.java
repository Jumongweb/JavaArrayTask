import java.util.Arrays;

public class SumArray{
	public static int sumArray(int[] array){
	int total = 0;
	for (int index = 0; index < array.length; index++){
		total += array[index];	
	}
	return total;
	}
	
	public static void main(String[] args){
	int[] array = {9,10,3,1,20,5,3,2};
	System.out.print(sumArray(array));
	
	}

}