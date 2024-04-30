package com.example;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Log4jExample {
    final Logger logger = Logger.getLogger(getClass());
    @Test
    public void shouldAnswerWithTrue()
    {
		PropertyConfigurator.configure("C:\\Users\\nithi\\OneDrive\\Desktop\\day10\\demo\\src\\main\\java\\com\\example\\app.properties");
		  WebDriverManager.chromedriver().setup();
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
          logger.info("open url");
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

          driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
          logger.info("enter username");
          driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
          logger.info("enter password");
          driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
          for(int i=0;i<10000;i++)
          logger.info("click login button");

    }
}
driver.get.class.findElement(By.xpath(xpathExpressions:"//*[id='app']/div[1]/"))
{
   * InnerLog4jExample
 insert.get.pal.getinfo  */
  public interface InnerLog4jExample {
    insert.get.pal.getinfo
  
    }3rffefefefefefefefefefefefefefefefefefefefefefefefefeffeery
  }
