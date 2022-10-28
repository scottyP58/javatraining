package HelloWorld;

//import java.util.ArrayList;
import java.util.Vector;

public class VecListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Vector al = new Vector();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		System.out.println("Value at Index 1 is: " + al.get(1));
		al.add(1,55);
		System.out.println("Index 1 after changing is: " + al.get(1));
		System.out.println("All Values "+al);
		al.remove(3);
		System.out.println("All Values after removing index 3: "+al);
		
		
	}

}
