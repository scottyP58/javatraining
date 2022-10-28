package HelloWorld;

class MyEncap{
	
	private int var1;
	private String var2;
	
	
	void setVars(int var1, String var2){
		
		this.var1 = var1;
		this.var2 = var2;
		
		
	}
	
	
	 void showInfo()
	 {
		 
			System.out.println("Var1: " + var1);
			System.out.println("Var2: " + var2);

			
	 }
	
	
}


public class EncapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyEncap encap1 = new MyEncap();
		encap1.setVars(58, "Years Old");
		encap1.showInfo();
		
	}

}
