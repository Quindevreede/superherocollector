package nl.quin.superheroes;

/* Stap 4.a: Je maakt hier eventueel een SUB-SUBCLASS aan waarin je
   een nog specifiekere CLASS binnen je SUBCLASS maakt.
   een ander voorbeeld hiervan zou Human > Female > Adult > Gay (is-a)
01 - Je EXTEND hier naar de CLASS erboven dus niet SuperHeroes, maar Mutants
02 - Maak eventueel weer ATTRIBUTES en CONSTRUCTOR aan met SUPER
03 - Je maakt een toString METHODE aan dat je gebruikt om de
     de specifieke ATTRIBUTES weer te geven in de MutantController
 */

public class MutantsGood extends Mutants {
    private String countryOfOrigin;
    private boolean isInXMen;

    public MutantsGood(String superHeroName, String power, int movieAppearances, String realName, String countryOfOrigin, boolean isInXMen) {
        super(superHeroName,power,movieAppearances, realName);
        this.countryOfOrigin = countryOfOrigin;
        this.isInXMen = isInXMen;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public boolean isInXMen() {
        return isInXMen;
    }

    public void setInXMen(boolean inXMen) {
        isInXMen = inXMen;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + " GOOD { Country of origin = '" + countryOfOrigin + "', is in the XMen Team: " + isInXMen + "' }";
    }
}