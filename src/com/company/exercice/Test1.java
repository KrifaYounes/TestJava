package com.company.exercice;

public class Test1 {

    /**
     * Question Java
     *
     * Le langage Java est-il orienté Objet ? Si oui expliquer pourquoi
     * il est orienté objet mais on peut des types primitifs comme int, long, char, double, float
     *
     * Quel est la différence int et Integer ?
     * int type primitif et Integer est une classe
     * int est un type primitif est
     *
     * A quoi sert le garbage collector ?
     * Il sert à libérer de la mémoire.
     *
     * Peut-on forcer l'utilisation du garbage collector ? Si oui comment ?
     * Non, mais on peut appeler System.gc()
     * Nous suggérons à la JVM d’exécuter le GC (on ne dit pas que le JVM le fait).
     *
     * A quoi sert la redéfinition de la classe equals ?
     * Par défaut elle compare les adresses mémoire des objets que l'on compare.
     * On la redéfinit pour comparer les attributs des objets que l'on souhaite
     *
     * Quel est la différence entre equals et == ?
     * equals = quand on la redéfinit elle le compare le contenu
     * == elle compare l'adresse mémoire
     *
     * A quoi sert la redéfinition de la classe hashcode ?
     * elle permet de créer une clé de hachage unique pour chaque instance d'une classe.
     *
     * Citer moi trois nouveautés de Java 8 et leurs intérêts d'utilisation ?
     * - API Date/Time : LocalDate et LocalDateTime
     * - possibilité d'implémenter des méthodes dans une interface avec le mot clé default
     * - les lambdas expressions : api stream, forEach
     *
     * Quel est la différence entre une interface et une classe abstraite ?
     * une interface peut hérité de plusieurs interface alors qu'une classe astraite
     * possibilité de mettre des attributs dans une classe abstraite
     *
     * Peut-on implémenter une méthode dans une interface ?
     * Oui avec le mot clé default (à partir de java 8)
     *
     * Que signifie qu'un code est thread safe ?
     * code qui fonctionne correctement lorsqu'il est attaqué par plusieurs thread en même temps
     *
     * Qu'est ce qu'un objet immutable (immuable) ?
     * objet qui ne peut pas changer de valeur
     * utilisé le mot clé final pour rendre un objet immuable
     *
     * Est-ce que l'objet est String est immutable ?
     * Oui il est immutable.
     *
     * Qu'est ce qu'un Optional ?
     *
     * A quoi sert le polymorphisme ?
     *
     * A quoi sert l'héritage ? ( de quel type d'attribut une classe fille peut hérité d'une classe mére ? )
     * ça sert à hériter des propriétés d'une classe mere (attribut et methdode)
     * Attribut public et protected
     *
     * Qu'est ce qu'un design pattern ?
     * Patron de conception : concept en informatique qui nous permette de mieux architecturer notre application
     * par exemple : MVC et Singleton.
     * Singleton : permet de créer une instance unique d'une classe
     * on utilise le mot clé synchronised pour mettre un vérrou sur la création de l'instance
     *
     * Citer moi 3 design patterns ?
     * MVC :
     * Singleton :
     * Factory :
     *
     * Qu'est ce qu'un attribut statique ?
     * un attribut static est un attribut de classe
     * c'est un attribut partagé par toute les instances d'une classe
     * exemple User user = new User();
     * User user2 = User()
     * public final static String value = "toto";
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
     * public void method(User user) {
     *    user = new User();
     *    user.setBirthDate();
     * }
     *
     * Quelle est la différence entre JDK, JRE et JVM ?
     * définition.
     *
     * Qu'est  ce qu'une énumeration en Java? Pourquoi les utiliser ?
     * Enumeration contient des valeurs prédéfinis
     * Valeur qui ne change pas
     * enum Civity {
     *     MONSIEUR, MADAME
     * }
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
     * Expliquer moi les mots clés suivants : private, public, package, protected, default,
     * super, this, abstract, interface, volatile, new, class, final, static, implements, extends,
     * .map(var -> ...)
     * .filter(var -> ...)
     * .collect()
     * .stream()
     * implements : pour une interface
     * extends : hritage
     * Quels est la signification entre  interface (List, Set, Map) et les implémentation( ArrayList, HashSet, Hashmap, LinkedList )?
     * Différence entre List : interface
     * ArrayList : implémentation
     * LinkedList : implémentation
     * HashSet implémente Set
     * Hashmap implémente Map
     * A quoi sert le pattern Singleton et Factory  ?
     * Singleton : créer une instance unique
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

    // les deux sont les meme mais la method1 est plus juste car la method2 peut déclencher un NullPointerException

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
     * Mockito ou Cucumber ou tests d'intégration.
     *
     * Quel est la différence entre test unitaire et test d'intégration ?
     * Test unitaire : tester unitairement le comportement d'une méthode (public
     * Test d'intégration : tester globalement le comportement de toutes une fonctionalité
     *
     * Que signifie un Mock ?
     *
     * Comment s'assurer qu'un code est clean ?
     * Mise en place d'une bonne architecture de conception
     * Nommer correctement les méthodes et les classes
     * Mise en place d'une politique de test et d'intégration du code
     *
     * A quoi sert un SONAR dans un Projet ?
     * SONAR : sert à détecter les erreurs dans un projet
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
     * Comment optimiser les réponses d'une requête sql ?
     * - voir si on peut créer des index
     * - voir si on peut transformer la requête en une vue
     * - voir si on peut ajouter ou reduire des jointures ds la requête
     * - ajouter des conditions obligatoires sur la requête
     *
     * Quel est l'intérêt et le désavantage d'un index ?
     * - intérêt : raccourcir le temps d'execution d'une requete
     * - désavantage : dans certains cas -----> mise ou jour / ou insertion devient un désavantage en écriture (écriture plus longue).
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
     * Que signifie haute disponibilité ?
     */

    /**
     * DevOps
     *
     * Expliquer moi le devOps ?
     * Citer moi une plate-forme d'intégration continue.
     * Lorsqu'on développe une application web en Java (Projet Spring Boot). Que livre-t-on en production ?
     *
     */

    /**
     * Question Spring ?
     *
     * A quoi sert Spring Core ?
     * A quoi sert les transactions avec Spring ?
     * Expliquer moi Spring MVC ?
     * Qu'est ce qu'un moteur de templating ?
     * Quel est la différence entre un client lourd et un client léger ?
     * Citer moi un framework pour réaliser un client lourd et un client léger.
     */

    /**
     * HTTP
     *
     * Décrivez moi le protocole HTTP ?
     * Que peut-contenir une entete http ?
     * Quel est la version actuel de HTTP ?
     * Que signifie REST ?
     * Citer moi trois verbes REST et leurs signification ?
     * Citer moi les 3 codes d'erreurs HTTP les plus courant et leurs signification ?
     * Comment lancer une requête http rapidement en ligne de commande ?
     * Quel est la différence entre le verbe POST et PUT ?
     * Quels sont éléments les plus importants de la console de débugage de Chrome ?
     */


    /**
     * GIT (ligne de commande uniquement)
     *
     * Qu'est ce que GIT ?
     * A quoi sert le mot clé rebase ?
     * Citer moi trois commandes de base de git et leurs signification
     * Quel est la différence entre GIT et SVN ?
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
