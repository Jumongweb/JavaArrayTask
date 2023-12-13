import java.util.Arrays;
import java.util.Scanner;
public class ArrayCheck{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the array size: ");
	int size = scanner.nextInt();
	int[] array = new int[size];
	boolean checker = false;
	int checkerIndex = 0;
	
	System.out.print("Enter the value you want to check in the array: ");
	int elementCheck = scanner.nextInt();

	for (int index = 0; index < size; index++){
		System.out.printf("Enter array[%d]: ", i);
		array[index] = scanner.nextInt();
	}
	for (int index = size - 1; index >= 0; index--){
		if (array[index] == elementCheck){
		checker = true;
		checkerIndex = index;
		}
		System.out.println(array[index]);
	} if (checker == true) {
		System.out.printf("There is %d in the array at index[%d]%n", elementCheck, checkerIndex);
	}
	else{
		System.out.printf("There is no %d in the array", elementCheck); 
	}
	}
}