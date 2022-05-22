package ru.skypro;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {
        Hogwarts[] hogwarts = new Hogwarts[] {
                new Gryffindor("Harry", "Potter", 82, 80, 84, 86, 90),
                new Gryffindor("Ron", "Weasley", 68, 70, 72, 84, 78),
                new Gryffindor("Hermione", "Granger", 92, 90, 83, 86, 88),
                new Slytherin("Draco", "Malfoy", 76, 81, 74, 75, 70, 68, 79),
                new Slytherin("Graham", "Montague", 60, 62, 53, 57, 61, 48, 40),
                new Slytherin("Gregory", "Goyle", 39, 37, 48, 55, 60, 39, 50),
                new Hufflepuff("Zacharias", "Smith", 47, 52, 63, 41, 67),
                new Hufflepuff("Cedric", "Diggory", 71, 82, 86, 91, 89),
                new Hufflepuff("Justin", "Finch-Fletchley", 39, 68, 51, 72, 56),
                new Ravenclaw("Cho", "Chang", 58, 45, 61, 57, 67),
                new Ravenclaw("Padma", "Patil", 53, 52, 51, 58, 31),
                new Ravenclaw("Marcus", "Belby", 56, 39, 41, 42, 37),
        };

        Gryffindor[] gryffindors = new Gryffindor[] {
                new Gryffindor("Harry", "Potter", 82, 80, 84, 86, 90),
                new Gryffindor("Ron", "Weasley", 68, 70, 72, 84, 78),
                new Gryffindor("Hermione", "Granger", 92, 90, 83, 86, 88)
        };

        Slytherin[] slytherins = new Slytherin[] {
                new Slytherin("Draco", "Malfoy", 76, 81, 74, 75, 70, 68, 79),
                new Slytherin("Graham", "Montague", 60, 62, 53, 57, 61, 48, 40),
                new Slytherin("Gregory", "Goyle", 39, 37, 48, 55, 60, 39, 50)
        };

        Hufflepuff[] hufflepuffs = new Hufflepuff[] {
                new Hufflepuff("Zacharias", "Smith", 47, 52, 63, 41, 67),
                new Hufflepuff("Cedric", "Diggory", 71, 82, 86, 91, 89),
                new Hufflepuff("Justin", "Finch-Fletchley", 39, 68, 51, 72, 56)
        };

        Ravenclaw[] ravenclaws = new Ravenclaw[] {
                new Ravenclaw("Cho", "Chang", 58, 45, 61, 57, 67),
                new Ravenclaw("Padma", "Patil", 53, 52, 51, 58, 31),
                new Ravenclaw("Marcus", "Belby", 56, 39, 41, 42, 37)
        };

        WizardService.delimiter();
        WizardService.printWizard(hogwarts[1]);
        WizardService.printWizard(hogwarts[6]);
        WizardService.printWizard(hogwarts[3]);
        WizardService.delimiter();
        WizardService.whosDaBest(hogwarts[2], hogwarts[7]);
        WizardService.delimiter();
        WizardService.alphaGryffindor(gryffindors[0], gryffindors[1]);
        WizardService.delimiter();
        WizardService.alphaHufflepuff(hufflepuffs[0], hufflepuffs[1]);
        WizardService.delimiter();
        WizardService.alphaRavenclaw(ravenclaws[0], ravenclaws[1]);
        WizardService.delimiter();
        WizardService.alphaSlytherin(slytherins[0], slytherins[1]);

    }
}