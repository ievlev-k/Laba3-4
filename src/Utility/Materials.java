package Utility;

public enum Materials {
    WIRE,
    GLASS,
    MEAT,
    TREE;
    public String text(){
        switch (this){
            case MEAT:
                return "мясной";
            case TREE:
                return "деревянный";
            case WIRE:
                return "проволочный";
            case GLASS:
                return "стеклянный";
        }
        return null;
    }
}
