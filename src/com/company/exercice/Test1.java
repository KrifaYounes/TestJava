package com.company.exercice;

public class Test1 {

    /**
     * Question Java
     *
     * Le langage Java est-il orienté Objet ? Si oui expliquer pourquoi
     * Il est orienté objet (on peut créer des classes avec des attributs et des méthodes et utiliser la notion d'héritage avec le mot clé extends)
     * En Java on peut aussi utiliser des types primitifs comme int, long, char, double, float.
     *
     * Quel est la différence int et Integer ?
     * int est un type primitif alors que Integer est une classe
     *
     * A quoi sert le garbage collector ?
     * Il sert à libérer de la mémoire.
     *
     * Peut-on forcer l'utilisation du garbage collector ? Si oui comment ?
     * Non on peut pas forcer l'utilisation du garbage collector, mais on peut appeler System.gc()
     * (En appelant System.gc(), Nous suggérons à la JVM d’exécuter le GC (attention on ne dit pas que le JVM le fait) ).
     *
     * A quoi sert la redéfinition de la méthode equals ?
     * Par défaut la méthode equals compare les adresses mémoire des objets que l'on compare
     * (exemple user.equals(user2) => on compare l'adresse mémoire des deux objets user et user2).
     * En général on redéfinit la méthode equals pour comparer les attributs des objets que l'on souhaite.
     * Exemple pour une classe User : on comparer les attributs firstName, birthDate et civility
     *
     *     @Override
     *     public boolean equals(Object o) {
     *         if (this == o) return true;
     *         if (o == null || getClass() != o.getClass()) return false;
     *         User user = (User) o;
     *         return Objects.equals(firstName, user.firstName) &&
     *                 Objects.equals(birthDate, user.birthDate) &&
     *                 civility == user.civility;
     *     }
     *
     * Quel est la différence entre equals et == ?
     * equals : par défaut equals compare l'adresse mémoire
     * si on la redefinit equals compare le contenu entre deux objets (comparaison des attributs)
     * == : compare l'adresse mémoire
     *
     * A quoi sert la redéfinition de la méthode hashcode ?
     * elle permet de créer une clé de hachage unique pour chaque instance d'une classe.
     * Utilisation de la méthode hashCode : cette méthode est utile pour chercher l'instance d'un objet dans un objet Map par exemple.
     * A PARTIR DU hashCode on peut savoir si l'objet est contenu dans une Map ou pas.
     * Il existe beaucoup de cas d'utilisation du hashCode voir cours.
     *
     * Citer moi trois nouveautés de Java 8 et leurs intérêts d'utilisation ?
     * - API Date/Time : LocalDate et LocalDateTime
     * - possibilité d'implémenter des méthodes dans une interface avec le mot clé default
     * Exempe :
     * interface InterfaceName {
     *  default void methodName(String parameter) {
     *
     *  }
     * }
     * - API stream : permet de parcourir une Collection
     * - Les optional mot clé : Optional
     *
     * Quel est la différence entre une interface et une classe abstraite ?
     * une interface peut hériter de plusieurs interface alors qu'une classe astraite
     * possibilité de mettre des attributs dans une classe abstraite alors que c'est interdit dans une interface
     * un classe abstraite doit contenir au moins une méthode abstraite
     * une interface peut ne rien contenir (aucune méthode)
     *
     * Peut-on implémenter une méthode dans une interface ?
     * Oui avec le mot clé default (à partir de java 8)
     *
     * Que signifie qu'un code est thread safe ?
     * La thread safety d'un code (qu'on appelle alors « code thread-safe »)
     * est la propriété de celui-ci associée au fait qu'il est capable de fonctionner correctement lorsqu'il est exécuté simultanément au sein du même espace d'adressage
     * par plusieurs threads.
     * Exemple :
     *
     * Qu'est ce qu'un objet immutable (immuable) ?
     * Objet qu'on ne peut pas modifier
     * Exemple : private final static String HELLO = "Hello";
     * La variable HELLO est immuable.
     * On ne peut pas modifier la variable HELLO, le compilateur bloque la modification.
     * Attention : Quand on fait private static String HELLO = "Hello";
     * La variable HELLO est quand même immutable même si on utilise pas le mot clé final par contre on peut faire
     * HELLO = "Bonjour"; car on fait HELLO = "Bonjour" cela signifie HELLO = new String("Bonjour"); la variable HELLO pointe vers une nouvelle adresse mémoire
     *
     * Est-ce que l'objet est String est immutable ?
     * Oui il est immutable.
     *
     * Qu'est ce qu'un Optional ?
     * Un optional permet de rendre un code NullCheck
     * Les optional nous permettent d'éviter des NullPointerException
     * Exemple de NullPointerException :
     * User user = userRepository.findInDatabase();
     * user.equals(user2)
     * si userRepository.findInDatabase retourne null on obtient une Exception : pour le rendre NullCheck
     * Deux posibilités :
     * 1ere possibilité : utilisé if (user != null)
     *
     * 2eme posibilité : utilisé le mot clé Optional
     * Avec les optional
     * Optional<User> userOptional = Optional.of(userRepository.findInDatabase());
     * if(userOptional.isPresent()) {
     *     User user = userOptional.get();
     *     user.equals(user2);
     * }
     * on évite un nullPointerException si notre user est null
     * Par contre si on fait  userOptional.get() sans avoir tester que  la condition userOptional.isPresent() est vrai on obtient une Exception.
     * Avec les optional le développeur doit avoir toujours la reflexion de tester si l'objet est présent ou pas dans l'optional pour éviter les NullPointerException
     * Sans les optional beaucoup de développeur oublie de tester if(user != null) du coup beaucoup d'exception se produissent à l'execution.
     * Les optional sont un moyen de rendre un code NullCheck mais ne le garentisent pas si on oublie d'utiliser la méthode userOptional.isPresent()
     *
     *
     * Que signigie NullCheck ?
     * Cela signifie que notre code est garantit sans NullPointerException.
     *
     * A quoi sert le polymorphisme ?
     * Principe d'utilisation de l'héritage voir cours
     *
     * A quoi sert l'héritage ? ( de quel type d'attribut une classe fille peut hérité d'une classe mére ? )
     * ça sert à hériter des propriétés d'une classe mére (attribut et methdode)
     * Attribut et méthode public et protected
     *
     * Qu'est ce qu'un design pattern ?
     * Patron de conception : concept en informatique qui nous permet de mieux architecturer notre application
     * par exemple : MVC et Singleton.
     * Singleton : permet de créer une instance unique d'une classe
     * on utilise le mot clé synchronised pour mettre un vérrouillage sur la création de l'instance
     * MVC : model view controller
     * view : page html
     * controller : s'occupe des traitements des actions de l'utilisateur ( exemple searchUser, createUser )
     * model : contient les données qui vont être utilisé par la vue ( le model est rempli par le controller)
     *
     * Citer moi 3 design patterns ?
     * MVC :
     * Singleton :
     * Factory :
     *
     * Qu'est ce qu'un attribut statique ?
     * un attribut static est un attribut de classe
     * c'est un attribut partagé par toute les instances d'une classe
     * exemple :
     * public class User {}
     *     public final static String value = "toto";
     * }
     * on peut accéder au contenu de l'attribut value sans créer d'instance de la classe User
     * Exemple d'utilisation : System.out.println(User.value); // pas besoin de créer une instance de User user = new User(); pour accéder au contenu
     *
     * Que signifie super et this en Java ?
     * super pour appeler la classe mére
     * this pour l'objet courant
     *
     * En java les données sont-elles passés par référence ou par valeur ?
     * Les données sont passés par référence.
     * User user = new User();
     * user.setFirstName("bonjour");
     * System.out.pring(user.getFirstName()); //affiche bonjour
     *
     * method(user);
     * System.out.pring(user.getFirstName()); //affiche toto car passage par reference
     *
     * public void method(User user) {
     *    user.setFirstName("toto");
     * }
     *
     * Quelle est la différence entre JDK, JRE et JVM ?
     * voir cours.
     * Java Development Kit : contient le JRE et la jVM
     * JVM : java virtual machine
     *
     * Qu'est  ce qu'une énumeration en Java? Pourquoi les utiliser ?
     * Enumeration contient des valeurs prédéfinis
     * Valeur qui ne change pas
     * enum Civity {
     *     MONSIEUR, MADAME
     * }
     * Une énumeration peut contenir des attributs.
     * Exemple :
     *
     * enum Civity {
     *      MONSIEUR("Monsieur", "Mister), MADAME("Madame", "Miss")
     *      private String labelFR;
     *      private String labelEN;
     *      // constructeur privé
     *      Civity(String labelFR, String labelEN) {
     *          this.labelFR = labelFR;
     *          this.labelEN = labelEN;
     *      }
     *
     *      public String getLabelFR() {
     *          return labelFR;
     *      }
     * }
     *
     * Quand on fait Civity.MONSIEUR.getLabelFR() cela retourne Monsieur
     *
     * Donner moi la caractéristique spécial de la classe String ?
     * Elle est immutable mais on peut faire. public String = "toto";  String = "tata";
     *
     * A quoi sert la classe StringBuilder ?
     * StringBuilder is used to represent a mutable string of characters.
     * Mutable means the string which can be changed.
     * String objects are immutable.
     *
     * Citer moi deux manières de déclarer un tableau de String dont l'ordre est garantit lors des insertions des données.
     * List<String> result = new Arrays();
     * String[] result;
     *
     * Expliquer moi les mots clés suivants : private, public, protected ( visibilité des méthodes et des attributs), package (nom du package),
     * default ( extension java8 pour définir des implémentations de méthode dans une interface),
     * super (pour appeler les propriétés ou méthodes d'une classe mére),
     * this (pour appeler les propriétés ou méthodes de la classe courante),
     * abstract (pour déclarer une classe abstraite ou méthode abstraite),
     * interface, volatile, new, class,
     * final (modificateur : permet de rendre immuable un attribut ou éviter la redefinition de méthode dans une classe fille)
     * static (permet l'utilisatiob d'attribut ou méthode de classe : on peut appeler une méthode ou un attribut sans créer une instance)
     * implements (pour les interfaces)
     * extends (héritage protected et public méthode et attribut)
     *
     * lambda expressions :
     * .map(var -> ...)
     * .filter(var -> ...)
     * .collect()
     * .stream()

     * Quels est la signification entre les interfaces (List, Set, Map) et les implémentation( ArrayList, HashSet, Hashmap, LinkedList )?
     * Différence entre List : interface
     * ArrayList : implémentation
     * LinkedList : implémentation
     * HashSet implémente Set
     * Hashmap implémente Map
     *
     * A quoi sert le pattern Singleton et Factory  ?
     * Singleton : créer une instance unique d'une classe
     * Factory : usine à fabrique permet de créer des objets selon le contexte voulu
     * /

    // Quel code vous semble le plus juste et pourquoi entre la method1 et method2 ?
    public void method1(String user) {
        if("toto".equals(user)) {
            System.out.println("my name is toto");
        }
    }

    public void method2(String user) {
        if(user.equals("toto")) {
            System.out.println("my name is toto");
        }
    }

    // les deux sont les meme mais la method1 est plus juste car la method2 peut déclencher un NullPointerException si user est null
    // (toujours coder de la manière method1. cela réduit de + de 50% le nombre de NullPointerException)

    /**
     * Que va til se passer si on execute le code suivant ?
     */
    public static class Application {

