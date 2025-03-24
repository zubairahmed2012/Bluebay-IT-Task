package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.Random;

public class ADD_Info extends BrowserSetup {
    @Test
    public void add_user_info() throws InterruptedException {
        //browser.get("http://test.uapp.uk/");
        Actions actions = new Actions(browser);

        Thread.sleep(8000);
        browser.findElement(By.xpath("//span[text()='Student']")).click();
        Thread.sleep(4000);

        browser.findElement(By.xpath("//button[text()=' Add Student']")).click();
        Thread.sleep(4000);

        clickOnElement(By.xpath("//div[@id='consultantId']//div[@class='css-19bb58m']"));
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(4000);
        browser.findElement(By.xpath("//div[text()='Muhammad  Usman']")).click();
        Thread.sleep(4000);


        clickOnElement(By.xpath("//div[text()='Select Preferred Country']/following-sibling::div"));
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(4000);

        browser.findElement(By.xpath("//div[text()='Canada']")).click();
        Thread.sleep(2000);


        Thread.sleep(2000);
        browser.findElement(By.xpath("//input[@placeholder='Enter First Name']")).sendKeys("Zubair");
        Thread.sleep(6000);

        Thread.sleep(2000);
        browser.findElement(By.xpath("//input[@placeholder='Enter Last Name']")).sendKeys("Ahmed");
        Thread.sleep(6000);

        Thread.sleep(2000);

        WebElement email = browser.findElement(By.xpath("//input[@placeholder='Enter Email']"));
        email.clear();
        email.sendKeys("zubairahmedsqa@gmail.com");
        Thread.sleep(8000);
        email.clear();


        Random random = new Random();
        int randomNumber = random.nextInt(100000);
        String randomEmail = "testuser" + randomNumber + "@gmail.com";
        browser.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys(randomEmail);
        Thread.sleep(6000);

        browser.findElement(By.xpath("//button[text()='Create Student']")).click();
        Thread.sleep(4000);

        browser.findElement(By.xpath("//button[text()='Complete Profile']")).click();
        Thread.sleep(12000);

    }
}