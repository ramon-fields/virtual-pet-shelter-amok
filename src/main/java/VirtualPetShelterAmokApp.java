import java.util.Scanner;

public class VirtualPetShelterAmokApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPetShelter pets = new VirtualPetShelter();

        Cat virtualPet1 = new Cat("Garfield", "\tOverweight lazy and sarcastic.", 50,50,50, 50);
        Dog virtualPet2 = new Dog("Odie", "\tLoving seemingly dopey and kind.", 50,50,50,50);
        RobotCat virtualPet3 = new RobotCat("MeowBot", "\tThis cats is the mastermind type.",50,50);
        RobotDog virtualPet4 = new RobotDog("BuddyBot", "\tMan's best friend.",50,50);

        pets.add(virtualPet1);
        pets.add(virtualPet2);
        pets.add(virtualPet3);
        pets.add(virtualPet4);

        String userChoice = "";
        while (!userChoice.equals("9")) {

            System.out.println("Thank you for volunteering at Master Splinter's Virtual Pet Shelter");
            System.out.println();
            System.out.println("This is the status of our pets:");
            System.out.println();
            System.out.println("Name:   |Health |Hunger |Thirst|Boredom |Oil   |");
            System.out.println("--------|-------|-------|------|--------|-------");
            System.out.println();
            System.out.println(pets.petStatus());
            System.out.println("What would you like to do next?");
            System.out.println("Press 1 to Feed the pets");
            System.out.println("Press 2 to Quench the thirst of the pets");
            System.out.println("Press 3 to Play with a pet");
            System.out.println("Press 4 to Adopt a pet");
            System.out.println("Press 5 to Admit a pet");
            System.out.println("Press 6 to Walk the dogs");
            System.out.println("Press 7 to Clean cages");
            System.out.println("Press 8 to Change litterbox");
            System.out.println("Press 9 to Quit");
            userChoice = input.nextLine();

            switch (userChoice) {
                case "1":
                    pets.feedAll();
                    System.out.println("You fed all the pets in the Shelter.");
                    break;
                case "2":
                    pets.quenchThirstAll();
                    System.out.println("You quenched the thirst of all the pets in the Shelter.");
                    break;
                case "3":
                    System.out.println("Which pet would you like to play with?");
                    System.out.println(pets.optionMenu());
                    String petName = input.nextLine();
                    pets.play(petName);
                    System.out.println("You played with " + petName + ".");
                    break;
                case "4":
                    System.out.println("Which pet would you like to adopt?");
                    System.out.println(pets.optionMenu());
                    petName = input.nextLine();
                    if (pets.containsKey(petName)) {
                        pets.adopt(petName);
                        System.out.println("You adopted " + petName + "!");
                    } else {
                        pets.adopt(petName);
                        System.out.println("Sorry no pet here with that name.");
                    }
                    break;
                case "5":
                    System.out.println("What's the name of the pet being admitted?");
                    String newPetName = input.nextLine();
                    System.out.println("Describe the pet being admitted.");
                    String newPetDescription = input.nextLine();
                    pets.add(new VirtualPet(newPetName, newPetDescription));
                    System.out.println("You admitted a pet.");
                    break;
                case "6":
                    System.out.println();
                    System.out.println("You walked the dogs.");
                    break;
                case "7":
                    System.out.println();
                    System.out.println("You cleaned the cages.");
                    break;
                case "8":
                    System.out.println();
                    System.out.println("You cleaned the litterbox.");
                    break;
                default:
                    System.out.println("Not an option...");
                    break;
            }
            pets.tickMethod();

        }
        input.close();
    }
}

