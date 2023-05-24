package com.alkomprar.steps;
import com.alkomprar.pages.ProductosPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import java.util.Random;

public class ProductosStep {
    @Page
    ProductosPage productosPage;
    @Step("clic en busqueda")
    public void clicProducto(){

        int tamanoArregloArticulos=productosPage.classProducto.size();
        Random random= new Random();
        int indiceDelArticulo= random.nextInt(tamanoArregloArticulos);
        productosPage.classProducto.get(indiceDelArticulo).click();
    }
}
