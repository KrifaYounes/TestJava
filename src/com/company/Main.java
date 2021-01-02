package com.company;

import com.company.domain.Civility;
import com.company.domain.User;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static int i = 0;

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
