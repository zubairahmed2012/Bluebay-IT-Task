package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BrowserSetup {
    public WebDriver browser;


    @BeforeSuite
    public void startBrowser() throws InterruptedException {
        browser = new ChromeDriver();

        browser.manage().window().maximize();

        browser.get("http://test.uapp.uk");
        Thread.sleep(6000);


        browser.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("yadiga1784@adosnan.com");

        Thread.sleep(2000);
        browser.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Sqa1212");
        browser.findElement(By.xpath("//button[@type='submit']")).click();

    }


    @AfterSuite
    public void quitBrowser() {
        browser.findElement(By.xpath("//img[@alt='avatar']")).click();

        browser.findElement(By.xpath("//div[@class='dropdown-divider']/following-sibling::a[1]")).click();
        browser.quit();
    }

    public WebElement getElement(By locator) {
        return browser.findElement(locator);
    }

    public void writeOnElement(By locator, String text) {
        getElement(locator).clear();
        getElement(locator).sendKeys(text);
    }

    public Boolean displayStatus(By locator) {
        return getElement(locator).isDisplayed();
    }

    public void clickOnElement(By locator) {
        getElement(locator).click();
    }
}