        static int i = 0;

        static {
            System.out.println("salem");
            i = 5;
            System.out.println("bonjour");
        }

        static {
            i = 4;
        }

        public static void main() {
            System.out.println("hello world : " + i++);
            if(--i == 4) {
                System.out.println("je m'appelle 4");
            } else {
                System.out.println("je m'appelle : " + i);
            }
        }
    }

    // le code affiche
    // salem
    // bonjour
    // hello world : 4
    // je m'appelle 4

    /**
     * TEST
     *
     * A l'aide de quoi test-on unitairement son code Java ?
     * A l'aide du framework JUnit pour tester son code unitairement.
     *
     * Quel framework utilisé pour effectuer des tests unitaires et des tests d'intégration ?
     * Junit pour les tests unitaires
     * Framework Cucumber ou Junit pour les tests d'intégration.
     *
     * Quel est la différence entre test unitaire et test d'intégration ?
     * Test unitaire : tester unitairement le comportement d'une méthode spécifique
     * Test d'intégration : tester globalement le comportement de toutes une fonctionalité
     *
     * Que signifie un Mock ?
     *
     * Comment s'assurer qu'un code est clean ?
     * Mise en place d'une bonne architecture de conception
     * Mettre en place une politque de nommage (Nommer correctement les méthodes et les classes)
     * Eviter les duplications de code
     * Mise en place d'une politique de test unitaire et d'intégration du code (tester son code à plus de 80%)
     * Mettre en place un SONAR dans un projet pour vérifier que le code ne contient pas d'erreur critique
     * Eviter de mettre + de 4 if ou 4 boucles for dans une seule méthode ( si une méthode contient + de 3 if cela veut dire que la méthode a été mal conçu)
     *
     * A quoi sert un SONAR dans un Projet ?
     * SONAR : sert à détecter les erreurs dans un projet et les mauvaises pratique de codage selon des rules que le développeur fixe
     * Exemple : un développeur fixe une rules (pas + de 4 if dans une méthode)
     * si une méthode contient + de 4 if le SONAR va remonter une alerte selon un niveau (severe, critique, non critique...)
     */

