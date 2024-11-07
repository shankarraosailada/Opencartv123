 package testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Baseclass {

 WebDriver driver;
 Properties p;
 Properties testdata;
  
        /*  @BeforeClass
          public void setup() throws IOException
          {
          driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://tutorialsninja.com/demo/");
          }*/
  
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br) throws IOException {
	      
		switch(br.toLowerCase())
		{
		case "chrome" : driver = new ChromeDriver();
		break;
		case "firefox" : driver = new FirefoxDriver();
		break;
		case "edge"   : driver = new EdgeDriver();
		break;
		default : System.out.println("invalid browser");
		return;
		}
		FileInputStream file1 = new FileInputStream("./src//test//resources//testdataconfig.properties"); 
		testdata = new Properties();
	      testdata.load(file1);
	      
	      //FileInputStream file = new FileInputStream("./src//test//resources//config.properties");
		 FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src//test//resources//config.properties");
			p = new Properties();
			p.load(file);
          
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(p.getProperty("appurl"));
		driver.manage().window().maximize();	
		
		
	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
	
	public String randomstring() {
		
		String generatedString = RandomStringUtils.randomAlphabetic(8);
		return generatedString;
		
	}
	
	public String randomnumber() {
		
		String generatedNumber = RandomStringUtils.randomNumeric(8);
	       return	generatedNumber;
	}
	
	public String alphanumeric() {
	
	String generatedString = RandomStringUtils.randomAlphabetic(5);
	String generatedNumber = RandomStringUtils.randomNumeric(4);
	return (generatedString + generatedNumber);
	}
	
	public String captureScreenShot(String tname) {
		Date dt = new Date();
		String timestamp = dt.toString().replace(" ","_").replace(":","_");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		String targetfilepath = System.getProperty("user.dir")+"//Screenshots//" +tname+ "_" +timestamp+ "_" +".png";
		File targetfile = new File(targetfilepath);
		sourcefile.renameTo(targetfile);
		return targetfilepath;
	}

	

	
}


