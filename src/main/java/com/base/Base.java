package com.base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.io.PushbackInputStream;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Base {

    public static WebDriver driver;

    public static Actions act;

    public static Robot robot;

    public static void url( WebDriver driver,String value){
        driver.get(value);

    }

    public  static void maxi(WebDriver driver){
        driver.manage().window().maximize();
    }

    public static void input(WebElement ref, String value){
        ref.sendKeys(value);
    }

    public static void tab(WebElement ref){
        ref.click();
    }

    public static void selectIndex(WebElement ref,int num){
        Select s=new Select(ref);
        s.selectByIndex(num);
    }

    public static void selectValue(WebElement ref,String value){
        Select s=new Select(ref);
        s.selectByValue(value);
    }
    public static void selectVisible(WebElement ref,String value){
        Select s=new Select(ref);
        s.selectByVisibleText(value);
    }

    public static void moveToElement(WebDriver driver, WebElement ref){
        act=new Actions(driver);
        act.moveToElement(ref).perform();
    }

    public static void dragAndDrop(WebElement drag, WebElement drop){
        act=new Actions(driver);
        act.dragAndDrop(drag,drop).perform();
    }

    public static void contextClick(){
        act=new Actions(driver);
        act.contextClick().perform();
    }

    public static void acceptAlert(){


        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public static void dismissAlert(){
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public static void inputAlert(String value){


        Alert alert = driver.switchTo().alert();
        alert.sendKeys(value);

    }
    public static void enterRobot() {

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public static void copyRobot() {

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_C);
    }

    public static void switchFrame(WebElement ref){
        driver.switchTo().frame(ref);
    }

    public static void parentFrame(){
        driver.switchTo().parentFrame();
    }

    public static void defaultFrame(){
        driver.switchTo().defaultContent();
    }

    public static void screenshot(WebDriver driver,String value) throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File("C:\\DominosDemo\\DominoSnap"+value);
        FileUtils.copyFile(screenshotAs,destination);

    }

    public static void winHandle(WebDriver driver){
        String windowHandle = driver.getWindowHandle();
        driver.switchTo().window(windowHandle);
    }

    public static void winDefault(WebDriver driver){
        driver.switchTo().defaultContent();
    }

    public static void winHandles(WebDriver driver){
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        String parent = iterator.next();
        String child = iterator.next();
        driver.switchTo().window(child);
    }

    public static void winParent(WebDriver driver){
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();
        String parent = iterator.next();
        String child = iterator.next();
        driver.switchTo().window(parent);
    }

    public static void closeWin(WebDriver driver){
        driver.close();
    }






    public static void implicitWait(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
    }

    public static void scrollDown(WebDriver driver, WebElement ref){
        JavascriptExecutor scrollToView= (JavascriptExecutor) driver;
        scrollToView.executeScript("arguments[0].scrollIntoView",ref);
    }

    public static void scrollClick(WebDriver driver, WebElement ref){
        JavascriptExecutor scrollToClick= (JavascriptExecutor) driver;
        scrollToClick.executeScript("arguments[0].click()",ref);
    }

    public static void waitClick(WebDriver driver) throws InterruptedException {
        Thread.sleep(3000);
    }

}
