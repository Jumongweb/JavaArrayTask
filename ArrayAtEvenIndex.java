import java.util.Arrays;
public class ArrayAtEvenIndex{
public static void main(String[] args){
int[] array = {1,2,3,4,5,6,7,8,9,10};

for (int index = 0; index < array.length; index++){
	if (index % 2 == 0){
		System.out.print(array[index] + " ");
	}
}


}
}