package com.alkomprar.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DatosRegistroPage extends PageObject {
    @FindBy(how = How.ID, using = "register.firstName")
    public WebElementFacade idNombre;
    @FindBy(how = How.ID, using = "register.lastName")
    public WebElementFacade idApellidos;
    @FindBy(how = How.ID, using = "register.mobileNumber")
    public WebElementFacade idTelefono;
    @FindBy(how = How.XPATH, using = "(//label[@class='uncased'])[2]")
    public WebElementFacade idAutorizo;
    @FindBy(how = How.XPATH, using = "//button[@class='button-primary btn-block js-btn-register-myaccount']")
    public WebElementFacade buttonContinuar;

}
