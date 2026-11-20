import pkg.*;

class starter {
    public static void main(String args[]) {
        Warrior[] warriors = new Warrior[100];
        Wizard[] wizards = new Wizard[100];

        for (int i = 0; i < 100; i++) {
            warriors[i] = new Warrior("Warrior " + (i + 1));
            wizards[i] = new Wizard("Wizard " + (i + 1));
        }

        int warriorIndex = 0;
        int wizardIndex = 0;

        while (warriorIndex < warriors.length
                && wizardIndex < wizards.length) {

            // Wizard attacks first in each matchup.
            while (!wizards[wizardIndex].isDead()
                    && !warriors[warriorIndex].isDead()) {

                wizards[wizardIndex].attack(warriors[warriorIndex]);

                // A defeated warrior cannot attack back.
                if (!warriors[warriorIndex].isDead()) {
                    warriors[warriorIndex].attack(wizards[wizardIndex]);
                }
            }

            // Move to the next fighter only on the defeated side.
            if (warriors[warriorIndex].isDead()) {
                warriorIndex++;
            }

            if (wizards[wizardIndex].isDead()) {
                wizardIndex++;
            }
        }

        if (warriorIndex == warriors.length) {
            System.out.println("Wizards win!");
            System.out.println("Fighters left: "
                    + (wizards.length - wizardIndex));
        } else {
            System.out.println("Warriors win!");
            System.out.println("Fighters left: "
                    + (warriors.length - warriorIndex));
        }
    }
}