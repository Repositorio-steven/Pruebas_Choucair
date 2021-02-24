Feature: Seccion Empleos
  Como usuario quiero navegar en la pagina de CHOUCAIR en la seccion empleos

  Scenario: Ingresar al home desde la seción de empleos
    Given El usuario se en encuentra en la pagina de Home de Choucair
    When hace click sobre la seccion de empleos
    When hace click en el icono de Choucair
    Then Se debe redirigir a la Home de Choucair
