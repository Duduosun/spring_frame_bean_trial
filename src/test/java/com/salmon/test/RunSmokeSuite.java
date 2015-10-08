package com.salmon.test;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by tfasoyiro on 23/08/2015.
 */

@CucumberOptions(features = "target/test-classes/features/web",tags = {"@ExploreSmoke"}, monochrome = true,
        plugin = {"pretty","html:target/cucumber-report/RunSmokeSuite/html-reports",
        "json:target/cucumber-report/RunSmokeSuite/cucumber.json",
        "rerun:target/cucumber-report/RunSmokeSuite/rerun.txt"},
        glue = "com.salmon.test")
public class RunSmokeSuite extends AbstractTestNGCucumberTests {

}

//@CucumberOptions(features = "target/test-classes/features/web",tags = {"@FrameworkSmoke"}, monochrome = true,
//plugin = {"pretty","html:target/cucumber-report/RunSmokeSuite/html-reports",
//        "json:target/cucumber-report/RunSmokeSuite/cucumber.json",
//       "rerun:target/cucumber-report/RunSmokeSuite/rerun.txt"},
//        glue = "com.salmon.test")