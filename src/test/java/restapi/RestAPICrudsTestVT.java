package restapi;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "not (@wip or @ignore or @manual)",
        features = "src/test/resources/features/lhr",
        plugin = {"pretty",  "html:target/cucumber/html/restAPI.html", "json:target/cucumber/json/RestAPI.json"},
        extraGlue = {"restapi.common"})
public class RestAPICrudsTestVT {
}
