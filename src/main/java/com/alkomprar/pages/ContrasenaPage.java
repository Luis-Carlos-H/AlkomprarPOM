package com.alkomprar.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ContrasenaPage extends PageObject {
    @FindBy(how = How.ID, using = "j_password")
    public WebElementFacade idContrasena;

}
