package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Empleos extends BasePage{

   private By logoLocator = By.xpath("//*[@id=\"masthead\"]/div/div/div/div[1]/a/img");





    public Empleos(WebDriver driver){
        super(driver);
    }

    public void clickLogo() throws Exception {
        this.click(logoLocator);
    }

}
