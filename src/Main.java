import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();


        System.out.println("Velkommen til MySuperheroes");
        System.out.println("Her kan du oprette dine egne superhelte");
        System.out.println("Tryk 1 for at oprette en superhelt");
        System.out.println("Tryk 2 for at afslutte programmet");

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        while (input == 1) {
            System.out.println("Indtast superheltens navn: ");


            String mySuperName = scanner.next();
            System.out.println("Hvad er din helts civile navn?");
            String myCivilName = scanner.next();
            System.out.println("Hvad er din helts powerlevel?");
            double myPowerLevel = scanner.nextDouble();
            System.out.println("Hvilket år blev din helt skabt?");
            int myCreationYear = scanner.nextInt();

            database.addSuperhero(mySuperName,myCivilName,myPowerLevel,myCreationYear);
            Superhero mySuperHero = new Superhero(mySuperName,myCivilName,myPowerLevel,myCreationYear);

            System.out.println(
                    "Din helts information: " + '\n' + mySuperHero);


            System.out.println("Vil du prøve igen, tast 1.");
            System.out.println("Tryk 2 for at se alle dine superhelte.");
            System.out.println("Tryk 3 for at afslutte programmet.");

            int blyat = scanner.nextInt();

            if (blyat == 1) {
            } else if (blyat == 2) {
                System.out.println(database.getHeroList());
            } else if (blyat == 3) {
                System.out.println("Tak for i dag - programmet lukker ned nu");
                System.exit(0);

            }

        }
    }
}






