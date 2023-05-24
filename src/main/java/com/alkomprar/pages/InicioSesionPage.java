package com.alkomprar.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class InicioSesionPage extends PageObject {
    @FindBy(how = How.XPATH, using = "(//*[@class='login-options__option--description'])[6]")
    public WebElementFacade classInicioSesion;
}
