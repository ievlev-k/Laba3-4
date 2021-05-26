package Utility;

public enum SubjectForFiling {
    HOLLOW, MAILBOX, SOUP, STICK;

    public String subjectForFiingText(){
        switch (this){
            case HOLLOW:
                return " дуплом";
            case MAILBOX:
                return " почтовым ящиком";
            case SOUP:
                return " супом";
            case STICK:
                return " палкой";

            default: return " ничем";
        }
    }
}
