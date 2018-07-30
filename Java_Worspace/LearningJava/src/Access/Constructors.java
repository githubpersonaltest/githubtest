package Access;

import org.openqa.selenium.*;

public class Constructors {
	//Instiate the variable webdriber
	private WebDriver webdriver;
	
	//Constructor has the same name as of the class
	//we are passing the arguments as Webdriver
	public Constructors(final WebDriver webdriver){
		this.webdriver=webdriver;//this denotes the current object of the class
		//if local variable and instance variable both are different then it is not needed
		//this constructor can be used if you have mulptile constructors in the class
	}
		private static String enters;
		private static String Exits;
		
		static {
			enters ="Hi";
			Exits="Bye";
		}
		
		public static String getEnter(){
			return enters;
		}
		
		public static String getExit(){
			return Exits;
		}
		
		
		
	
	
	

}
