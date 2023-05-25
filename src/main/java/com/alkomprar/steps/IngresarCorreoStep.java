package com.alkomprar.steps;

import com.alkomprar.pages.IngresarCorreoPage;
import com.alkomprar.utils.EsperaImplicita;
import com.alkomprar.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.Keys;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class IngresarCorreoStep {
    @Page
    IngresarCorreoPage ingresarCorreoPage;
    @Step("Ingresar correo")
    public void IntCorreo(int indice) throws IOException{
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Data.xlsx", "Datos");
        String correo=data.get(indice).get("Correo");
        ingresarCorreoPage.idIngresarCorreo.type(correo);
        ingresarCorreoPage.idIngresarCorreo.sendKeys(Keys.ENTER);
        EsperaImplicita.esperaImplicita(5);
    }

}
