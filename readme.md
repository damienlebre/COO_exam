*********************************************************************************************************************************************************
<<<-----------------------------------------------------REPONSES QUESTIONNAIRE---------------------------------------------------------------------->>>>>
*********************************************************************************************************************************************************


1) Le code source ci-dessous représente i’implémentation de 2 objets. Quel est le pattern
   utilisé afin de créer ces instances ?

    Il s'agit dans cette exemple du pattern Factory

2) Quels sont les composants de ce pattern de conception (indiquez leur nom et leur
   fonction) ?
le pattern Factory comprend les éléments suivants :
                                                    1 Une interface ou classe abstraite qui définis la 
                                                       la méthode de création (Factory).
                                                    
                                                    2 Des sous-classe concrètes qui implémentent la méthode de 
                                                      de création et produit des sous objets spécifiques (ConcreteFactory).
                                                    
                                                    3  Des produits (les objets créés par cette classe).


3) Expliquez le fonctionnement du design pattern Builder. Donnez 3 cas concrets pour
   justifier son utilisation.

Le pattern de conception Builder est utilisé pour créer des objets complexes étape par étape.
Il permet de construire un objet en décomposant le processus de création en plusieurs étapes distinctes.

En cas d'utilisation on peut imaginer :
                                          1 Création d'un personnage dans un jeu vidéo, le pattern Builder
                                            pour créer des personnages de jeu avec des caractéristiques spécifiques,
                                            comme le nom, la classe et les compétences, en spécifiant uniquement ce qui
                                            est nécessaire pour chaque personnage.
                                          
                                          2 Création de formulaires en ligne : Utilisez le pattern Builder pour construire
                                            des formulaires web en ajoutant un champ à la fois, comme un champ texte ou une
                                            case à cocher, pour créer des formulaires personnalisés.

                                          3 Création d'une salade personnalisé dans un restaurant : on commence par choisir une base,
                                            comme de la variété de salade (mache, feuille de chêne,...). Ensuite, on ajoute des ingrédients supplémentaires
                                            tels que des légumes, viande,  garnitures et une sauce. À chaque étape, on personnalise un élément de la salade.
                                       



4) Donnez les différents composants du pattern Builder (expliquez pour chacun son rôle au
   sein du pattern).

- Le builder :  Interface qui fournit les grandes étapes de construction d’unb objet complexe.

- Le builder concret : Classe qui construit les différentes parties de l’objet complexe.

- Le directeur : Fournit le plan de création d’un objet complexe.

- Le produit : Il est le résultat du builder. L’objet confectionné par les composants ci-dessus.


5) Donnez les différents composants du pattern composite (expliquez pour chacun son rôle au sein du pattern).

- Composant : Interface ou classe abstraite qui définit les méthodes communes à tous les objets.

- Feuille : Classe qui implémente l’interface Composant. Les feuilles représentent des objets individuels
  qui ne peuvent pas avoir de composant enfants.

- Composite : Classe qui implémente l’interface Composant. Les composites peuvent avoir des éléments enfants.
  Cette méthode contiendra des méthodes pour ajouter et supprimer des composants enfants.