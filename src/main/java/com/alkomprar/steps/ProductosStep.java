package com.alkomprar.steps;
import com.alkomprar.pages.ProductosPage;
import com.alkomprar.utils.EsperaExplicita;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import java.util.Random;

public class ProductosStep {
    EsperaExplicita esperaExplicita = new EsperaExplicita();
    @Page
    ProductosPage productosPage;
    @Step("clic en busqueda")
    public void clicProducto(){
        esperaExplicita.esperarCargaPagina(productosPage.getDriver());
        int tamanoArregloArticulos=productosPage.classProducto.size();
        Random random= new Random();
        int indiceDelArticulo= random.nextInt(tamanoArregloArticulos);
        productosPage.classProducto.get(indiceDelArticulo).click();
    }
}
