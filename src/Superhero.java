public class Superhero {
//Attributer
    private String superName;
    private String civilName;
    private double powerLevel;
    private int creationYear;
    private String specialPower;

    //Konstruktør1
    public Superhero(
            String superName,
            String civilName,
            String specialPower,
            int creationYear,
            double powerLevel)
    {
        this.superName = superName;
        this.civilName = civilName;
        this.powerLevel = powerLevel;
        this.creationYear = creationYear;
        this.specialPower = specialPower;
    }

    //Konstruktør 2
    public Superhero(
            String superName,
            String civilName,
            double powerLevel,
            int creationYear)
    {
        this.superName = superName;
        this.civilName = civilName;
        this.powerLevel = powerLevel;
        this.creationYear = creationYear;
    }
/*/Hero Exambles
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
    Superhero super3= new Superhero(
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
*/
    //Get metoder

    public String getSuperName() {
        return superName;
    }

    public String getCivilName() {
        return civilName;
    }

    public double getPowerLevel() {
        return powerLevel;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public String getSpecialPower() {
        return specialPower;
    }

    //Set metoder

    public void setSuperName(String superName) {
        this.superName = superName;
    }

    public void setCivilName(String civilName) {
        this.civilName = civilName;
    }

    public void setPowerLevel(double powerLevel) {
        this.powerLevel = powerLevel;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

        public String toString() {
            String string = "";
            string += "Superhelte navn: " + superName + '\n';
            string += "Civil navn: " + civilName + '\n';
            string += "Powerlevel: " + powerLevel + '\n';
            string += "Oprindelsesår: " + creationYear + '\n';
            return string;
    }

}



