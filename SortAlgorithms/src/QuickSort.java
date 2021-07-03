import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {20, 35,-15,7,55,1,-22};
		quickSort(intArray,0,intArray.length);
		System.out.println("Quick sorted array is: "+ Arrays.toString(intArray));

	}
	public static void quickSort(int[] input, int start, int end) {
		// if end-start<2 means that it's dealing with one array element
		if((end-start)<2) {
			return;
		}
		//pivotInex is the position of the pivot in the sorted array
		int pivotIndex = partition(input,start,end);
		quickSort(input,start,pivotIndex);
		quickSort(input, pivotIndex+1, end);
	}
	
	public static int partition(int[] input,int start, int end) {
		int pivot = input[start];
		int i = start;
		int j = end;
		while(i<j) {
			
			// traversing from right to left looking for smaller elements
			while(i<j && input[--j]>=pivot);
			if(i<j) {
				input[i]=input[j];
			}
			// traversing from left to right looking for larger elements
			while(i<j && input[++i]<=pivot);
			if(i<j) {
				input[j]=input[i];
			}
		}
		input[j] = pivot;
		return j;
	}

}
