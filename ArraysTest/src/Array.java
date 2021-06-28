import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int[] intArray = new int[7];
		intArray[0] = 2099999999;
		intArray[1] = 1;
		intArray[2] = 23;
		
		//for printing an array we should use Arrays.toString(array name which should be printed)
		System.out.println(Arrays.toString(intArray));
		
		//just printing the elements in the array
		for(int i=0;i<intArray.length;i++) {
			System.out.print(intArray[i]+" ");
		}
		//In the below scenario if there're multiple 0's it takes the first occurred index
		int index=-1;
		System.out.println(" ");
		for(int i =0;i<intArray.length;i++) {
			if(intArray[i]==0) {
				index = i;
				break;
			}
		}
		System.out.println(index);
	}
}
// Retrieving an element when index is known then time complexity is O(1);
//Retrieving an element when index is not known then time complexity is O(n);
//Adding an element to full array, time complexity is O(n);
//Adding an element to the end of an array, time complexity is O(1);
//Inserting or updating an element to the specific index, time complexity is O(1);
//Deleting an array by setting it to null, time complexity is O(1);
//Deleting an element by shifting elements, time complexity is O(n);