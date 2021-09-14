package nl.quin.superheroes;
/*Stap 3
Je maakt nu een SUBCLASS aan, waarin je EXTENDS SuperHeroes
01 - Je maakt eventuele nieuwe ATTRIBUTES aan specifiek voor
     deze SUBCLASS en definieert deze en je maakt weer ook een CONSTRUCTOR.
02 - Je maakt eventuele nieuwe METHODS aan specifiek voor
     deze SUBCLASS.
03 - Je maakt een toString METHODE aan dat je gebruikt om de
     de specifieke ATTRIBUTES weer te geven in de MutantController
 */
    public abstract class Mutants extends SuperHeroes {
        private String realName;

        public Mutants(String superHeroName, String power, int movieAppearances, String realName) {
            super(superHeroName, power, movieAppearances);
            this.realName = realName;

        }

        public void useMutantPower() {
            System.out.println("Used MUTANTPOWER!");
        }

        public String getRealName() {
            return realName;
        }

        public void setRealName(String realName) {
            this.realName = realName;
        }



        public String toString() {
            String var10000 = super.toString();
            return var10000 + " MUTANT { Real Name = ' " + realName + "' }";
        }
    }
