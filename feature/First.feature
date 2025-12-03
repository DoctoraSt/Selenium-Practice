Feature: El usuario practica a usar Selenium

Scenario Outline: Abrir una página web y verificar el título
    Given El usuario navega a "https://the-internet.herokuapp.com/"
    Then El título de la página debe ser "The Internet"
    When El usuario busca una de las opciones del menú
    Then El usuario selecciona "Digest Authentication"
    Then Se muestra el modal de "<usuario>" y "<contraseña>"
    And Se selecciona el botón "Aceptar"

Examples:
| usuario | contraseña |
| admin   | admin      |
