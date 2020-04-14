package com.Cucumber.VeeruTestngapplicationname;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	public static String sFolderPath=null;
	//3)*Create Base driver file to build the startup functions
	//we have created Base class to 2)*Centralize the driver object across the framework 
	//we are creating a method in Base class and bringing the code from MyStep definitions.java
	//Here i am making Web driver global variable and get driver() method as static so that i can access them outside the class with out creating an object
	public static WebDriver getdriver() throws IOException {
		
		//Properties prop=new Properties();  //make prop as global variable
		prop=new Properties();
		sFolderPath=System.getProperty("user.dir");
		//String FileName=sFolderPath+"\\Results\\ResultReports\\AutomationTestSummaryReport.html";
		//FileInputStream fis=new FileInputStream("D:\\VeeruCucumberTestng\\VeeruTestngapplicationname\\src\\test\\java\\com\\Cucumber\\VeeruTestngapplicationname\\global.properties");  //as an argument send the path of global.properties file
		FileInputStream fis=new FileInputStream(sFolderPath+"\\src\\test\\java\\com\\Cucumber\\VeeruTestngapplicationname\\global.properties");
		//prop.load(inStream);   //stream cannot be resolved as variable so we need to creare FileInputStream
		prop.load(fis);    //add throws decelerations
		//prop.getProperty("url");  // pass this in driver.get() method as we will be launching url in that step
		
		//System.setProperty("webdriver.chrome.driver", "D:\\VeeruCucumberTestng\\VeeruTestngapplicationname\\Library\\Driver\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", sFolderPath+"\\Library\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/");
		driver.get(prop.getProperty("url"));
		return driver;
	}

}
