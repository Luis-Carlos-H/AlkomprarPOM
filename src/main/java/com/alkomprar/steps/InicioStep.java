package com.alkomprar.steps;

import com.alkomprar.pages.InicioPage;
import com.alkomprar.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.Keys;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class InicioStep {
    @Page
    InicioPage inicioPage;
    @Step("Abrir navegador")
    public void abrirUrl() throws IOException {
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Data.xlsx", "Url");
        String url=data.get(0).get("Url");
        inicioPage.openUrl(url);
    }
    @Step("Cerrar cookies")
    public void cerrarCoo(){
        inicioPage.buttonCookie.click();
    }
    @Step("Mi cuenta")
    public void abrirCuenta(){
    inicioPage.idCuenta.click();
    }

    @Step("Escribir en busqueda")
    public void busqueda() throws IOException {
        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("Data.xlsx", "Categoria");
        Random random= new Random();
        int indiceCategoria= random.nextInt(9);
        String categoria=data.get(indiceCategoria).get("Categoria");
        inicioPage.inputBusqueda.type(categoria);
        inicioPage.inputBusqueda.click();
        inicioPage.inputBusqueda.sendKeys(Keys.ENTER);
    }

}
