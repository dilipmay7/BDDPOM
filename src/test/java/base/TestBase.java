package base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
public static WebDriver driver;
public static Properties prop;
public TestBase()
{
	prop=new Properties();
	String path=System.getProperty("user.dir")+"//src//test//resources//configFiles//config.propeties";
	FileInputStream fin ;
	try{
		fin=new FileInputStream(path);

	prop.load(fin);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}

	public static void initialize()
	{
		String strbrowser=prop.getProperty("browser");
		if(strbrowser.equalsIgnoreCase("edge"))
		{	WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if(strbrowser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(prop.getProperty("url"));
}
}