package com.alkomprar.steps;

import com.alkomprar.pages.ConfirmarCuentaPage;
import com.alkomprar.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class ConfirmarCuentaStep {
    @Page
    ConfirmarCuentaPage confirmarCuentaPage;
    @Step("Confirmar inicio de sesion")
    public void ConfirmarInicioSesion(){
       confirmarCuentaPage.element(confirmarCuentaPage.classConfirmacion);
       EsperaImplicita.esperaImplicita(5);
    }
}
