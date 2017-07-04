## Etape 1

Matérialiser dans votre workspace Eclipse votre propre copie du projet Maven présent dans ce dépôt.

Pour ce faire, vous pouvez décider de :

- jouer complètement le jeu de l'utilisation de Git/Github (fork, clone)
- vous passer de Git et simplement télécharger le contenu du dépôt

:question: : Observez les fichiers **pom.xml** et **persistence.xml**

## Etape 2

Executer les commandes suivantes et interpréter le compte-rendu d'exécution : 

- **mvn clean compile**
- **mvn clean test**

## Etape 3

Le fichier persistence.xml est incomplet, basez vous sur vos connaissances et les éléments identifiant la base de données pour le compléter.

Corriger également le nom de l'unité de persistence en vous basant sur le nom utilisé dans **VilleJpaTest**

:question: Observer une évolution dans le message d'erreur rencontré lors de l'exécution du test **VilleJpaTest** qui peut vous permettre de penser que votre configuration est pertinente.

## Etape 4

Enrichir la classe Ville en mettant en place le mapping avec la table CITIES en utilisant les annotations JPA.

Votre mapping pourra être considéré comme valide à partir du moment où **VilleJpaTest** sera passant (ou le résultat de la commande **mvn clean test** en SUCCESS)

:question: Avez vous essayé de mettre des annotations à la fois sur les attributs et les getters de la classe **Ville** ?

:question: Observer la structure de la classe **VilleJpaTest**, en particulier la façon dont est déclarée la méthode de test ainsi que les instructions utilisées pour vérifier la bonne correspondance entre le résultat attendu et le résultat obtenu.

## Etape 5

Enrichir le test unitaire et mapping pour également couvrir la latitude et la longitude

## Etape 6

Ajouter dans Eclipse la "Vue" **Data Source Explorer** qui vous permet de vous connecter à la base de données et de l'explorer.
Dans cette vue, sur l'élément représentant votre connexion vous pouvez via clic droit > Open SQL Scrapbook ouvrir une fenêtre vous permettant d'exécuter une requête SQL.

Exécuter une requête via ce client intégré et constater que le résultat est le même que celui que vous auriez obtenu avec un client SQL classique.

## Etape 7

Utiliser la fonction **Generate Entities** from Table de **JPA Tools** pour générer l'entité **Monument** (ne pas se préoccuper de la relation avec la ville pour l'instant).

Observer le résultat et le comparer avec votre mapping de la classe **Ville**, puis écrire un nouveau test unitaire **MonumentJpaTest** à l'image du test unitaire déjà existant pour les villes.

Une fois le test passant, en profiter pour essayer de refactorer la classe **Monument** à votre goût

## Etape 8

Matérialiser la relation entre les classes **Ville** et **Monument** au sens Java.

Une fois que vous êtes satisfait de cette modélisation, enrichissez l'une des classes de test afin d'ajouter un nouveau scénario dont l'objectif sera de tester que la relation est bien chargée. L'objectif est que ce nouveau test compile mais qu'il ne soit pas passant (dans la mesure où le mapping n'a pas encore été enrichi).

Mettez à jour votre mapping JPA afin de configurer la (ou les) relation(s) mise(s) en place et faire passer le nouveau test unitaire (sans régression sur les tests existants).

:question: Avez-vous modéliser une relation unidirectionnelle ou bi-directionnelle ?
