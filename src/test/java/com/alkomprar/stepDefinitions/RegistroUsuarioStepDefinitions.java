package com.alkomprar.stepDefinitions;

import com.alkomprar.steps.DatosRegistroStep;
import com.alkomprar.steps.IngresarCorreoStep;
import com.alkomprar.steps.InicioStep;
import io.cucumber.java.es.Cuando;
import net.thucydides.core.annotations.Steps;
import java.io.IOException;

public class RegistroUsuarioStepDefinitions {
    @Steps
    DatosRegistroStep datosRegistroStep;
    @Steps
    InicioStep inicioStep;
    @Steps
    IngresarCorreoStep ingresarCorreoStep;
    @Cuando("ingresar un correo valido")
    public void ingresarUnCorreoValido() throws IOException {
       int indice=1;
       inicioStep.abrirCuenta();
       ingresarCorreoStep.IntCorreo(indice);
       datosRegistroStep.IngresarNomdre(indice);
       datosRegistroStep.IngresarApellidos(indice);
       datosRegistroStep.IngresarTelefono(indice);
       datosRegistroStep.AutorizoTerminos();
       datosRegistroStep.ContinuarRegistro();
    }
}
