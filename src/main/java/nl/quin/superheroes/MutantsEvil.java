package nl.quin.superheroes;

/* Stap 4.b: Je maakt hier eventueel een SUB-SUBCLASS aan waarin je
   een nog specifiekere CLASS binnen je SUBCLASS maakt.
   een ander voorbeeld hiervan zou Human > Male > Adult > Gay (is-a)
01 - Je EXTEND hier naar de CLASS erboven dus niet SuperHeroes, maar Mutants
02 - Maak eventueel weer ATTRIBUTES en CONSTRUCTOR aan met SUPER
03 - Je maakt een toString METHODE aan dat je gebruikt om de
     de specifieke ATTRIBUTES weer te geven in de MutantController
 */

public class MutantsEvil extends Mutants {
    private String countryOfOrigin;
    private boolean isInBrotherHoodOfEvilMutants;

    public MutantsEvil(String superHeroName, String power, int movieAppearances, String realName, String countryOfOrigin, boolean isInBrotherHoodOfEvilMutants) {
        super(superHeroName, power, movieAppearances, realName);
        this.countryOfOrigin = countryOfOrigin;
        this.isInBrotherHoodOfEvilMutants = isInBrotherHoodOfEvilMutants;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public boolean isInBrotherHoodOfEvilMutants() {
        return isInBrotherHoodOfEvilMutants;
    }

    public void setInBrotherHoodOfEvilMutants(boolean inBrotherHoodOfEvilMutants) {
        isInBrotherHoodOfEvilMutants = inBrotherHoodOfEvilMutants;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + " EVIL { Country of origin = '" + countryOfOrigin + "', is in the Brotherhood of Evil Mutants: '" + isInBrotherHoodOfEvilMutants + "' }";
    }
}