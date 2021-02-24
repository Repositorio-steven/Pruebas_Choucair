package Steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static ChromeDriver driver;
    private static int nunCase = 0;

    @Before
    public void setUp(){

        nunCase ++;
        System.out.println("Se esta ejecutando el escenario " + nunCase);

        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.choucairtesting.com/");
        driver.manage().window().maximize();

    }

    @After
    public void tearDown (){

        System.out.println("El escenario numero " +  nunCase +  " Se ejecuto correctamente");
        driver.quit();
    }

    public static ChromeDriver getDriver(){

        return driver;
    }
}
