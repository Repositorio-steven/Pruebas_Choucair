package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.Empleos;
import pom.HomePage;

public class Test extends TestBase {



    @Given("^El usuario se en encuentra en la pagina de Home de Choucair$")
    public void el_usuario_se_en_encuentra_en_la_pagina_de_Home_de_Choucair() throws Throwable {

        Assert.assertTrue(homePage.homePageIsDisplay());
    }

    @When("^hace click sobre la seccion de empleos$")
    public void hace_click_sobre_la_seccion_de_empleos() throws Throwable {
        homePage.clickTitle();

    }

    @When("^hace click en el icono de Choucair$")
    public void hace_click_en_el_icono_de_Choucair() throws Throwable {
       empleos.clickLogo();
    }

    @Then("^Se debe redirigir a la Home de Choucair$")
    public void se_debe_redirigir_a_la_Home_de_Choucair() throws Throwable {

        Assert.assertTrue("No se encontro la pagina", homePage.isTitleChoucair());



    }

}
