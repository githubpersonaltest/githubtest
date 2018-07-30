package OOPS;//

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;;

//Instance variable(non-static field)--when we create object of a class we need to set diff value of it 
//class Variables(static)-not associated with instance only associated with the class
//Local Variables--which are within the method
//Parameters

public class JavaVariables {
	//Instance variable
	String InstanceVariable;
	//Class Variable--associated with the class and not with any object of class
	static String ClassVariable="Firefox";
	
	public static void main(String[] args){
		//Local Varaiable
		int temp=0;
		//Create the two objects of class JavaVariable
		JavaVariables firefox1=new JavaVariables();
		JavaVariables firefox2=new JavaVariables();
		//Now set the instance variable value by using class objects
		firefox1.InstanceVariable="Firefox1";
		firefox2.InstanceVariable="Firefox2";
		
		System.out.println("Access the instance variables");
		System.out.println("first object state: "+firefox1.InstanceVariable);
		System.out.println("second object state: "+firefox2.InstanceVariable);
		//Access the class variable with the help of class
		
		System.out.println("Access Class variables");
		System.out.println("first class variable :" +JavaVariables.ClassVariable);
		//Array--collection of same type of data 
		//Create the String array of fixed size as 2
		String[] SearchResult=new String[2];
		//Add the firefox Jar, now we are using the FirefoxDriver class from the jar file
		FirefoxDriver firefoxdriver=new FirefoxDriver();
		firefoxdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//open the google page
		firefoxdriver.get("https://www.google.com");
		//Parameter type example-by keyword
		//findname is method,BY is an object and name is static class
		firefoxdriver.findElement(By.name("q")).sendKeys("Selenium HQ");
		firefoxdriver.findElement(By.name("btnG")).click();
		//find few links 
		SearchResult[0]=firefoxdriver.findElement(By.linkText("Videos")).getText();//linktext--Element Locator
		SearchResult[1]=firefoxdriver.findElement(By.linkText("News")).getText();
		System.out.println("Links to verify");
		System.out.println("Array first result: " +SearchResult[0]);
		System.out.println("Array second result: "+SearchResult[1]);
		//Conditional
		
		System.out.println("#######If statements###########");
		if(firefoxdriver.findElement(By.linkText("Videos")).isDisplayed()){
			System.out.println("Web Link Found");
		}
		/*if(firefoxdriver.findElement(By.id("resultstats")).getText().equals("Microsoft"))
		
		{
			System.out.println("Microsot present");
		}else
		{
			System.out.println("Microsoft not present");
					
		}*/
		//For Loop=Iterating the array
		
		System.out.println("##########For statements###########");
		for(String str:SearchResult){
			System.out.println(str);
			if (str.equals("News")){
				break;
			}
		}
			
			firefoxdriver.close();
			firefoxdriver.quit();
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
