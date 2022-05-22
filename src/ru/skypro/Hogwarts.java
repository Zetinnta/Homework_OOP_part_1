package ru.skypro;

public abstract class Hogwarts {
    private int conjure;
    private int transgress;
    private String name;
    private String surname;

    public Hogwarts(String name, String surname, int conjure, int transgress) {
        this.name = name;
        this.surname = surname;
        this.conjure = conjure;
        this.transgress = transgress;
    }

    public int getConjure() {
        return conjure;
    }

    public int getTransgress() {
        return transgress;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "student: " + this.getName() + " " + getSurname()
                + "; Characteristics: " + this.getConjure() + " (conjure), " + this.getTransgress() + " (transgress), ";
    }
}