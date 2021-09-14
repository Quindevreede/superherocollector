package nl.quin.superheroes;
/* Stap 4.c: Je maakt hier eventueel een SUB-SUB-SUBCLASS aan waarin je
   een nog specifiekere CLASS binnen je SUBCLASS maakt.
   een ander voorbeeld hiervan zou Human > Female > Adult > Gay (is-a)
01 - Je EXTEND hier naar de CLASS erboven dus niet SuperHeroes, maar Mutants
02 - Maak eventueel weer ATTRIBUTES en CONSTRUCTOR aan met SUPER
03 - Je maakt een toString METHODE aan dat je gebruikt om de
     de specifieke ATTRIBUTES weer te geven in de MutantController
 */
public class XMen extends MutantsGood{
    private boolean originalTeam;
    private String firstAppearance;

    public XMen(String superHeroName, String power, int movieAppearances, String realName, String countryOfOrigin, boolean isInXMen, boolean originalTeam, String firstAppearance) {
        super(superHeroName,power,movieAppearances, realName, countryOfOrigin, isInXMen);
        this.originalTeam = originalTeam;
        this.firstAppearance = firstAppearance;
    }

    public boolean isOriginalTeam() {
        return originalTeam;
    }

    public void setOriginalTeam(boolean originalTeam) {
        this.originalTeam = originalTeam;
    }

    public String getFirstAppearance() {
        return firstAppearance;
    }

    public void setFirstAppearance(String firstAppearance) {
        this.firstAppearance = firstAppearance;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + " XMen { is in Original Team: " + originalTeam + " First Appearance: " + firstAppearance + " }";
    }
}
