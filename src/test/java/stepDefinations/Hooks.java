package stepDefinations;

import com.Cucumber.VeeruTestngapplicationname.Base;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base{
	
	@Before("@SeleniumTest")
	public void beforevaldiationmob()
	{
		System.out.println("Before Mobile  hook  <<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
		System.out.println();
	}
	
	
	@After("@SeleniumTest")
	public void afterevaldiationmob()
	{
		System.out.println("After Mobile  hook   <<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
		driver.close();    //After extending the Base class driver error is gone and chrome driver is available now 
		System.out.println();
	}
	
	@Before("@WebTest,@RegTest")
	public void beforevaldiationweb()
	{
		System.out.println("Before Web  hook  ^^^^^^^^^^^^^^^^^^^^");
		System.out.println();
	}
	
	
	@After("@WebTest and @RegTest")
	public void afterevaldiationweb()
	{
		System.out.println("After Web  hook  ^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println();
	}
	//Hooks defined in step definition level. Two Cucumber annotations (cucumber.api.java) not junit annotations 
	//1)Before       :
	//2)After   -post request
	//Hooks-Helps in setting up tear down and setup script. Like closing the browser or app, Deleting the data or the cookies
	//If we have common portal we will use only Background but here mobile is also involved so we use Hooks
	//When ever I am using Hooks it is telling that for every scenario I want to write my own pre-requsite rather than depending on Background
	//If you write hooks and again write Background that will leads to confusion and both of them will execute
	//Using background and Hooks for robust tests built 
}
