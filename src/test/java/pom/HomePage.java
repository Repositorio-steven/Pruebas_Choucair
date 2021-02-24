package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private String titleHomePAge = "Choucair Testing";
    private By empleosLocator = By.id("menu-item-550");
    private By pageTitleLocator = By.xpath("//*[@id=\"slideshow\"]/div[2]/div/h2");
    private String titlePage =  "Pruebas de software centradas en su negocio";



    public HomePage(WebDriver driver){
        super(driver);
    }

    public boolean homePageIsDisplay() throws Exception {
        return this.getTitle().equals(titleHomePAge);
    }

    public void clickTitle() throws Exception {
        this.click(empleosLocator);
    }

    public boolean isTitleChoucair() throws Exception {
        return this.isDisplay(pageTitleLocator) && this.getText(pageTitleLocator).equals(titlePage);
    }

}
