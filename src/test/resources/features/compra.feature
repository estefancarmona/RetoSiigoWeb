#language: es

Característica: Proceso de compra de un Play Station 5 en la pagina de Falabella
  Se quiere  la compra de un producto en una pagina web

  Esquema del escenario: Realizar la compra de un producto de tecnologia en una pagina web
    Dado que el usuario ingreso al navegador
    Y busca la pagina de falabella
    Y realiza la busqueda del producto a comprar
      | producto   |
      | <producto> |
    Cuando agrega el producto a la bolsa de compra
    Y aumenta la cantidad del producto
    Y extiende la garantia del producto
    Entonces se valida el resumen de la compra
    Ejemplos:
      | producto    |
      | Consola PS5 |