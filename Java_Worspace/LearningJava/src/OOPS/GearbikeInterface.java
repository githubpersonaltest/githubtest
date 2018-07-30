package OOPS;

public class GearbikeInterface implements BikeInterface { //We cant externd the interface--Implements it 
	
	private int Gearcount;
	  public static void main(String[] args){
		  GearbikeInterface gearbikeinterface =new GearbikeInterface();
		  gearbikeinterface.driver();//implements the method of BikeInterface
		  
	  }
	  
	public void driver() {//Driver method is overriden in GearbikeInterface class
		// TODO Auto-generated method stub //implements the driver method
		System.out.println("Run the GearBike");
		
}

}
