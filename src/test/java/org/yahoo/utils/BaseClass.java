package org.yahoo.utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public WebDriver launchBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		return driver;
	}
	
	public void lauchapp(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void sendValue(WebElement element,String value) {
		element.sendKeys(value);
	}
	
	public void tap(WebElement element) {
		element.click();	
	}
	
	public void ScreenShot(String name) {
		
		try {
			TakesScreenshot tk=(TakesScreenshot)driver;
			File input = tk.getScreenshotAs(OutputType.FILE);
			File output =new File("C:\\java\\"+name+".png");
			FileUtils.copyFile(input, output);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void closeWindow() {
		driver.close();
		
	}

}
