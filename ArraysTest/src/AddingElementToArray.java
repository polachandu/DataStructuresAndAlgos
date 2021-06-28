import java.util.Arrays;

public class AddingElementToArray {
	//Funtion to add new element to an array
	public static int[] addElement(int n,int arr[], int x) {
		int i;
		//creating a new array of size n+1;
		int newarr[]=new int[n+1];
		// insert the elements from the old array into the new array
        // insert all elements till n then insert x at n+1
		for(i=0;i<arr.length;i++) {
			newarr[i]=arr[i];
		}
		newarr[n] = x;
		return newarr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		//initial size of array is 10
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Initial array: "+ Arrays.toString(arr));
		//new element is added to newArray
		int x=25;
		//calling the method to add x in arr
		arr = addElement(n,arr,x);
		System.out.println("Updated array: "+ Arrays.toString(arr));

	}

}
