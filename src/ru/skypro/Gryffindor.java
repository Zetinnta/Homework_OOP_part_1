package ru.skypro;

public class Gryffindor extends Hogwarts {
    private int nobleness;
    private int honor;
    private int courage;

    public Gryffindor(String name, String surname, int conjure, int transgress, int nobleness, int honor, int courage) {
        super(name, surname, conjure, transgress);
        this.nobleness = nobleness;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobleness() {
        return nobleness;
    }

    public void setNobleness(int nobleness) {
        this.nobleness = nobleness;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return "Gryffindor " + super.toString() +
                this.getNobleness() + " (nobleness), "
                + this.getHonor() + " (honor), " + this.getCourage() + " (courage).";

    }
}