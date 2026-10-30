import pkg.*;

class starter {
    public static String randName() {
        int rand = (int)(Math.random() * 7);

        switch (rand) {
            case 0: return "Dopey";
            case 1: return "Bashful";
            case 2: return "Grumpy";
            case 3: return "Sleepy";
            case 4: return "Sneezy";
            case 5: return "Happy";
            case 6: return "Doc";
            default: return "Happy";
        }
    }

    public static void main(String[] args) {
        PooleDwarf[] dwarfs = new PooleDwarf[7];

        // Create seven dwarfs with random names and ages.
        for (int i = 0; i < dwarfs.length; i++) {
            String randomName = randName();
            int randomAge = (int)(Math.random() * 100) + 1;

            dwarfs[i] = new PooleDwarf(randomName, randomAge);

            System.out.println(
                "Dwarf " + (i + 1) + ": "
                + dwarfs[i].getName() + ", age "
                + dwarfs[i].getAge()
            );
        }

        // Compare the first dwarf's name with the other six.
        String firstName = dwarfs[0].getName();
        int duplicates = 0;

        for (int i = 1; i < dwarfs.length; i++) {
            if (dwarfs[i].isSameName(firstName)) {
                duplicates++;
            }
        }

        System.out.println(
            firstName + " has " + duplicates + " duplicate name(s)."
        );
    }
}