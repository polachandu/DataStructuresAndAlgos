import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		
		int[]intArray = {5,3,4,1,2};
	
	for(int firstUnsortedIndex=1;firstUnsortedIndex<intArray.length;firstUnsortedIndex++) { //we assume that first index is sorted
		var newElement = intArray[firstUnsortedIndex];
		int j;
		for(j=firstUnsortedIndex;j>0&&intArray[j-1]>newElement;j--) { //Traversing from right to left
			intArray[j]=intArray[j-1];
		}
		intArray[j]=newElement;
	}
	System.out.println("Insertion sorted array: "+Arrays.toString(intArray));
	
	
	}
}
