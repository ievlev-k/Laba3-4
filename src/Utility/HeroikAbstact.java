package Utility;

public abstract class HeroikAbstact implements HeroikInterfase {
    boolean importantHero;
    public HeroikAbstact(boolean importantHero){
        this.importantHero = importantHero;
    }

    @Override
    public boolean isImportantHero() {
        return importantHero;
    }


}

