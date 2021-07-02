package activities;

public class Activity1 {

	public static void main(String[] args) {

		Car Maruti = new Car();
		Maruti.make = 2014;
		Maruti.color = "Black";
		Maruti.transmission = "Manual";
		
		Maruti.displayCharacteristics();
		Maruti.accelarate();
		Maruti.brake();

	}

}
