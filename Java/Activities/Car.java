package activities;

public class Car {
	
	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	//initializing constructor
	Car(){
		
		tyres = 4;
		doors = 4;
	}
	
	public void displayCharacteristics() {
		System.out.println("Color of the car is: " +color);
		System.out.println("Make of the car is: " +make);
		System.out.println("Transmission of the car is: " +transmission);
		System.out.println("No.of tyres of the car is: " +tyres);
		System.out.println("No.of doors of the car is: " +doors);
		
	}
	public void accelarate() {
		System.out.println("Car is moving forward.");
	}
	public void brake() {
		System.out.println("Car has stopped.");
	}

}
