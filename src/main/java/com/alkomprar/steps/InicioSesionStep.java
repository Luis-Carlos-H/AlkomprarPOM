package com.alkomprar.steps;

import com.alkomprar.pages.InicioSesionPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class InicioSesionStep {
    @Page
    InicioSesionPage inicioSesionPage;
    @Step("Inicio de sesion con contraseña")
    public void InicioSesion(){
        inicioSesionPage.classInicioSesion.click();
    }

}
