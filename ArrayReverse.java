import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the array size: ");
	int size = scanner.nextInt();
	int[] array = new int[size];
	
	for (int i = 0; i < size; i++){
		System.out.printf("Enter array[%d]: ", i);
		array[i] = scanner.nextInt();
	}
	for (int i = size - 1; i >= 0; i--){
		System.out.print(array[i]);
	}

	
	}
}