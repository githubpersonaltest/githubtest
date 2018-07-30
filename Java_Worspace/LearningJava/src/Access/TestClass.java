package Access;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass {
  
	public static void main(String[] args){
	FirefoxDriver firefoxdriver=new FirefoxDriver();
	firefoxdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//open the google page
	firefoxdriver.get("https://www.google.com");
	
	 //Instantiate the class Acesssepecifier
	AccessSpecifiers accessspecifier=new AccessSpecifiers();
	System.out.println("Get the Test Name :" +AccessSpecifiers.getTestname());//Static method invoked by class
	
	accessspecifier.search(firefoxdriver, "Selenium");//rest method by Class objects
	accessspecifier.search(firefoxdriver,123);
	
	String [] arraynew=new String[3];
	
	arraynew[0]="Firefox";
	arraynew[1]="InternetExplorer";
	arraynew[2]="Mozilla";
	
	accessspecifier.search(firefoxdriver, arraynew);
	
	// String buttonleble=accessspecifier.clickdata(firefoxdriver);
	  // System.out.println("return value" +buttonleble);
	
	
	Constructors construct =new Constructors(firefoxdriver);
	System.out.println("testdata 1:" +construct.getEnter());
	System.out.println("testdata 2" +construct.getExit());
	
	firefoxdriver.close();
	firefoxdriver.quit();
	
			}
	
	
}
