package Utility;

public enum GapPlaces {
    DOOR, FLOOR, ROOF, WALL ;


    public String gapPlacesText(){
        switch (this){
            case DOOR:
                return " в двери";
            case FLOOR:
                return " в полу";
            case ROOF:
                return " в крыше";
            case WALL:
                return " в стене";

            default: return null;
        }
    }
}
