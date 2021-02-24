package Steps;

import org.openqa.selenium.chrome.ChromeDriver;
import pom.Empleos;
import pom.HomePage;

public class TestBase {

    protected ChromeDriver driver = Hooks.getDriver();
    protected HomePage homePage = new HomePage(driver);
    protected Empleos empleos = new Empleos(driver);

}
