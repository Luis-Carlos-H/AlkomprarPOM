package com.alkomprar.steps;

import com.alkomprar.pages.CarritoCompraPage;
import com.alkomprar.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class CarritoCompraStep {
    @Page
    CarritoCompraPage carritoCompraPage;
    @Step("Validar compra")
    public void validarCarrito(){
        carritoCompraPage.element(carritoCompraPage.classCarrito);
        EsperaImplicita.esperaImplicita(5);
    }
}
