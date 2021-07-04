import java.util.Arrays;

public class RecursiveInsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]intArray = {5,3,4,1,2};
		insertionSort(intArray,intArray.length);
		System.out.println("Insertion sorted array: "+Arrays.toString(intArray));
		
		

	}
		public static void insertionSort(int[] input,int numItems) {
			if(numItems<2) {
				return;
			}
			insertionSort(input,numItems-1);
			int newElement = input[numItems-1];
			int j;
			for(j=numItems-1;j>0&&input[j-1]>newElement;j--) {
				input[j]=input[j-1];
			}
			input[j]=newElement;
		}
	}

	


