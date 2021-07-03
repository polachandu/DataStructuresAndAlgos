import java.util.Arrays;
import java.util.List;

public class LinearSearch {
	
	public static void main(String[] args) {
		int[] intArray = {20, 35,-15,7,55,1,-22};
		System.out.println(linearSearch(intArray,-15));
		
	}
	public static int linearSearch(int[] input,int element) {
		for(int i =0;i<input.length;i++) {
			if(input[i]==element) {
				return i;
			}
			}
		return -1;
		}
	}

	

