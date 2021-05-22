package Sample;
import Utility.*;

public class Pyatachek extends HeroikAbstact implements MainInterface {
    private String name;
    private final HeroikType TYPE = HeroikType.PIGLET;

    public Pyatachek(String name, boolean importantHero){
        super(importantHero);
        this.name = name;
        joinStory();
    }



    public void joinStory(){
        if (isImportantHero()){
            System.out.println("Главный герой "+ TYPE+ " " + name + "присоединился к истории" );}
        else {
            System.out.println( "Герой "+ TYPE+ " " + name + " присоединился к истории");
        }
    }
    public String movePyatachek(){
        return name + " склонился над ним. ";
    }

    @Override
    public HeroikType getType() {
        return TYPE;
    }
    @Override
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Герой " + getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Pyatachek){
            return (name.equals(((Pyatachek) o).getName()))&& (isImportantHero() == ((Pyatachek)o).isImportantHero());
        }
        return false;
    }

    @Override
    public int hashCode() {
        if (isImportantHero()){return 31*(name.hashCode() + getType().hashCode());}
        return name.hashCode();
    }
}
