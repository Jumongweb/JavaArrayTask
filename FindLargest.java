import java.util.Arrays;
import java.util.Scanner;

public class FindLargest{

	public static int findLargest(int[] array){
	int largest = array[0];

	for (int index = 0; index < array.length; index++){
		if (array[index] > largest){
		largest = array[index];
		}
	}
	return largest;
	}

	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the array size: ");
	int size = scanner.nextInt();
	
	int[] array = new int[size];

	for(int index = 0; index < array.length; index++){
		System.out.printf("Enter array[%d]: ", index);
		array[index] = scanner.nextInt();
	}
	
	int result = findLargest(array);

//	System.out.println(Arrays.toString(array));
	System.out.println("The largest value in the array is " + result);

	}
}