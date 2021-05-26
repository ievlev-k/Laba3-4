import Sample.*;
import Utility.GapPlaces;
import Utility.Materials;
import Utility.MoveFillings;
import Utility.SubjectForFiling;


public class Main {


    public static void main(String[] args) {


        Owl owl2 = new Owl("Сова", true);
        Gap gap = new Gap("щель", GapPlaces.DOOR);
        Mailbox mb = new Mailbox("Ящик");
        Gap.Title title = new Gap.Title("Для писем и гaзет", true);

        Pyatachek pyatachek2 = new Pyatachek("Обжора", false){
            public String movePyatachek(){
                return "В основном обжора только ест";
            }
        };


        Gap gap1 = new Gap("дыра", GapPlaces.DOOR);
        System.out.println( gap1.moveGap());
        gap1.newGapPlaces(GapPlaces.FLOOR);
        System.out.println( gap1.moveGap());
        System.out.println(title.viev());
        title.newViev(false);
        System.out.println(title.viev());
    }


}

