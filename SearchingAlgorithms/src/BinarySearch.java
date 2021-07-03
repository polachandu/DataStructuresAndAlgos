
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {-22, -15, 1, 7, 20, 35, 55};
		System.out.println(binarySearch(intArray, 55));
		
	}
		public static int binarySearch(int[] input, int value) {
			int start = 0;
			int end = input.length;
			int midpoint = (start+end)/2;
			if(input[midpoint] == value) {
				return midpoint+1;
			}else if(input[midpoint]>value) {
				for(int i=start;i<midpoint;i++) {
					if(input[i]==value) {
						return i+1;
					}
				}
			}else {
				for(int i=midpoint+1;i<end;i++) {
				
					if(input[i]==value) {
						return i+1;
					}
				}
			}
			return -1;
		
		}
	}


