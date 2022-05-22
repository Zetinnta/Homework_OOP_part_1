package ru.skypro;

public class WizardService {

    public static void printWizard(Hogwarts hogwarts) {
        System.out.println(hogwarts.toString());
    }

    public static void whosDaBest(Hogwarts firstStudent, Hogwarts secondStudent) throws Exception {
        int attributesFirst = firstStudent.getConjure() + firstStudent.getTransgress();
        int attributesSecond = secondStudent.getConjure() + secondStudent.getTransgress();
        if (attributesFirst > attributesSecond) {
            System.out.println("(Comparison among all students) " + firstStudent.getName() + " " + firstStudent.getSurname() + " is greater wizard than "
                    + secondStudent.getName() + " " + secondStudent.getSurname() + " with overall statistics " + attributesFirst +
                    " over " + attributesSecond + ".");
        } else if (attributesFirst < attributesSecond) {
            System.out.println(secondStudent.getName() + " " + secondStudent.getSurname() + " is greater than "
                    + firstStudent.getName() + " " + firstStudent.getSurname() + " with overall statistics " + attributesSecond +
                    " over " + attributesFirst + ".");
        } else if (attributesFirst == attributesSecond && !(firstStudent.equals(secondStudent))) {
            System.out.println(firstStudent.getName() + " " + firstStudent.getSurname() + " is equal in strength to " + secondStudent.getName() + " " + secondStudent.getSurname());
        } else {
            System.out.println("(Hogwarts) You've entered the same wizard into the comparison method twice.");
        }
    }

    public static void alphaHufflepuff(Hufflepuff firstStudent, Hufflepuff secondStudent) {
        int attributesFirstHufflepuff = firstStudent.getDiligence() + firstStudent.getLoyalty() + firstStudent.getHonesty();
        int attributesSecondHufflepuff = secondStudent.getDiligence() + secondStudent.getLoyalty() + secondStudent.getHonesty();
        if (attributesFirstHufflepuff > attributesSecondHufflepuff) {
            System.out.println("(Comparison among Hufflepuff) " + firstStudent.getName() + " " + firstStudent.getSurname() + " is greater Hufflepuff than "
                    + secondStudent.getName() + " " + secondStudent.getSurname() + " with overall statistics " +
                    attributesFirstHufflepuff +
                    " over " + attributesSecondHufflepuff + ".");
        } else if (attributesFirstHufflepuff < attributesSecondHufflepuff) {
            System.out.println("(Comparison among Hufflepuff) " + secondStudent.getName() + " " + secondStudent.getSurname() + " is a greater Hufflepuff than "
                    + firstStudent.getName() + " " + firstStudent.getSurname() + " with overall statistics " +
                    attributesSecondHufflepuff +
                    " over " + attributesFirstHufflepuff + ".");
        } else if (attributesFirstHufflepuff == attributesSecondHufflepuff && !(firstStudent.equals(secondStudent))) {
            System.out.println(firstStudent.getName() + " " + firstStudent.getSurname() + " is equal in strength to " + secondStudent.getName() + " " + secondStudent.getSurname());
        } else {
            System.out.println("(Hufflepuff) You've entered the same wizard into the comparison method twice.");
        }
    }

    public static void alphaRavenclaw(Ravenclaw firstStudent, Ravenclaw secondStudent) {
        int attributesFirstRavenclaw = firstStudent.getWisdom() + firstStudent.getWit() + firstStudent.getCreativity();
        int attributesSecondRavenclaw = secondStudent.getWisdom() + secondStudent.getWit() + secondStudent.getCreativity();
        if (attributesFirstRavenclaw > attributesSecondRavenclaw) {
            System.out.println("(Comparison among Ravenclaw) " + firstStudent.getName() + " " + firstStudent.getSurname() + " is greater Ravenclaw than "
                    + secondStudent.getName() + " " + secondStudent.getSurname() + " with overall statistics " +
                    attributesFirstRavenclaw +
                    " over " + attributesSecondRavenclaw + ".");
        } else if (attributesFirstRavenclaw < attributesSecondRavenclaw) {
            System.out.println("(Comparison among Ravenclaw) " + secondStudent.getName() + " " + secondStudent.getSurname() + " is a greater Ravenclaw than "
                    + firstStudent.getName() + " " + firstStudent.getSurname() + " with overall statistics " +
                    attributesSecondRavenclaw +
                    " over " + attributesFirstRavenclaw + ".");
        } else if (attributesFirstRavenclaw == attributesSecondRavenclaw && !(firstStudent.equals(secondStudent))) {
            System.out.println(firstStudent.getName() + " " + firstStudent.getSurname() + " is equal in strength to " + secondStudent.getName() + " " + secondStudent.getSurname());
        } else {
            System.out.println("(Ravenclaw) You've entered the same wizard into the comparison method twice.");
        }
    }

