Feature: US_006 Parcourir le contenu du colis


  Recherche d'oiseau dans le colis
  En tant que "Eleveur d'oiseau"
  Je souhaite pouvoir chercher ou se trouve mon oiseau dans le colis
  Afin de faciliter la livraison

  Scenario : Recherche d'oiseau dans le colis
    Given Un colis contient d'autres colis
    When l'éleveur parcourt la composition de son colis 
    Then trouver facilement les oiseaux lors de la livraison