    /**
     * Question base de données ?
     *
     * Quel est la différence entre une jointure externe et interne ? Donner moi un cas d'utilisation de chaque type de jointure ?
     * User
     * id  name
     * 1   younes
     * 2   youssef
     *
     * Produit
     * id   name
     * 1    MacBook
     * 2    Iphone
     * 3    PS4
     *
     * Achat
     * id    idUser  idProduit
     *  1     2          1
     *  2     1          3
     *
     * Jointure interne : Select produit.name from user join achat on user.id = achat.idUser join produit on produit.id = achat.idProduit where user.name = 'youssef';
     * Jointure externe : select produit.name from user join achat on user.id = achat.idUser right join produit on produit.id = achat.idProduit where user.name = 'youssef';
     *
     * Comment optimiser les réponses d'une requête SQL ?
     * - voir si on peut créer des index
     * - voir si on peut transformer la requête en une vue
     * - voir si on peut ajouter ou réduire des jointures ds la requête qui vont favoriser l'execution de la requete
     * - ajouter des conditions obligatoires sur la requête pour remonter moins de données
     * - voir si le model de données a bien été conçu sinon refaire le modele de données
     *
     * Quel est l'intérêt et le désavantage d'un index ?
     * - intérêt : raccourcir le temps d'execution d'une requete
     * - désavantage : dans certains cas -----> mise ou jour / ou insertion devient un désavantage (écriture plus longue).
     *
     * A quoi sert une vue ?
     * Sert à précaculer le résultat d'une requête
     *
     * Que signifie plan d'execution ?
     * Quel est la différence entre JPA et Hibernate ?
     * Quel est la différence entre varchar(255) et char(255) ?
     *
     */

