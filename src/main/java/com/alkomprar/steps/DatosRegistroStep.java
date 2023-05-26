package com.alkomprar.steps;

import com.alkomprar.pages.DatosRegistroPage;
import com.alkomprar.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class DatosRegistroStep {
    @Page
    DatosRegistroPage datosRegistroPage;
    @Step("Ingrese nombre")
    public void IngresarNomdre(int indice) throws IOException {
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Data.xlsx", "Datos");
        String nombre=data.get(indice).get("Nombre");
        datosRegistroPage.idNombre.type(nombre);
    }
    @Step("Ingrese Apellidos")
    public void IngresarApellidos(int indice) throws IOException {
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Data.xlsx", "Datos");
        String apellidos=data.get(indice).get("Apellidos");
        datosRegistroPage.idApellidos.type(apellidos);
    }
    @Step("Ingrese Telefono")
    public void IngresarTelefono(int indice) throws IOException {
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Data.xlsx", "Datos");
        String telefono=data.get(indice).get("Telefono");
        datosRegistroPage.idTelefono.type(telefono);
    }
    @Step("Autorizar terminos")
    public void AutorizoTerminos(){
        datosRegistroPage.idAutorizo.click();
    }
    @Step("Continuar registro")
    public void ContinuarRegistro(){
        datosRegistroPage.buttonContinuar.click();
    }
}
