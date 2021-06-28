import java.util.ArrayList;
import java.util.List;

public class SearchRunner {
	
public static void main(String[] args) {
	int[] marks1 = {1,34,56,23,97};
	Search search = new Search(5,marks1);
	System.out.println(search.linearSearch());
}
}
