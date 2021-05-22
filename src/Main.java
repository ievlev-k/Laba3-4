import Sample.*;


public class Main {


    public static void main(String[] args) {
        Pyatachek pyatachek = new Pyatachek("Пятачек",true);
        Owl owl = new Owl("Сова", true);
        Gap gap = new Gap("щель");
        Mailbox mb = new Mailbox("Ящик");
        Title title = new Title("Для писем и гaзет");
        System.out.print(pyatachek.movePyatachek());
        System.out.print(owl.moveOwlFirst());
        title.viev();
        System.out.print(owl.moveOwlSecond());


    }


}

