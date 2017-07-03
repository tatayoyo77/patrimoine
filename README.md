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

:question: Observer la structure de la classe **VilleJpaTest**, en particulier la façon dont est déclarée la méthode de test ainsi que les instructions utilisées pour vérifier la bonne correspondance entre le résultat attendu et le résultat obtenu.

## Etape 5

Enrichir le test unitaire et mapping pour également couvrir la latitude et la longitude
