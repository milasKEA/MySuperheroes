import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kør = "y";
        Database database = new Database();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Velkommen til MySuperheroes");
        while (kør.equalsIgnoreCase("y")){

            System.out.println("Her kan du oprette dine egne superhelte");
            System.out.println("Tryk 1 for at tilføje endnu en helt.");
            System.out.println("Tryk 2 for at se alle dine superhelte.");
            System.out.println("Tryk 3 for at tilføje 4 random helte.");
            System.out.println("Tryk 5 for at søge efter superhelte");
            System.out.println("Tryk 9 for at afslutte programmet.");
            int input = scanner.nextInt();
            if (input == 1) {

                System.out.println("Indtast superheltens navn: ");
                String getFucked = scanner.nextLine();
                String mySuperName = scanner.nextLine();
                System.out.println("Hvad er din helts civile navn?");
                String myCivilName = scanner.nextLine();
                System.out.println("Hvad er din helts superkraft?");
                String mySuperPower = scanner.nextLine();
                System.out.println("Hvilket år blev din helt skabt?");
                int myCreationYear = scanner.nextInt();
                System.out.println("Hvad er din helts powerlevel?");
                double myPowerLevel = scanner.nextDouble();

                Superhero mySuperHero = new Superhero(mySuperName, myCivilName, mySuperPower, myCreationYear, myPowerLevel);
                database.addSuperhero(mySuperHero);

                System.out.println("Din helts information: " + '\n' + mySuperHero);

                System.out.println("Vil du tilbage til menuen? (y/n)");
                kør = scanner.next();
            }
            if (input == 2) {
                System.out.println(database.getHeroList());
                System.out.println("Vil du tilbage til menuen? (y/n)");
                kør = scanner.next();
            }
            if (input == 3) {
                Superhero super1 = new Superhero(
                        "Blanket Lord",
                        "Lars Larsen",
                        "Har altid et godt tilbud til dig",
                        1959,
                        9.99);
                Superhero super2 = new Superhero(
                        "DJ Blyatman",
                        "Stanislav Bodkovich",
                        "Russian Hardbass",
                        1993,
                        420);
                Superhero super3 = new Superhero(
                        "Johnny Bravo",
                        "John Bravo",
                        "Tiltproof",
                        1970,
                        500);
                Superhero super4 = new Superhero(
                        "Bodega Bent",
                        "Bent Børge Bumsen",
                        "Kan drikke 80 øl på i hvert fald et par timer",
                        1954,
                        14);
                database.addRandomHero(super2);
                database.addRandomHero(super3);
                database.addRandomHero(super4);
                database.addRandomHero(super1);

            }


            if (input == 5) {
                System.out.println("Søg efter navn");
                String søgning = scanner.next();
                System.out.println(database.findSuperhero(søgning));
                System.out.println("Vil du tilbage til menuen? (y/n)");
                kør = scanner.next();

            }


            if (input == 9) {
                System.out.println("Tak for i dag - programmet lukker ned nu");
                System.exit(0);


            }
        }

    }
}


