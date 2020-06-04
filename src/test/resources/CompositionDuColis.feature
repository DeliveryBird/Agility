Feature: US_006 Composition du Colis
  En tant que "Eleveur d'oiseau"
  Je souhaite avoir la possibilité de séparer les oiseaux dans les colis
  Afin qu'ils ne se mangent pas entre eux

  Scenario : séparation des oiseaux dans les colis
    Given Un colis peut contenir d'autres colis afin de séparer les oiseaux
    When Le Livreur rempli le colis  avec l'oiseau
    Then Il pourra y mettre un colis ou un oiseau