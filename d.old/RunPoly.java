package HelloWorld;


class Horse{
	
	public void runspeed()
	{
		System.out.println("Run speed is 20 mph.");
	}
	
	public void color()
	{
		System.out.println("Horse color is Palomino.");
	}
	
}


class MinitureHorse extends Horse{
	
	public void runspeed()
	{
		super.runspeed();
		System.out.println("Run speed is 15 mph.");
	}
	
	public void color()
	{
		System.out.println("Small horse color is beige.");
	}
	
}

class pony extends Horse{
	
	
	public void color()
	{
		System.out.println("Pony color is white.");
	}
	
}


public class RunPoly {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Horse h1 = new Horse();
		h1.color();
		h1.runspeed();
		MinitureHorse h2 = new MinitureHorse();
		h2.color();
		h2.runspeed();	
		
	}

}
