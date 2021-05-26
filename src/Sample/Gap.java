package Sample;

import Utility.GapPlaces;
import Utility.MainInterface;

import java.util.Objects;

public class Gap implements MainInterface {
    private String name;
    private GapPlaces gapPlaces = GapPlaces.DOOR;
    public Gap(String name, GapPlaces gapPlaces ){
        this.name = name;
        this.gapPlaces = gapPlaces;

        joinStory();
    }

    public static class Title implements MainInterface{
        private String nameTitle;
        private boolean visibleTitle;
        public Title(String nameTitle, boolean visibleTitle){
            this.nameTitle = nameTitle;
            this.visibleTitle = visibleTitle;
             joinStory();
        }
        public String newTitle(String newTitle){
            nameTitle = newTitle;
            return "изменилась надпись на" + newTitle;
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
            if (visibleTitle) {
                return "надпись" + " '" + nameTitle + "' " +  "видно";
            }
            else{
                class Outside {
                    public String getOutside(boolean place) {
                        if (place){
                            return " она снаружи";
                        }
                        else {return " она неизвестно где";}
                    }
                }

                return "надпис " + "'" + nameTitle + "'" + " не было видно" + new Outside().getOutside(true);

            }
        }

        public  boolean newViev(boolean newViev){
            visibleTitle = newViev;
            return visibleTitle;
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
        return name + " находится" + gapPlaces.gapPlacesText()  ;
    }
    public GapPlaces newGapPlaces(GapPlaces newGapPlaces){
        gapPlaces = newGapPlaces;
        return gapPlaces;
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
