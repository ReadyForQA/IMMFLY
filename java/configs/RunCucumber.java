package configs;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/IMMFLY/resources/features",
        glue = "definitions",
        tags = "@BAU-123",
        publish = true
)
public class RunCucumber {

    public RunCucumber()
    {

    }

}
