package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"html:target/paralelreport1.html",
                    "json:target/json-reports/paralelreport1.json",
                    "junit:target/xml-report/paralelreport1.xml"
            },
            features = "src/test/resources/features",
            glue = "stepdefinitions",
            tags = "@so",
            dryRun = false

)
    public class ParalelRunner1 {
    }

