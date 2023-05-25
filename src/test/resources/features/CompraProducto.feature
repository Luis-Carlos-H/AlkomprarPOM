#language: es
  Característica: Compra producto
    @Compra
    Escenario: Compra producto con data externa
      Dado que el usuario abra la url en el navegador
      Cuando ingresar producto a buscar en la barra de busqueda
      Y seleccionar de forma aleatoria un producto y Agregarlo al carrito
      Entonces podrá validar que el producto quede dentro del carrito de compras
