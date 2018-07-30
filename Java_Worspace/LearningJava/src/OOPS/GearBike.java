package OOPS;

public class GearBike extends Bike { //KW which inherite behaviour from another class
	//is the sub class as it inhetis the property of bike class
	
	private int Gearcount;
	
	public static void main(String[] args){
		//Creating the instance of gearbike class
		GearBike gearbike=new GearBike();//created the object of the class--name of the instance as (gearbike)
		gearbike.drive();
		
	}

}
