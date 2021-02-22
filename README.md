MEZINE
Elias

Création du projet avec maven par la commande "mvn archetype:generate" qui permet de réaliser la création de la structure arborescente du projet de développement.

choix du langage :
J'ai choisi de coder le programme avec le langage java pour tirer parti de la programmation orientée objet étant donné les notions de polymorphisme que l'on retrouve dans le sujet.

Remarque :
J'ai choisi de faire de la classe Character une classe abstraite bien que des valeurs par défauts soient attribuées dans la classe Character. dans le cas où les attributs d'une sous classe implémentant la classe abstraite ne seraient pas surchargés car il n'est pas possible de créer une instance d'une classe abstraite.

J'ai créer un attribut "protected Set<String> compatibleWeapons" dans la classe Character contenant les String représentant les armes compatibles avec lesquels les personnages peuvent attaquer puis j'ai ajouté la liste des armes dans la collection pour chaque sous classe de Character et j'ai vérifié dans la méthode attack de Character que le String passé en paramètre appartienne bien à la collection.
Cependant cette implémentation n'exploite pas la programmation orientée objet et ne respecte pas le principe ouvert fermé. Si on veut ajouter des armes, on serait obliger de modifier le code déja existant.

Si le cachier des charges n'exigeait pas un String comme paramètre pour la méthode attack, j'aurai choisi d'implémenter une classe Weapon et de passer en paramètre de la méthode attack de Character une référence de la classe Weapon. Cette implémentation aurait permis :
- la vérification des armes passées en paramètre à la méthode attack grace à l'héritage et au typage lors de la compilation.
- le respect du principe ouvert fermé. On peut ajouter des extensions sans modifier le code déja existant. On peut toujours ajouter des armes sans modifier la collection des armes dans les sous classes Mage et Warrior. Il suffit d'ajouter une nouvelle classe qui étend les classes Weapon.
- d'ajouter des caractéristiques et des fonctionnalités aux armes à travers les attributs et méthodes de la classe de l'arme en question.


J'ai ajouté le mot clé "final" la méthode "unsheathe" pour qu'elle ne puisse pas être surchargée comme demandée dans le cachier des charges.



Design patterns :
- le design pattern Template Method pour la méthode attack et les méthodes move, laissant les sous classes Mage et Warrior redéfinir les méthodes "mannerMove", "attackMessage" et "exceptionNoCompatibleWeaponMessage" appelées par les méthodes move et attack de character tout en conservant la même structure pour l'algorithme.


consignes:

se placer dans le dossier java et effectuer les commandes
pour générer la java doc :  "javadoc -d ../docs -subpackages character"
pour compiler : "javac character/*.java -d ../classes", "javac exception/*.java -d ../classes"

se placer dans le dossierclasses
pour éxécuter : java main.Example
