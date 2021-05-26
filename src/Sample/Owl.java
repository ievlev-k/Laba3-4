package Sample;

import Utility.*;

import java.util.Objects;

public class Owl extends HeroikAbstact implements MainInterface {
    private String name;

    private final HeroikType heroikType = HeroikType.OWL;
    private MoveFillings moveFillings;
    private SubjectForFiling subjectForFiling;

    private double  orientationX = 0;
    private double  orientationY = 10;
    public Owl (String name, boolean importantHero) {
        super(importantHero);
        this.name = name;
        joinStory();
    }



    @Override
    public HeroikType getType() {
        return heroikType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void joinStory(){
        if (isImportantHero()){
            System.out.println("Главный герой "+ heroikType+ " " + name + "присоединился к истории" );}
        else {
            System.out.println( "Герой "+ heroikType + " " + name + " присоединился к истории");
        }
    }

//    public MoveFillings getFillingsParameters() {
//        double a = Math.random()*20;
//        if (moveFillings == null) {
//
//            if (a  < 5 ) {
//                moveFillings = MoveFillings.LOVE;
//                return moveFillings;
//            }
//            if (a  < 10 && a  >= 5) {
//                moveFillings = MoveFillings.ADMIRES;
//                return moveFillings;
//            }
//            if (a  < 15 && a >= 10) {
//                moveFillings = MoveFillings.DISAPPOINTED;
//                return moveFillings;
//            }
//            else {
//                 moveFillings = MoveFillings.HORRIFIED;
//                    return moveFillings;
//                }
//            }
//        else{return moveFillings;}
//        }
//
//    public SubjectForFiling getSubjectForFiling() {
////        double random = Math.random()*20;
////        if (subjectForFiling == null) {
////
////            if (random  < 5 ) {
////                subjectForFiling = SubjectForFiling.HOLLOW;
////                return subjectForFiling;
////            }
////            if (random  < 10 && random >= 5) {
////                subjectForFiling = SubjectForFiling.SOUP;
////                return subjectForFiling;
////            }
////            if (random < 15 && random >= 10) {
////                subjectForFiling = SubjectForFiling.MAILBOX;
////                return subjectForFiling;
////            }
////            else {
////                subjectForFiling = SubjectForFiling.STICK;
////                return subjectForFiling;
////            }
////        }
////        else{return subjectForFiling;}
//        return  subjectForFiling;
//    }





    public String moveOwlFirst(MoveFillings newMoveFillings, SubjectForFiling newSubjectForFiling){
        moveFillings = newMoveFillings;
        subjectForFiling = newSubjectForFiling;
        return name + moveFillings.fillingsText() + subjectForFiling.subjectForFiingText();
    }
    public String getMoveFirst(){
        return name + moveFillings.fillingsText() + subjectForFiling.subjectForFiingText();
    }



    public String moveOwlSecond(double x, double y){

         if ( orientationY == 0 && orientationY + y < 0 ){
             try {
                 throw new MoveException(" ниже некуда");
             }catch (MoveException e){
                 return e.getMessage();
             }
         }


        if ( orientationX == orientationX+x && orientationY == orientationY +y ){
            orientationY += y;
            orientationX +=x;
            return " осталась на том же месте";

        }

        if (orientationX +x <= 5 && orientationX + x >=0 && orientationY + y == 10){
            orientationX += x;
            orientationY  += y;
            return name + " сидит на ветке";
        }

        if (orientationY + y > 0 && orientationY + y <= 10 && orientationY > orientationY + y ){
            orientationY += y;
            orientationX +=x;
            return name + " полетела вниз и долетела до высоты " + orientationY;
        }

        if (orientationY + y == 0 && orientationY != 0 ){
            orientationY += y;
            orientationX +=x;
            return name+ " спустилась на землю";
        }
        if (orientationY + y > 0 && ((orientationY +y == 10 && orientationX +x >= 5 && orientationX + x <=0) || orientationY!=10 ) && orientationY < orientationY + y ){
            orientationY += y;
            orientationX +=x;
            return name + " полетела вверх и долетела до высоты " + orientationY;
        }
         if (orientationY + y >0 && orientationY!=0 && orientationY == orientationY + y && orientationX != orientationX+x  ){
             orientationY += y;
             orientationX +=x;
             return " полетела горизонтально и долетела до места " + orientationX;

         }

        if ( orientationX >= 0 && orientationY +y <0 ){
            orientationY  = 0;
            orientationX +=x;
            return " врезалась в землю";

        }
        return null;
    }
    public String getMoveOwlSecond(){
        return "находится в точке " + orientationX + ", " + orientationY;
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
        return Objects.equals(name, owl.name) && heroikType == owl.heroikType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, heroikType);
    }
}
