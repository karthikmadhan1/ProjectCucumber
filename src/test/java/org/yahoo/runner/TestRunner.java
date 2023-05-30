package org.yahoo.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\Log.feature",glue = "org\\yahoo\\stepdef",dryRun = false
,monochrome = true,plugin = {"pretty","html:name.html","pretty","json:name.json","rerun:target\\failed.txt"})
public class TestRunner {

}
     