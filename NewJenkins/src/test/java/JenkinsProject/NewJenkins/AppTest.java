package JenkinsProject.NewJenkins;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AppTest 
{
   WebDriver driver;
   
    @Test
    public void shouldAnswerWithTrue()
    {
        WebDriver driver= new ChromeDriver ();
        driver.get("https://www.target.com/");
    }
}
