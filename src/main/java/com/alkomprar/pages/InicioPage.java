package com.alkomprar.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.*;
public class InicioPage extends PageObject {
    @FindBy(how = How.XPATH, using = "//button[@class='button-primary js-cookie-notification-accept']")
    public WebElementFacade buttonCookie;
    @FindBy(how = How.ID, using = "js-site-search-input")
    public WebElementFacade inputBusqueda;
    @FindBy(how = How.XPATH, using = "//*[@id='js-myaccount-header']")
    public WebElementFacade idCuenta;
}
