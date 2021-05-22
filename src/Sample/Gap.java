package Sample;

import Utility.MainInterface;

import java.util.Objects;

public class Gap implements MainInterface {
    private String name;

    public Gap(String name){
        this.name = name;

        joinStory();
    }

    @Override
    public void joinStory() {
        System.out.println(name + " присоединился к истории");
    }

    @Override
    public String getName() {
        return name;
    }

    public String moveGap(){
        return name + " находится в двери" ;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gap gap = (Gap) o;
        return Objects.equals(name, gap.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
