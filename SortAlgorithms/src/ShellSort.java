import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {
		int[] intArray = {23,41,1,-34,-2,56,7,-213};
		for(int gap=intArray.length/2;gap>0;gap/=2) {
			
			
			for(int i=gap;i<intArray.length;i++) {
				
				int newElement = intArray[i];
				int j = i;
				
				while(j>=gap&&intArray[j-gap]>newElement) {
					intArray[j]=intArray[j-gap];
					j-=gap;
				}
				intArray[j]=newElement;
			}
			
				
			}
		System.out.println("Shell sorted array: "+Arrays.toString(intArray));
		}
	}


