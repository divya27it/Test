package Cucucmber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
@CucumberOptions(features ="C:/users/admin/ideaprojects/Project5/src/main/feature",
        glue ={"Cucucmber"},
plugin={"pretty","html:target/Htmlreports.html"})

public class Runnerclass {

}










