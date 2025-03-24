package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Start_node extends ADD_Info {
    @Test
    public void del_user_info() throws InterruptedException {

        
        browser.findElement(By.xpath("//span[text()='Student']")).click();
        Thread.sleep(4000);

        browser.findElement(By.xpath(" //input[@placeholder='UAPP ID, Name, Email']")).sendKeys("Zubair Ahmed");

        Thread.sleep(8000);
        browser.findElement(By.xpath("(//div[@role='group']//button)[3]")).click();
        Thread.sleep(4000);
        browser.findElement(By.xpath("//button[text()='Yes']")).click();
        Thread.sleep(8000);

    }
}