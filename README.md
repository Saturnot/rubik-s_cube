1 : red
2 : blue
3 : orange
4 : green
5 : white
6 : yellow

# Simulateur de Rubik's Cube

Ce projet Java simule un Rubik's Cube avec des fonctionnalités de mouvements et d'interaction utilisateur en ligne de commande.

## Utilisation

1. **Lancement du Programme :**
   - Exécutez la classe `Main` pour démarrer le programme.
   - Le programme vous permet de créer un nouveau Rubik's Cube et d'effectuer divers mouvements.

2. **Commandes Disponibles :**
   - `help`: Affiche la liste des commandes disponibles.
   - `close`: Ferme le programme.
   - `new`: Crée un nouveau Rubik's Cube avec une taille spécifiée.
   - Mouvements du cube :
      - `R`, `R'`, `L`, `L'`, `U`, `U'`, `D`, `D'`, `F`, `F'`.

## Classes

### `Main`

La classe principale qui gère l'interaction utilisateur et lance le programme.

### `RubiksCube`

Représente le Rubik's Cube et contient les méthodes pour effectuer différents mouvements.

### `RubiksSide`

Représente un côté du Rubik's Cube avec des méthodes pour effectuer des rotations et obtenir des informations sur les valeurs.

### `Tools`

Contient des outils utilitaires, comme la méthode pour inverser un tableau.
