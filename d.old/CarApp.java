package HelloWorld;

public class CarApp {

	

	 String color = "red";
	 int doors = 4;
	 int wheels = 4;
	 String make = "Ford";
	 String model = "Mustang";
	 int data = 10;
	 
	 // Default Constructor 
	 
	 CarApp(){
		 
		 System.out.println("Object Created");
		 
	 }
	
	 
	 //Constructor with parameters
	 
	 CarApp(int doors, int wheels, String make){
		 
		 //System.out.println("Object Created");
		 this();
		 this.doors = doors;
		 this.wheels = wheels;
		 this.make = make;
	 }
	 
	 
	 void showInfo()
	 {
		 
			System.out.println("Color: " + color);
			System.out.println("Number of Doors "+doors);
			System.out.println("Number of wheels: "+wheels);
			System.out.println("Make: "+make);
			System.out.println("Model: "+model);
			
	 }

	 void changedata(int data)
	 {
		 this.data = data + 20;
		 
	 }
	 

public static void main(String[] args) {
	// TODO Auto-generated method stub

	CarApp car1 = new CarApp();
	car1.showInfo();
	System.out.println("Data before "+car1.data);
	car1.changedata(20);
	System.out.println("Data after "+car1.data);
	CarApp car2 = new CarApp(5,6,"Tesla");
	System.out.println("Stuff for car2 "+car2.make);
}

}
