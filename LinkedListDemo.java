package HelloWorld;

import java.util.LinkedList;

public class LinkedListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList ll = new LinkedList();
		ll.add(20);
		ll.add(40);
		ll.add(1,55);
		
		System.out.println(ll);
		ll.remove(2);
		ll.addFirst(1);
		ll.addLast(100);
		System.out.println(ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		
		
		
	}

}
