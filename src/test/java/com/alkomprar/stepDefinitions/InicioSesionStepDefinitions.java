package com.alkomprar.stepDefinitions;

import com.alkomprar.steps.*;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;
import java.io.IOException;

public class InicioSesionStepDefinitions {
    @Steps
    InicioStep inicioStep;
    @Steps
    IngresarCorreoStep ingresarCorreoStep;
    @Steps
    InicioSesionStep inicioSesionStep;
    @Steps
    ContrasenaStep contrasenaStep;
    @Steps
    ConfirmarCuentaStep confirmarCuentaStep;

    @Cuando("ingresar un usuari Registrado")
    public void ingresarUnUsuariRegistrado() throws IOException {
        inicioStep.abrirCuenta();
        ingresarCorreoStep.IntCorreo(0);
        inicioSesionStep.InicioSesion();
        contrasenaStep.IngresarContrasena();
    }
    @Entonces("podrá validar el Iniciar sesion")
    public void podráValidarElIniciarSesion() {
    confirmarCuentaStep.ConfirmarInicioSesion();
    }

}
