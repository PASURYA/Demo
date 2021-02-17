package org.cts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginclass extends Baseclass{

	public static void main(String[] args) {
		
	   Loginclass l = new Loginclass();
	   l.getDriver();
	   l.getUrl("https://www.facebook.com/");
	   
	   Facebook f = new Facebook();
	   l.textEnter(f.getUsername(),"8870129712");
	   l.textEnter(f.getPassword(),"341981");
	   l.btnclick(f.getLogin());
	   
	   
	
		
		}
}