package Utility;

public enum MovePyatachek {
    BOWEDDOWN, POWYS, MOCKS, JOKED, NOTHING;
    public String movePyatachekText(){
        switch (this){
            case BOWEDDOWN:
                return " склонился над ";
            case POWYS:
                return " повис над ";
            case MOCKS:
                return " издевался над ";
            case JOKED:
                return " пошутил над ";
            case NOTHING:
                return " ничего не делал c";

                default: return null;
        }
    }
}
