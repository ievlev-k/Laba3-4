package Sample;

import Utility.HeroikAbstact;
import Utility.HeroikType;
import Utility.MainInterface;
import Utility.MoveException;

import java.util.Objects;

public class Owl extends HeroikAbstact implements MainInterface {
    private String name;
    private boolean statMoveScond = false;
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
        return name + "влюблялась своим почтовым ящиком";
    }

    public String moveOwlSecond(){
        if (statMoveScond){
            try{
                throw new MoveException();

            }catch (MoveException e){
                return e.getMessage();
            }
        }
        statMoveScond = true;
        return name + " слетала вниз";
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
