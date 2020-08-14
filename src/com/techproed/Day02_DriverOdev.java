package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:/Users/ERTUGRUL/Downloads/selenium dependencies/drivers/chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
        webDriver.navigate().refresh();
        webDriver.get("http://google.com");
        String sayfaTitle=webDriver.getTitle();
        System.out.println(sayfaTitle);

        webDriver.get("http://youtube.com");
        String sayfaUrl=webDriver.getCurrentUrl();
        String sayfaTitle2=webDriver.getTitle();
        System.out.println(sayfaTitle2);
        System.out.println(sayfaUrl);

        webDriver.navigate().back();
        String sayfaUrl2=webDriver.getCurrentUrl();
        System.out.println(sayfaUrl2);
        webDriver.quit();




    }

}
