import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
	public static void swap(int[] array,int i,int j) {
		
		int temp = array[i];
		array[i] = array[j];
		array[j]  = temp;
	}
		public static void main(String[] args) {
			int[] intArray = {19, 1, 9, 7, 3, 10, 13, 15, 8, 12};
			for(int lastUnsortedIndex = intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--) {
				for(int b=0;b<lastUnsortedIndex;b++) {
					if(intArray[b]>intArray[b+1]) {
						swap(intArray,b,b+1);
					}
					//System.out.println("Bubble sorted array: "+Arrays.toString(intArray));
				}
				
				System.out.println("Bubble sorted array: "+Arrays.toString(intArray));
			}
			
		}
		
}
