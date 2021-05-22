package Sample;

import Utility.MainInterface;

import java.util.Objects;

public class Gap implements MainInterface {
    private String name;

    public Gap(String name){
        this.name = name;
        joinStory();
    }

    public static class Title implements MainInterface{
        private String nameTitle;

        public Title(String nameTitle){
            this.nameTitle = nameTitle;

            joinStory();
        }

        @Override
        public String getName() {
            return nameTitle;
        }

        @Override
        public void joinStory() {
            System.out.println("Надпись " + nameTitle + " присодинился ");
        }

        public String viev(){

            class Outside{
                public String isOutside(){

                    return " потому что надпись с снаружи";
                }
            }

            return  "надпис " +"'" +nameTitle+ "'" + " не было видно" + new Outside().isOutside();
        }

        @Override
        public String toString() {
            return "Надпись" + "'" + nameTitle + "'";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Title title = (Title) o;
            return Objects.equals(nameTitle, title.nameTitle);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nameTitle);
        }


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
