import Sample.*;
import Utility.Materials;


public class Main {


    public static void main(String[] args) {
        Pyatachek pyatachek = new Pyatachek("Пятачек",true);
        Owl owl = new Owl("Сова", true);
        Gap gap = new Gap("щель");
        Mailbox mb = new Mailbox("Ящик", Materials.GLASS);
        Gap.Title title = new Gap.Title("Для писем и гaзет");

        Pyatachek pyatachek2 = new Pyatachek("Обжора", false){
            public String movePyatachek(){
                return "В основном обжора только ест";
            }
        };
        pyatachek2.movePyatachek();
        System.out.println(pyatachek2.movePyatachek());
        System.out.println(owl.moveOwlSecond());
        System.out.println(owl.moveOwlSecond());
        System.out.println(title.viev());
        System.out.println(gap.moveGap());
        System.out.println(mb.typeMailbox());



    }


}

