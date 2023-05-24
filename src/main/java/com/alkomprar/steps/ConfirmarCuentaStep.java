package com.alkomprar.steps;

import com.alkomprar.pages.ConfirmarCuentaPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class ConfirmarCuentaStep {
    @Page
    ConfirmarCuentaPage confirmarCuentaPage;
    @Step("confirmar inicio de sesion")
    public void ConfirmarInicioSesion(){
       confirmarCuentaPage.element(confirmarCuentaPage.classConfirmacion);
    }
}
