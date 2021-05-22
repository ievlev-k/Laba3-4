package Sample;

import Utility.MainInterface;

public class Title implements MainInterface {
    private String name;

    public Title(String name){
        this.name = name;

        joinStory();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void joinStory() {
        System.out.println("Надпись " + name + " присодинился ");
    }

    public String viev(){
        return "надписи" + name + "не было видно, потому что она была снаружи";
    }
    @Override
    public String toString() {
        return "Надпись" + "'" + name + "'";
    }
}
