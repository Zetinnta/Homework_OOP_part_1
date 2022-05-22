package ru.skypro;

public class Ravenclaw extends Hogwarts {
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, String surname, int conjure, int transgress, int wisdom, int wit, int creativity) {
        super(name, surname, conjure, transgress);
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Ravenclaw " + super.toString() + this.getWisdom() + " (wisdom), "
                + this.getWit() + " (wit), " + this.getCreativity() + " (creativity).";
    }
}