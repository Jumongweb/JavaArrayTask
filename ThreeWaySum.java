public class ThreeWaySum{
	
	public static int sumUsingWhileLoop(int[] array){
	int total = 0;
	int count = 0;
	while(count < array.length){
	total += array[count];
	count++;
	} 
	return total;
	} 
	
	public static int sumUsingDoWhileLoop(int[] array){
	int count = 0;
	int total = 0;
	do{
	total += array[count];
	count++;
	} while (count < array.length);
	return  total;
	} 

	public static int sumUsingForLoop(int[] array){
	int total = 0;
	for (int index = 0; index < array.length; index++){
		total += array[index];	
	}
	return total;
	}
	
	public static void main(String[] args){
	int[] array = {4,7,3,6,8,9,2};
	System.out.println("Sum using for loop: " + sumUsingForLoop(array));
	System.out.println("Sum using do_While loop: " + sumUsingDoWhileLoop(array));
	System.out.println("Sum using while loop: " + sumUsingWhileLoop(array));
	}
}