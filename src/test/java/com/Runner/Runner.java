package com.Runner;

import com.base.Base;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\DominosDemo\\src\\test\\FeatureFolder",glue = "com.StepDef", dryRun = false, monochrome = false)
public class Runner extends Base {

    @BeforeClass
    public static void start(){
        driver= new ChromeDriver();
    }


}
