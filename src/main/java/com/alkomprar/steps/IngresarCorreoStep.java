package com.alkomprar.steps;

import com.alkomprar.pages.IngresarCorreoPage;
import com.alkomprar.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class IngresarCorreoStep {
    @Page
    IngresarCorreoPage ingresarCorreoPage;
    @Step("ingresar correo")
    public void IntCorreo() throws IOException{
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Data.xlsx", "Correo");
        String correo=data.get(0).get("Correo");
        ingresarCorreoPage.idIngresarCorreo.type(correo);
    }

    @Step("Continuar registro")
    public void ContinuarRegistro(){
        ingresarCorreoPage.idContinuarCorreo.click();
    }

}
