import java.util.Arrays;
public class ArraySum{
public static void main(String[] args){
int[] array = {1,2,3,4,5,6,7,8,9,10};
int total = 0;

for (int index = 0; index < array.length; index++){
	total += array[index];
}

System.out.printf("The sum of the array is %d", total);

}
}