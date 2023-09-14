import java.util.ArrayList;

public class Database {

    private final ArrayList<Superhero> heroList = new ArrayList<>();

    public void addSuperhero
            (Superhero superhero) {
        heroList.add(superhero);
    }

    public void addRandomHero(Superhero heroPrint) {
        heroList.add(new Superhero(
                heroPrint.getSuperName(),
                heroPrint.getCivilName(),
                heroPrint.getSpecialPower(),
                heroPrint.getCreationYear(),
                heroPrint.getPowerLevel()));
    }

    public ArrayList<Superhero> getHeroList() {
        return heroList;
    }

    public ArrayList<String> findSuperhero(String superHeroName) {
        ArrayList<String> superheroes = new ArrayList<>();

        for (Superhero superhero : heroList) {
            if (superhero.getSuperName().toLowerCase().contains(superHeroName.toLowerCase())) {

                if (!superHeroName.contains(superhero.getSuperName())) {
                    superheroes.add(superhero.getSuperName());
                }
            }
        }
        return superheroes;
    }
}
