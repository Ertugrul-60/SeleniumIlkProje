package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationOdev {
    // 1-ilk once ggogleye gidiniz
    //2-youtube gidiniz
    //3-google back metodu ile geri geliriniz
    //youtube forward ile geri geliniz
    //youtube yenileyiniz
    //quit ile kapatiniz
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/ERTUGRUL/Downloads/selenium dependencies/drivers/chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("http://google.com");
        webDriver.navigate().to("http://youtube.com");
        webDriver.navigate().back();
        webDriver.navigate().forward();
        webDriver.navigate().refresh();
        webDriver.quit();


    }

}