    /**
     * Performance
     *
     * Que signifie un code Scalable ?
     * désigne la capacité d'un produit à s'adapter à un changement d'ordre de grandeur
     * de la demande (montée en charge), en particulier sa capacité à maintenir ses fonctionnalités et ses performances en cas de forte demande2.
     */

    /**
     * DevOps
     *
     * Qu'est ce qu'une plateforme d'intégration continue.
     * Environnement qui va s'occuper de lancer des tests unitaires, d'intégration et de livrer des binaires sur differents environnement (dev, test, pré-production et production)
     *
     * Citer moi une plate-forme d'intégration continue.
     * GitLab et Jenkins
     *
     * Lorsqu'on développe une application web en Java (Projet Spring Boot). Que livre-t-on en production ?
     * Lorsqu'il s'agit d'un projet Spring Boot on livre un jar executable
     */


    /**
     * HTTP
     *
     * Décrivez moi le protocole HTTP ?
     * Que peut-contenir une entete http ?
     * Quel est la version actuel de HTTP ?
     * Que signifie REST ?
     * Citer moi trois verbes REST et leurs signification ?
     * POST
     * PUT
     * PATCH
     * DELETE
     *
     * Citer moi les 3 codes d'erreurs HTTP les plus courant et leurs signification ?
     * 200
     * 201
     * 403
     * 500
     *
     * Comment lancer une requête http rapidement en ligne de commande ?
     * curl -I http:// www.google.com
     *
     * Quel est la différence entre le verbe POST et PUT ?
     *
     * Quels sont éléments les plus importants de la console de débugage de Chrome ?
     */

    /**
     * Question Spring ?
     *
     * A quoi sert Spring Core ?
     * A quoi sert les transactions avec Spring ?
     * Expliquer moi Spring MVC ?
     * Qu'est ce qu'un moteur de templating ?
     * Quel est la différence entre un client lourd et un client léger ?
     * Client lourd : exemple Application Swing : sexecute sur le poste d'un ordinateur
     * Client léger : exemple Application Spring MVC : sexecute dans un conteneur web
     *
     * Citer moi un framework pour réaliser un client lourd et un client léger.
     * client lourd : Framework Swing
     * client léger : Spring mvc
     */

    /**
     * GIT (ligne de commande uniquement)
     *
     * Qu'est ce que GIT ?
     * gestionnaire de code source decentralisé
     *
     * Quel site utilise le protocole git ?
     * Gitlab, Github, Jira ....
     *
     * Citer moi trois commandes de base de git et leurs signification
     * git clone repositoryName (clone un répertoire distinct dans un répertoire)
     * git pull (recupere les derniere modification)
     * git checkout fileName
     * git commit -m "message"
     * git push
     * git rebase master
     *
     * Quel est la différence entre GIT et SVN ?
     * git : gerer de façon decentraliser
     * SVN : gerer de facon centraliser
     */


    /**
     * Maven
     *
     * Qu'est ce que Maven ?
     * Expliquer le cycle de vie de Maven ?
     */

    /**
     * Mini Projet Spring Boot
     * Créer une API Back-End qui permet de créer un utilisateur le supprimer à partir d'un identifiant, le modifier et le lire
     * le user doit contenir les champs firstName String, civility Enum, birthDate LocalDate, creationDate LocalDateTime
     *
     * Architecture :
     * package rest : contient la couche rest
     * package service : contient le code métier
     * package repository : couche base de données
     * package domain : couche objet métier
     * package enumeration : contient les enum
     * package utils : contient les méthodes utilitaires
     */
}
