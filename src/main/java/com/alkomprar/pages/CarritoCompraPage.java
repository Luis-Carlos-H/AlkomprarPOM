package com.alkomprar.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CarritoCompraPage extends PageObject {
    @FindBy(how = How.XPATH,using = "//*[@class='sucess-message sucess-message-alkomprar']")
    public WebElementFacade classCarrito;
}
