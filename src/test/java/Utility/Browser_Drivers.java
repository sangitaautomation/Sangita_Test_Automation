package Utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browser_Drivers {

    public static void main(String[] args) {
WebDriver driver =new ChromeDriver();

         driver.get("https://www.google.com/");
       System.out.println(driver.getTitle());
       driver.close();
    }
//    public static WebDriver driver;
//    public Browser_Drivers(){
//        this. driver=new ChromeDriver();
//
//    }
//
//    public void close(){
//        this.driver.close();
//    }



}
