package collection.compare.test;

public enum Suit {
    SPADES("♠︎"),
    HEARTS("♥︎"),
    CLUBS("♣︎"),
    DIAMONDS("♦︎");

    private String icon;

    Suit(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }

}
