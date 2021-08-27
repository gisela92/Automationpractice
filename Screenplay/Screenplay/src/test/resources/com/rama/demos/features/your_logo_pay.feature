Feature: Comprar ropa
  Yo como clienta registrada en una tienda online
  Necesito loguearme en la pagina
  Para buscar, comprar y pagar la ropa seleccionada.

  Scenario Outline: Loguearse en la aplicacion y comprar
    Given "Jhoiner" Desea ir a la pagina de <url>
    When Ingresa datos de usuario y contrasenna
      | email    | <email>    |
      | password | <password> |
    And selecciona prenda y realiza el pago
      | dress    | <dress>    |
      | quantity | <quantity> |
      | size     | <size>     |
      | color    | <color>    |
    Then Valida que el pago quede realizado <nombreUsuario>

    Examples:
      | url                                       | email                     | password   | nombreUsuario     | dress               | quantity | size | color |
      | "http://automationpractice.com/index.php" | ppproulmge-16@yopmail.com | 124@*#GLsa | "Jhonatan Nagles" | Printed Chiffon Dress | 2        | M    | Blue  |


