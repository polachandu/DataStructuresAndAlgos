import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {20, 35,-15,7,55,1,-22};
		mergeSort(intArray,0,intArray.length);
			
		System.out.println("Merge sorted array is: "+Arrays.toString(intArray));
		

	}
	//{20, 35,-15,7,55,1,-22}
	public static void mergeSort(int[] input,int start,int end) {
		if(end-start<2) {
			return ;
		}
		int mid = (start+end)/2;
		System.out.println("X");
		System.out.println("start "+start+" mid "+mid+" end "+end);
		mergeSort(input,start,mid);
		System.out.println("Y");
		System.out.println("start "+start+" mid "+mid+" end "+end);

		mergeSort(input,mid,end);
		System.out.println("Z");
		System.out.println("start "+start+" mid "+mid+" end "+end);
		System.out.println(Arrays.toString(input));

		merge(input, start, mid, end);
		System.out.println(Arrays.toString(input));
		
		
	}
	
	public static void merge(int[] input,int start,int mid,int end) {
		// if last element in the left partition array is <= first element in the right partition array
		if(input[mid-1]<=input[mid]) {
			return ;
		}
		
		int i=start;
		int j=mid;
		int tempIndex = 0;  //this is going to keep the track where we are in temporary array when we're doing copy
		
		int[] temp =new int[end-start]; 
		
		// i<mid means traversing over left partition array is completed and j<end means traversing over right partition array is completed
		while(i<mid && j<end) {
			// if input[i]<= input[j] then the smaller element will be added to temporary array(called as temp)
			//if input[i] = input[j] then duplicate elements will be added
			//and tempIndex will be incremented and after adding an element to temp array, array position gets increment(from where element is copied to temporary array) 
			temp[tempIndex++] = input[i]<=input[j] ? input[i++] : input[j++];
		}
		//tempIndex tells us how many elements we handled
		//mid-i tells us the number of elements copy over into the temporary array
		System.arraycopy(input, i, input, start+tempIndex, mid-i);
		System.arraycopy(temp,0, input, start, tempIndex);
	}

}
