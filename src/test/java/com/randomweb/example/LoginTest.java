package com.randomweb.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest {

    WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://imgbb.com/");

        WebElement signIn = driver.findElement(By.xpath("//span[@class='text phone-hide phablet-hide']"));
        signIn.click();

        WebElement login = driver.findElement(By.id("login-subject"));
        login.sendKeys("dnmr77ooc@adelaide.bike");

        WebElement password = driver.findElement(By.id("login-password"));
        password.sendKeys("!User123456");

        WebElement loginBtn = driver.findElement(By.xpath("//button[@class='btn btn-input default']"));
        loginBtn.click();

        WebElement uploadBtn = driver.findElement(By.xpath("//span[@class='btn-text']"));
        uploadBtn.click();

        





    }




}
