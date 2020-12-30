package com.company.exercice;

import com.company.domain.Civility;
import com.company.domain.User;

import java.util.List;
import java.util.Map;

public class Test1 {


    /**
     * Question Java
     *
     * Le langage Java est-il orienté Objet ? Si oui expliquer pourquoi
     * A quoi sert le garbage collector ?
     * Peut-on forcer l'utilisation du garbage collector ? Si oui comment ?
     * A quoi sert la redéfinition de la classe equals ?
     * Quel est la différence entre equals et == ?
     * A quoi sert la redéfinition de la classe hashcode ?
     * Citer moi trois nouveautés de Java 8 et leurs intérêts d'utilisation ?
     * Quel est la différence entre une interface et une classe abstraite ?
     * Peut-on implémenter une méthode dans une interface ?
     * Que signifie qu'un code est thread safe ?
     * Qu'est ce qu'un objet immutable (immuable) ?
     * Qu'est ce qu'un optional ?
     * A quoi sert le polymorphisme ?
     * A quoi sert l'héritage ? ( de quel type d'attribut une classe fille peut hérité d'une classe mére ? )
     * Qu'est ce qu'un design pattern ?
     * Citer moi 3 design patterns ?
     * Qu'est ce qu'un attribut statique ?
     * Que signifie super et this en Java ?
     * En java les données sont-elles passés par référence ou par valeur ?
     * Quelle est la différence entre JDK, JRE et JVM ?
     * Qu'est  ce qu'une énumeration ? Pourquoi les utiliser ?
     * Qu'est la refexion en Java ?
     * Donner moi la caractéristique spécial de la classe String ?
     * A quoi sert la classe StringBuilder ?
     * Citer moi deux manières de déclarer un tableau de String dont l'ordre est garantit lors des insertions des données.
     */

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
    /**
     * Question base de données ?
     *
     * Quel est la différence entre une jointure externe et interne ? Donner moi un cas d'utilisation de chaque type de jointure ?
     * Comment optimiser les réponses d'une requête sql ?
     * Quel est l'intérêt et le désavantage d'un index ?
     * A quoi sert une vue ?
     * Que signifie plan d'execution ?
     * Quel est la différence entre JPA et Hibernate ?
     * Quel est la différence entre varchar(255) et char(255)  ?
     */


    /**
     * Question Spring ?
     *
     * A quoi sert Spring Core ?
     * A quoi sert les transactions avec Spring ?
     * Expliquer moi Spring MVC ?
     * Qu'est ce qu'un moteur de templating ?
     *
     */

    /**
     * HTTP
     *
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
