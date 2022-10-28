package HelloWorld;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(3);
		lhs.add(4);
		lhs.add(8);
		lhs.add(11);
		System.out.println(lhs);
		
		TreeSet ts = new TreeSet();
		ts.add(3);
		ts.add(4);
		ts.add(8);
		ts.add(11);
		System.out.println(ts);		
		
		
		
	}

}
