import java.util.Arrays;

public class SelectionSort {
 public static void swap(int[] arr,int i,int j) {
	 int temp = arr[i];
	 arr[i]=arr[j];
	 arr[j] = temp;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {11, 7, 12, 14, 19, 1, 6, 18, 8, 20};
		for(int i= 0;i<intArray.length;i++) {
			int lowest = i;
			for(int j=i+1;j<intArray.length;j++) {
				if(intArray[j]<intArray[lowest]) {
					lowest=j;
				}
			}
			if(i!=lowest) {
				swap(intArray,i,lowest);
			}
			System.out.println("Selection sorted array: "+Arrays.toString(intArray));

		}
		
	}

}
