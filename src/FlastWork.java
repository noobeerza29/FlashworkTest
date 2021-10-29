import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlastWork {
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }
	@Test
	void Freelance() throws InterruptedException {
		System.out.println("Step : Freelance post work");
		 WebDriver driver = null;
	        String browser = "chrome";

	        if(browser.equalsIgnoreCase("chrome")) {
	            System.setProperty("webdriver.chrome.driver", "C:\\Users\\GuYeti\\Desktop\\chromedriver.exe");
	            driver = new ChromeDriver();
	        }
	        driver.get("https://flashwork.herokuapp.com/login2");
	        driver.manage().window().maximize();
	        System.out.println("Step : Login");
	        driver.findElement(By.id("email")).sendKeys("614259006");
	        driver.findElement(By.id("password")).sendKeys("12345678");
	        driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
	        System.out.println("Result : Login success");
	        Thread.sleep(5000);
	        driver.findElement(By.cssSelector(".MuiTypography-root:nth-child(3) .MuiListItemIcon-root")).click();
	        Thread.sleep(8000);
            String result1 = driver.findElement(By.xpath("/html/body/div/div/main/div[1]/nav/ol/h1")).getText();
            System.out.println("Step : post work");
            Thread.sleep(2000);
            assertEquals("เพิ่มงาน",result1);
	        driver.findElement(By.id("Work_name")).click();
	        driver.findElement(By.id("Work_name")).click();
	        driver.findElement(By.id("Work_name")).sendKeys("ท่องเที่ยว");
	        driver.findElement(By.id("exampleText")).click();
	        driver.findElement(By.id("exampleText")).sendKeys("ท่องเที่ยวทั่วไทย");
	        driver.findElement(By.name("main_cate_id")).click();
	        Thread.sleep(4000);
	        WebElement dropdow = driver.findElement(By.name("main_cate_id"));
	        Select drop = new Select(dropdow);
	        
	        drop.selectByValue("11");;
	        
	        
	        driver.findElement(By.name("sub_cate_id")).click();
	        Thread.sleep(4000);
	        WebElement dropdows = driver.findElement(By.name("sub_cate_id"));
	        Select dropp = new Select(dropdows);
	        
	        dropp.selectByValue("52");;
	        driver.findElement(By.id("Pk_name")).click();
	        driver.findElement(By.id("Pk_name")).sendKeys("ท่องเที่ยว3วัน2คืน");
	        driver.findElement(By.id("Pk_detail")).click();
	        driver.findElement(By.id("Pk_detail")).sendKeys("ท่องเที่ยวสุดสนุกหลังยุคโควิด");
	        driver.findElement(By.id("Pk_price")).click();
	        driver.findElement(By.id("Pk_price")).sendKeys("3500");
	       
	        
	        WebElement dropdown = driver.findElement(By.name("timeperiod"));
	        Select drops = new Select(dropdown);
	        
	        drops.selectByVisibleText("7 วัน");
     
	        String filePath ="C:\\Users\\GuYeti\\Desktop\\รูป\\1.jpg";
	        
	        WebElement uploadButton = driver.findElement(By.name("file"));
	        uploadButton.sendKeys(filePath);
	       
	        driver.findElement(By.xpath(" /html/body/div/div/main/div[2]/div/form/div/div/div[4]/div[2]/button")).click();
	        Thread.sleep(8000);
	        try {
				takeSnapShot(driver,"C://Users//GuYeti//Desktop//Freelanc.png");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        System.out.println("Result : post work success");
	        driver.close();
	        
	        
	       
	}
	@Test
	void Admin() throws InterruptedException {
		System.out.println("Step : Admin accept work");
		 WebDriver driver = null;
	        String browser = "chrome";

	        if(browser.equalsIgnoreCase("chrome")) {
	            System.setProperty("webdriver.chrome.driver", "C:\\Users\\GuYeti\\Desktop\\chromedriver.exe");
	            driver = new ChromeDriver();
	}
	        driver.get("https://flashwork.herokuapp.com/login2");
	        driver.manage().window().maximize();
	        System.out.println("Step : Login");
	        driver.findElement(By.id("email")).sendKeys("Admin");
	        driver.findElement(By.id("password")).click();
	        driver.findElement(By.id("password")).sendKeys("12345678");
	        driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
	        System.out.println("Result : Login success");
	        Thread.sleep(8000);
	        driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/p/ul[2]/a")).click();
	        Thread.sleep(8000);
	        driver.findElement(By.cssSelector(".MuiButton-label")).click();
	        System.out.println("Step : accept work");
	        Thread.sleep(8000);
	        driver.findElement(By.cssSelector(".MuiButton-containedPrimary > .MuiButton-label")).click();
	        Thread.sleep(8000);
	        String result1 = driver.findElement(By.xpath("/html/body/div/div/main/div/nav[1]/ol/h4")).getText();
            Thread.sleep(2000);
            assertEquals("รายละเอียด",result1);
            try {
				takeSnapShot(driver,"C://Users//GuYeti//Desktop//Admin.png");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        driver.findElement(By.cssSelector(".swal2-confirm")).click();
	        Thread.sleep(8000);
	       
	        Thread.sleep(8000);
	        driver.findElement(By.cssSelector(".MuiList-root > .MuiButtonBase-root")).click();
	        System.out.println("Result : accept work success");
	        driver.close();
		   
	}
	@Test
	void Emmployee() throws InterruptedException {
		System.out.println("Step : Emmployee Emmployment work");
		 WebDriver driver = null;
	        String browser = "chrome";

	        if(browser.equalsIgnoreCase("chrome")) {
	            System.setProperty("webdriver.chrome.driver", "C:\\Users\\GuYeti\\Desktop\\chromedriver.exe");
	            driver = new ChromeDriver();
	}
	        driver.get("https://flashwork.herokuapp.com/login2");
	        driver.manage().window().maximize();
	        System.out.println("Step : Login");
	        driver.findElement(By.id("email")).sendKeys("toeytoey14");
	        driver.findElement(By.id("password")).sendKeys("12345678");
	        driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
	        System.out.println("Result : Login success");
	        Thread.sleep(8000);
	        Thread.sleep(8000);
	        driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div/div[1]/a")).click();
	        System.out.println("Step : emmployment work");
	        Thread.sleep(8000);
	        driver.findElement(By.id("employ")).click();
	        driver.findElement(By.cssSelector(".btn-primary")).click();
	        Thread.sleep(2500);
	        try {
				takeSnapShot(driver,"C://Users//GuYeti//Desktop//Emmployee.png");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        Thread.sleep(8000);
            String result1 = driver.findElement(By.id("employmentE")).getText();
            Thread.sleep(2000);
            assertEquals("การจ้างงาน",result1);
	        driver.findElement(By.cssSelector(".MuiList-root > .MuiButtonBase-root")).click();
	        System.out.println("Result : employment success");
	        driver.close();
		   
	}
	
}
