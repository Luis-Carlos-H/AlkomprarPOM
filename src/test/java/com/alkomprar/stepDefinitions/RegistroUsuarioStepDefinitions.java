package com.alkomprar.stepDefinitions;

import com.alkomprar.steps.*;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;
import java.io.IOException;

public class RegistroUsuarioStepDefinitions {
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

    @Cuando("Ingresar un usuari Registrado")
    public void ingresarUnUsuariRegistrado() throws IOException {
        inicioStep.abrirCuenta();
        ingresarCorreoStep.IntCorreo();
        ingresarCorreoStep.ContinuarRegistro();
        inicioSesionStep.InicioSesion();
        contrasenaStep.IngresarContrasena();
    }
    @Entonces("podrá validar el Iniciar sesion")
    public void podráValidarElIniciarSesion() {
    confirmarCuentaStep.ConfirmarInicioSesion();
    }

}
