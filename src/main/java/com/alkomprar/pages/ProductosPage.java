package com.alkomprar.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.List;

public class ProductosPage extends PageObject {
    @FindBy(how = How.XPATH,using = "//*[@class='alk-icon-carrito-plus']")
    public List<WebElementFacade> classProducto;
}
