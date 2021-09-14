package nl.quin.superheroes;

/*
Stap 2: Je begint hier met je algemene Class die je Abstract kunt maken
01 - Je maakt de ATTRIBUTES aan.
02 - Je maakt een CONSTRUCTOR aan en vult tussen de commas je ATTRIBUTES.
03 - Je definiert je ATTRIBUTES.
04 - Je maakt eventuele algemen METHODES.
05 - Je maakt GETTERD en SETTERS aan zodat je de PRIVATE ATTRIBUTES door heel je CLASS kunt gebruiken
 */

public abstract class SuperHeroes {
    private String superHeroName;
    private String power;
    private int movieAppearances;
//01 Hierboven: - Je maakt de ATTRIBUTES aan. Deze gegevens bescherm je door ze private te maken

    public SuperHeroes(String superHeroName, String power, int movieAppearances) {
        this.superHeroName = superHeroName;
        this.power = power;
        this.movieAppearances = movieAppearances;
    }
//02 Hierboven: - Je maakt een CONSTRUCTOR aan en vult tussen de commas je ATTRIBUTES.
//03            - Je definieert je ATTRIBUTES

    public void shoot(String projectile) {
        System.out.println("I shot a " + projectile);
    }

    public void sleep(int hoursSlept) {
        System.out.println("I slept for " + hoursSlept + " hours...");
    }

//04 Hierboven: - Je maakt eventuele algemene METHODES aan.

    public String getSuperHeroName() {
        return superHeroName;
    }

    public void setSuperHeroName(String superHeroName) {
        this.superHeroName = superHeroName;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getMovieAppearances() {
        return movieAppearances;
    }

    public void setMovieAppearances(int movieAppearances) {
        this.movieAppearances = movieAppearances;
    }
//05 - Je maakt GETTERS en SETTERS aan zodat je de PRIVATE ATTRIBUTES door heel je CLASS kunt gebruiken

    public String toString() {
        return "SUPERHUMAN { name = '" + superHeroName + "', power = '" + power + "', movie appearances = '" + movieAppearances + " ' }";
    }
}
