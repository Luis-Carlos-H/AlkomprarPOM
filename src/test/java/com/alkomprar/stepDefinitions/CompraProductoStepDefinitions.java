package com.alkomprar.stepDefinitions;

import com.alkomprar.steps.CarritoCompraStep;
import com.alkomprar.steps.InicioStep;
import com.alkomprar.steps.ProductosStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import java.io.IOException;

public class CompraProductoStepDefinitions {
    @Steps
    InicioStep inicioStep;
    @Steps
    ProductosStep productosStep;
    @Steps
    CarritoCompraStep carritoCompraStep;

    @Dado("que el usuario abra la url en el navegador")
    public void queElUsuarioAbraLaUrlEnElNavegador() throws IOException {
        inicioStep.abrirUrl();
        inicioStep.cerrarCoo();
    }
    @Cuando("ingresar producto a buscar en la barra de busqueda")
    public void ingresarProductoABuscarEnLaBarraDeBusqueda() throws IOException {
        inicioStep.busqueda();
    }
    @Cuando("seleccionar de forma aleatoria un producto y Agregarlo al carrito")
    public void seleccionarDeFormaAleatoriaUnProductoYAgregarloAlCarrito() {
        productosStep.clicProducto();
    }

    @Entonces("podrá validar que el producto quede dentro del carrito de compras")
    public void podráValidarQueElProductoQuedeDentroDelCarritoDeCompras() {
    carritoCompraStep.validarCarrito();
    }

}
