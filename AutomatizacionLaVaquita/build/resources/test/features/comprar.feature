#language:es
#encoding:UTF-8
#Author: Ivan Dario Ruiz Bernal

Característica: Compras en La Vaquita
  yo como cliente de la pagina La Vaquita
  quiero comprar productos
  para disfrutar de ellos

  Antecedentes:
    Dado que el usuario esta en la pagina de inicio
    Y navega hasta la el formulario de inicio de sesion y completa los campos
    Cuando busca arandanos y selecciona frutas y verduras en la categoria

  @CompraUnSoloProducto
  Escenario: Compra de productos
    Y selecciona uno de ellos, va al carrito y modifica su cantidad
    Y continua con el proceso, llenando el formulario y da click en realizar pedido
    Entonces sale un mensaje de gracias por su compra un numero de orden y un mensaje de envio por email