import java.util.Arrays;
import java.util.List;

public class Search {
	
	private int num;
	private int[] arr;
	public Search(int num, int[] arr) {
		// TODO Auto-generated constructor stub
		this.num = num;
		this.arr=arr;
	}


	public int linearSearch() {
		Integer[] arr = new Integer[] {1,34,56,23,97};
		List<Integer> list = Arrays.asList(arr);
		for(int i=0;i<list.size();i++) {
			if(arr[i]==num) {
				return list.indexOf(this.num);
			}
		}
		return -1;
	}

	
}
