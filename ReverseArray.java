import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray{
	public static void reverseArray(int[] array){
	int index = 0;
	int end = array.length - 1;
	while (index < end){
	int temp = array[index];
	array[index] = array[end];
	array[end] = temp;
	index++;
	end--;
	}

	}

	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the array size: ");
	int size = scanner.nextInt();
	int[] array = new int[size];
	for (int index = 0; index < array.length; index++){
		System.out.printf("Enter index[%d] value: ", index);
		array[index] = scanner.nextInt();
	}
		
	System.out.println("Initial: " + Arrays.toString(array));
	reverseArray(array);
	System.out.println("Reversed: " + Arrays.toString(array));
	
	}
}