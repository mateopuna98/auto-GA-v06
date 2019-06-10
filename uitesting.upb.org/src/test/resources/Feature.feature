Feature: "Realizar una transferencia"
  Scenario:Verificar ventana de transferencias es cargada
    Given Browser is loaded
    And Window is maximized
    And Link is "http://localhost:8080/"
    Then Search Transfer button
    And Title is "TRANSFERIR"
    Then Click Transfer button
    #Then Search Transfer window
    And Title is visible
    And Window Title is "Transferencia"
    Then Search Account field
    Then Search Amount Field
    Then Search Close Button
    And Button Title is "CERRAR"
    Then Search Button "Transferencia"
    And  The Title is "TRANSFERIR"


