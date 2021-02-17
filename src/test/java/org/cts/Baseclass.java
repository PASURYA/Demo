package org.cts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.text.Element;

import org.apache.poi.ss.formula.SheetNameFormatter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver   driver;
private void meth() {
	System.out.println("demo");

}
	public static void getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace2\\Company\\driver\\chromedriver.exe");
		
		driver=new ChromeDriver();
        driver.manage().window().maximize();
	}
	public static void getUrl(String Url) {
		driver.get(Url);
}
	public void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
}
	public void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		}
	
	public void textEnter(WebElement element,String data) {
		element.sendKeys(data);
}
	
	
	public static void btnclick(WebElement element) {
		element.click();
	
	}
	public static void close() {
		driver.close();
}
	public void quite() {
		driver.quit();
	}
	public void getText(WebElement element,String txt) {
		String text = element.getText();
     System.out.println(text);	

		}
	public void getAttribute(WebElement element,String value) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);

	}
	
		
	public void moveToElement(WebElement element ) {
		Actions acc= new Actions(driver);
		acc.moveToElement(element).perform();

	}
	public void doubleclick() {
		Actions acc= new Actions(driver);
		acc.doubleClick().perform();

	}
	public void rightClick(WebElement element) {
		Actions acc = new Actions(driver);
		acc.contextClick(element);

	}
	public void dragAndDrop(WebElement element1,WebElement element2) {
	Actions acc = new Actions(driver);
	acc.dragAndDrop(element1,element2).perform();

	}
	
	public  void getoption(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i <options.size(); i++) {
			WebElement element2 = options.get(i);
	}
     }
	public void selectByIndex(WebElement element,int string) {
	Select select = new Select(element);
	select.selectByIndex(string);
	}
	public void selectByvisbileText(WebElement element,String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
		}
	

      }
			
	
	
	
		
		
		

	


