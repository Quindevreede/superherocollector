package nl.quin.superheroes;
/*
Stap 5: Je hebt nu al je Mutant CLASSES en kunt de MutantController maken
01 - Je maakt de tool aan om ArrayList te maken.
02 - Je maakt een OBJECT ARRAYLIST<> aan
03 - Je maakt METHODE generate'ClassName'() aan
04 - Je maakt een OBJECT aan en vult de ATTRIBUTES in
05 - Je kunt nu eventueel METHODS aanmaken
 */
import java.util.ArrayList;

public class MutantsController {
    private ArrayList<Mutants> goodmutants = new ArrayList<>();
    private ArrayList<Mutants> evilmutants = new ArrayList<>();

    public MutantsController() {
    }

    public void generateXMen() {
        XMen professorx = new XMen("Prof X", "Mind Control", 11, "Charles Xavier", "USA", true, true, "The X-Men #1 (September 1963)");
        System.out.println(" ");
        System.out.println("Professor X :");
        professorx.sleep(6);
        professorx.useMutantPower();
        professorx.useMutantPower();

        this.goodmutants.add(professorx);
    }

    public void generateBrotherhoodOfEvilMutants() {
        BrotherhoodOfEvilMutants magneto = new BrotherhoodOfEvilMutants("Magneto", "Magnetic Powers", 8, "Max Eisenhardt", "Germany", true, true, "The X-Men #1 (September 1963)");
        System.out.println(" ");
        System.out.println("Magneto :");
        magneto.sleep(9);
        magneto.useMutantPower();
        magneto.useMutantPower();

        this.evilmutants.add(magneto);
    }

    public void printListGoodMutants() {
        int listSize = this.goodmutants.size();

        for (int i = 0; i < listSize; ++i) {
            SuperHeroes tmpSuperHeroes = (SuperHeroes) this.goodmutants.get(i);
            System.out.println(tmpSuperHeroes);
        }
    }

        public void printListEvilMutants () {
            int listSize = this.evilmutants.size();

            for (int i = 0; i < listSize; ++i) {
                SuperHeroes tmpSuperHeroes = (SuperHeroes) this.evilmutants.get(i);
                System.out.println(tmpSuperHeroes);
            }

        }
}