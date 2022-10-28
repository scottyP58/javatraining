package HelloWorld;

public class MyArrSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] student_names ={"Tom","Dick","Harry"};
		
		//normal for loop
			
				for(int i = 0; i < student_names.length; i++){
					
					System.out.println(student_names[i]);
					
				}
		
				
				//for each loop
				
				for(String n : student_names){
					
					
					System.out.println(n);
					
				}
		
	}

}
