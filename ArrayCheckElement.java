import java.util.Arrays;
import java.util.Scanner;

public class ArrayCheckElement{
	public static boolean haveElement(int[] array, int check){
	boolean checker = false;
	for (int value : array){
		if (check == value){
		checker = true;
		}
	}
	return checker;
	}  
	
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter search: ");
	int search = scanner.nextInt();

	int[] array1 = {2,6,8,11,56,0};
	boolean result = haveElement(array1, search);
	for (int index = 0; index < array1.length; index++){
	if (result == true){
		System.out.printf("Found %d at index[%d]", search, array1[index]);
	break;
	}
	else {
		System.out.printf("%d is not in the array", search);
	break;
	}
	}
	
	}
	


}