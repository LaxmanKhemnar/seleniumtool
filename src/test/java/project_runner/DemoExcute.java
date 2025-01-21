
package project_runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features={"C:\\Users\\vivek.nityo\\eclipse-workspace\\HealthMonitoring\\src\\resource\\aiFeature\\Demo.feature"},
	    glue= {"steps"},
        plugin= {"pretty"},
        publish=true
		 )

public class DemoExcute extends AbstractTestNGCucumberTests {

}
