package com.company;

import com.company.domain.Civility;
import com.company.domain.User;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // write your code here
        User user = new User();
        user.setCivility(Civility.M);
        user.setFirstName("First Name");
        user.setBirthDate(LocalDate.of(1990,1,1));

        User user2 = new User();
        user2.setCivility(Civility.M);
        user2.setFirstName("First Name 2");
        user2.setBirthDate(LocalDate.of(1990,1,1));

        System.out.println(user.toString());

        // Interface List => Implementation ArraysList :
        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);

        List<User> users2 = Arrays.asList(user, user2); // list immutable => non modifiable (on ne peut plus modifier la liste users2

        Set<User> usersSet = new HashSet<>(); //ne garde pas les objets en doublon (un doublon est calculé à partir de  equals de l'objet)
        // si on ne redefinit pas equals il va comparer l'dresse mémoire des objets

        Map<User, String> map = new HashMap<>(); // calcul de la clé à partir du hascode de l'objet
        map.put(user, "youssef");
        map.put(user, "younes");

        //List, Set, Map


        // .map() => transformation // LAMBDA EXPRESSION
        users.stream().mapToLong(u -> ChronoUnit.YEARS.between(u.getBirthDate(), LocalDate.now()))
                .average();

        // lambda : une faciliter de programmation sur les collections
        // JAVA 8
        Optional<String> optionalS = Optional.empty();
    }



    private static long getYearsBetween(LocalDate fromDate, LocalDate toDate) {
        return ChronoUnit.YEARS.between(fromDate, toDate);
    }
}