    public static void alphaGryffindor(Gryffindor firstStudent, Gryffindor secondStudent) {
        int attributesFirstGryffindor = firstStudent.getNobleness() + firstStudent.getHonor() + firstStudent.getCourage();
        int attributesSecondGryffindor = secondStudent.getNobleness() + secondStudent.getHonor() + secondStudent.getCourage();
        if (attributesFirstGryffindor > attributesSecondGryffindor) {
            System.out.println("(Comparison among Gryffindor) " + firstStudent.getName() + " " + firstStudent.getSurname() + " is greater Gryffindor than "
                    + secondStudent.getName() + " " + secondStudent.getSurname() + " with overall statistics " +
                    attributesFirstGryffindor +
                    " over " + attributesSecondGryffindor + ".");
        } else if (attributesFirstGryffindor < attributesSecondGryffindor) {
            System.out.println("(Comparison among Ravenclaw) " + secondStudent.getName() + " " + secondStudent.getSurname() + " is a greater Ravenclaw than "
                    + firstStudent.getName() + " " + firstStudent.getSurname() + " with overall statistics " +
                    attributesSecondGryffindor +
                    " over " + attributesFirstGryffindor + ".");
        } else if (attributesFirstGryffindor == attributesSecondGryffindor && !(firstStudent.equals(secondStudent))) {
            System.out.println(firstStudent.getName() + " " + firstStudent.getSurname() + " is equal in strength to " + secondStudent.getName() + " " + secondStudent.getSurname());
        } else {
            System.out.println("(Gryffindor) You've entered the same wizard into the comparison method twice.");
        }
    }

    public static void alphaSlytherin(Slytherin firstStudent, Slytherin secondStudent) {
        int attributesFirstSlytherin = firstStudent.getCunning() + firstStudent.getDetermination() + firstStudent.getAmbition() + firstStudent.getResourcefulness() + firstStudent.getThirstForPower();
        int attributesSecondSlytherin = secondStudent.getCunning() + secondStudent.getDetermination() + secondStudent.getAmbition() + secondStudent.getResourcefulness() + secondStudent.getThirstForPower();
        if (attributesFirstSlytherin > attributesSecondSlytherin) {
            System.out.println("(Comparison among Slytherin) " + firstStudent.getName() + " " + firstStudent.getSurname() + " is greater Slytherin than "
                    + secondStudent.getName() + " " + secondStudent.getSurname() + " with overall statistics " +
                    attributesFirstSlytherin +
                    " over " + attributesSecondSlytherin + ".");
        } else if (attributesFirstSlytherin < attributesSecondSlytherin) {
            System.out.println("(Comparison among Ravenclaw) " + secondStudent.getName() + " " + secondStudent.getSurname() + " is a greater Ravenclaw than "
                    + firstStudent.getName() + " " + firstStudent.getSurname() + " with overall statistics " +
                    attributesSecondSlytherin +
                    " over " + attributesFirstSlytherin + ".");
        } else if (attributesFirstSlytherin == attributesSecondSlytherin && !(firstStudent.equals(secondStudent))) {
            System.out.println(firstStudent.getName() + " " + firstStudent.getSurname() + " is equal in strength to " + secondStudent.getName() + " " + secondStudent.getSurname());
        } else {
            System.out.println("(Slytherin) You've entered the same wizard into the comparison method twice.");
        }
    }

    public static void delimiter() {
        System.out.println("----------------------------------------------------------------------------------------------------------------" +
                "---------------------------------------------------------------");
    }
}