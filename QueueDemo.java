package HelloWorld;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue q1 = new PriorityQueue();
		q1.add("Java");
		q1.add("OOP");
		q1.add("Training");
		q1.add("Apps");
		q1.add("Development");
		System.out.println(q1);
		System.out.println(q1.poll());
		Queue q2 = new LinkedList();
		q2.add("Java");
		q2.add("OOP");
		q2.add("Training");
		q2.add("Apps");
		q2.add("Development");
		System.out.println(q2);
		System.out.println(q2.poll());		
		
	}

}
