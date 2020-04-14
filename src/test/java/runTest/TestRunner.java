package runTest;

//import org.testng.annotations.Test;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefinations", tags="@SeleniumTest" ,
		plugin = {"pretty","html:target/cucumber" , "json:target/cucumber.json","junit:target/cukes.xml"},
				strict=true,monochrome=true
		        )

/*@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefinations", tags="@SmokeTest,@RegTest,@MobileTest,@WebTest" ,
		plugin = {"pretty","html:target/cucumber" , "json:target/cucumber.json","junit:target/cukes.xml"},
		strict=truemonochrome=true
		        )*/
		//features="src/test/java/features",
//1)Tags		//glue="stepDefinations")//,tags="@SmokeTest,@RegTest")
//2)Reports:	//1)plugin = { "pretty", "html:target/cucumber-reports" })
                //2)"json:target/cucumber.json"
                //3)junit:target/cukes.xml
                //4)monochrome=true  (Gives neat, detailed and readable format output removing symbols like question mark ,ash etc and shows report in readble manner) 
//3)Attributes:	//dryRun=false (It will not run the test cases it will only scan all the test cases and in results it will tell you if any of the testcases are mapped to its corresponding step definations.If it is not mapped it will show you in output asking you t implement.If tidy gerkin is not avilable this can be used to generate the step defination to the feature files and also visvara-Code coverage 100 dryRun=true manager uses )
		       //strict=true  (If there is a pending step the test cases are passed, if we do not  want to pass any step which has missing implementation and we are very strict we put an attribute called strict. it will definatly check each and every implementation, if some thing is not matching your results will be failed. make this habit it will exclude getting bugs
         //Refer: https://cucumber.io/docs/cucumber/api/
public class TestRunner {

}