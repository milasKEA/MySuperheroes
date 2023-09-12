import java.util.ArrayList;

public class Database {

    private ArrayList <Superhero> heroList = new ArrayList();

    public void addSuperhero(
                             String superName,
                             String civilName,
                             double powerLevel,
                             int creationYear) {

        heroList.add
                (new Superhero(
                superName,
                civilName,
                powerLevel,
                creationYear));
    }

    public ArrayList<Superhero> getHeroList() {
        return heroList;
    }
}


