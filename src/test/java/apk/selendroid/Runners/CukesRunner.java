package apk.selendroid.Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "apk/selendroid/Step_Definitions",
        dryRun = false,
        tags = "@wip",
        strict=true,
        monochrome = false
)
public class CukesRunner {

}
