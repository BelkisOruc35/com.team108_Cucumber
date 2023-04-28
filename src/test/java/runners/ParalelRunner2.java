package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/paralelreport2.html",
                "json:target/json-reports/paralelreport2.json",
                "junit:target/xml-report/paralelreport2.xml"
        },
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@so",
        dryRun = false

)

public class ParalelRunner2 {

}
