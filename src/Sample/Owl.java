package Sample;

import Utility.HeroikAbstact;
import Utility.HeroikType;
import Utility.MainInterface;

import java.util.Objects;

public class Owl extends HeroikAbstact implements MainInterface {
    private String name;
    private final HeroikType TYPE = HeroikType.OWL;
    public Owl (String name, boolean importantHero){
        super(importantHero);
        this.name = name;
        joinStory();


    }

    @Override
    public HeroikType getType() {
        return TYPE;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void joinStory(){
        if (isImportantHero()){
            System.out.println("Главный герой "+ TYPE+ " " + name + "присоединился к истории" );}
        else {
            System.out.println( "Герой "+ TYPE + " " + name + " присоединился к истории");
        }
    }
    public String moveOwlFirst(){
        return name + "," + " которая влюблялась своим почтовым ящиком";
    }
    public String moveOwlSecond(){
        return "слетала вниз";
    }

    @Override
    public String toString() {
        return  name ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owl owl = (Owl) o;
        return Objects.equals(name, owl.name) && TYPE == owl.TYPE;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, TYPE);
    }
}
