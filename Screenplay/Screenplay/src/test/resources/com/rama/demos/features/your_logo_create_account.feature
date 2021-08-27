Feature: Crear cuenta
  Yo como clienta de una tienda online
  Necesito crear una cuenta de usuario
  Para buscar, comprar y pagar la ropa seleccionada.

  Scenario Outline: Crear cuenta de usuario
    Given "Jhoiner" Desea ir a la pagina de <url>
    When Ingresa a la pagina y hace el registro de usuario
      | emailAddress   | title   | firstName   | lastName   | password   | dateOfBirth   | company   | address   | addressLine   | city   | state   | postalCode   | information   | homePhone   | mobilePhone   | alias   |
      | <emailAddress> | <title> | <firstName> | <lastName> | <password> | <dateOfBirth> | <company> | <address> | <addressLine> | <city> | <state> | <postalCode> | <information> | <homePhone> | <mobilePhone> | <alias> |
    Then Valida que el usuario quede registrado <nombreUsuario>

    Examples:
      | url                                       | emailAddress               | title | firstName | lastName | password   | dateOfBirth | company      | address     | addressLine   | city     | state   | postalCode | information                   | homePhone | mobilePhone | alias       |nombreUsuario|
      | "http://automationpractice.com/index.php" | ppproulmge-1456@yopmail.com | Mr.   | Jhonatan  | Nagles   | 124@*#GLsa | 26-10-2011  | Atrato river | cra 164-567 | calle 164-567 | Norcross | Georgia | 30003      | Prueba de registro de usuario | 214567890 | 9876754567  | Mis compras |"Jhonatan Nagles"|


