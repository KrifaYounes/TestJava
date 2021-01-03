package com.company.domain;

import java.time.LocalDate;
import java.util.Objects;

public class User {

    private String firstName;
    private LocalDate birthDate; // JAVA 8 => faciliter utilisation des dates year month jour
    private Civility civility;

    private final  String HELLO = "hello";
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(firstName, user.firstName) &&
                Objects.equals(birthDate, user.birthDate) &&
                civility == user.civility;
    }

    @Override
    public String toString() {
        HELLO = ""
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", birthDate=" + birthDate +
                ", civility=" + civility +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, birthDate, civility);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Civility getCivility() {
        return civility;
    }

    public void setCivility(Civility civility) {
        this.civility = civility;
    }
}
