package Sample;

import Utility.MainInterface;
import Utility.Materials;

import java.util.Objects;

public class Mailbox implements MainInterface {
    private String name;
    private Materials TYPE;



    public Mailbox(String name){
        this.name = name;


        joinStory();
    }

    @Override
    public void joinStory() {
        System.out.println( name + " присоединяется к истории");

    }


    public String newTypeMailbox(Materials newTYPE) throws MateriallException{
        if (newTYPE.equals(Materials.MEAT)  ){
            throw new MateriallException("Ящик не может быть мясным");
        }
        TYPE = newTYPE;
        return name + " стал" + TYPE.text() ;
    }
    public String getTypeMailbox(){
        return name + " был" + TYPE.text();
    }

    public String getName() {
        return name;
    }


    public class MateriallException extends RuntimeException{
        public MateriallException(String massage){
            super(massage);
        }
    }


    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mailbox mailbox = (Mailbox) o;
        return  Objects.equals(name, mailbox.name);
    }



    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
