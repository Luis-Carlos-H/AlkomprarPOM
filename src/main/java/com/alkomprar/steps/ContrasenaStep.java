package com.alkomprar.steps;

import com.alkomprar.pages.ContrasenaPage;
import com.alkomprar.utils.EsperaExplicita;
import com.alkomprar.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.Keys;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class ContrasenaStep {
    EsperaExplicita esperaExplicita = new EsperaExplicita();

    @Page
    ContrasenaPage contrasenaPage;
    @Step("Ingresar contraseña")
    public void IngresarContrasena() throws IOException{
        esperaExplicita.esperarCargaPagina(contrasenaPage.getDriver());
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Data.xlsx", "Datos");
        String contrasena=data.get(0).get("Contrasena");
        contrasenaPage.idContrasena.sendKeys(contrasena,Keys.ENTER);
    }
}
