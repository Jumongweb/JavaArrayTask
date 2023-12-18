import java.util.Arrays;

public class EvenIndexArray{
	public static int[] evenIndexArray(int[] array){
	int count = 0;
	 
	for (int index = 0; index < array.length; index+= 2){
		if (index  % 2 == 0){
			count++;
		//	System.out.print(Arrays.toString(array));
		}
	}
	int[] output = new int[count];
	for (int index = 0; index < count; index++){
		output[index] = array[index];
	}

	return output;
	}
	public static void main(String[] args){	
	int[] array1 = {1,2,3,4,5,6,7,8,9};
	evenIndexArray(array1);
	System.out.println(Arrays.toString(array1));
	}	


}