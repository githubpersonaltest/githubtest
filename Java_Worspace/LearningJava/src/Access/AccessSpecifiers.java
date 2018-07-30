package Access;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

/*
 Public-Class,package,subclass,world
 protected-class,package,subclass
 no modifier-Class,package
 private-class
  */

public class AccessSpecifiers {
//created Instance variable which is private(keep always in private-for encapsulation)
	//static-it is only associated with the class
	//Static final means it is a constant
	private static final String TEST_NAME="Goole Test With Selenium";//constant--static variable
	//two instance variable of type private
	private By searchbox=By.name("q");//By class invoke the name metod
	private By Searchbutton=By.cssSelector("button[name='btnK']");
	
//Now to provide access to this members.
	//Static access to the static variables
	public static String getTestname () {
		return TEST_NAME;
		}
	
	//getter access to private instance variables
	
	public By getsearchbox(){
		return searchbox;
	}
	
	public By getsearchbutton(){
		return Searchbutton;
	}
	//final arguments--This cannot be changed
	//As void it will not return any value
	public void search(final FirefoxDriver firefoxdriver, final String SearchTerm){
		System.out.println("########################");
		System.out.println("Search using String Search: " +SearchTerm);
		firefoxdriver.findElement(getsearchbox()).clear();
		firefoxdriver.findElement(getsearchbox()).sendKeys(SearchTerm);
		}
	//Overloading the same SEARCH Method with the searchTerm argument is interger
 
	public void search(final FirefoxDriver firefoxdriver, final int SearchTerm){
		System.out.println("########################");
		System.out.println("Search using String Search: " +SearchTerm);
		firefoxdriver.findElement(getsearchbox()).clear();
		firefoxdriver.findElement(getsearchbox()).sendKeys(String.valueOf(SearchTerm));
		}
	
	//Overloading the same SEARCH Method with the searchTerm variable arguments
	 
		public void search(final FirefoxDriver firefoxdriver, final String... SearchTerm){
			System.out.println("########################");
			System.out.println("###########SEARCH USING MULTIPLE DATA SET#############");
			WebElement Searchbox=firefoxdriver.findElement(getsearchbox());
	       for (String testdata :SearchTerm)
	       {
	    	   System.out.println("Search Data:" +testdata);
			firefoxdriver.findElement(getsearchbox()).clear();
		    Searchbox.sendKeys(testdata);
	       }
		}   
		//return type
	   public String clickdata(final FirefoxDriver firefoxdriver){
		   String buttonleble=firefoxdriver.findElement(getsearchbutton()).getText();
		   return buttonleble;
		   
		   
		   
		   
		   
	   
	       
			}
	
}
