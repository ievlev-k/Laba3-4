package Utility;
import java.lang.Math;
public enum MoveFillings {
     LOVE, ADMIRES, DISAPPOINTED, HORRIFIED;





     public String fillingsText(){
          switch (this){
               case LOVE:
                    return " влюбляется";
               case ADMIRES:
                    return " восхищается";
               case HORRIFIED:
                    return " ужасается";
               case DISAPPOINTED:
                    return " разочаровывается";

               default: return " сохроняет нейтралитет";
          }
     }
}
