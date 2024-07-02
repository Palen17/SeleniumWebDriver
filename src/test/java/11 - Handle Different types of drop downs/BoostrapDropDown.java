package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class BoostrapDropDown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();

        //Single option
       // driver.findElement(By.xpath("//input[@value='Java']")).click();

        //Capture all the options
        List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
        System.out.println(options.size());

        //Printing options from dropdown
        /*
        for (WebElement op:options){
            System.out.println(op.getText());
        }

         */

        //Select multiple options
        for (WebElement op:options){

            String option = op.getText();

            if (option.equals("Java") || option.equals("Python") || option.equals("MySQL")){
                op.click();
            }
        }
    }
}
