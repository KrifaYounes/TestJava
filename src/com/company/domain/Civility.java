package com.company.domain;

public enum Civility {

    M("Monsieur", "Mister"), MME("Madame", "Miss");

    private String label;
    private String labelEN;


    Civility(String label, String labelEN) {
        this.label = label;
        this.labelEN = labelEN;

    }
}
