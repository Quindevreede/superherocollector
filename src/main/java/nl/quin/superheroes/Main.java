package nl.quin.superheroes;
/*
Stap 6:
-       Je zorgt hier dat je een object maakt van bijv. je MutantsController Class waarin de
        specifieke code voor alle mutant SubClasses is ge-GENERATE.
-       Vervolgens kun je nu deze CLASSES hier in de MAIN GENEREREN en de LISTS
        met data ophalen.
 */
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        MutantsController mutants = new MutantsController();
        mutants.generateXMen();
        mutants.printListGoodMutants();
        mutants.generateBrotherhoodOfEvilMutants();
        mutants.printListEvilMutants();
    }
}
