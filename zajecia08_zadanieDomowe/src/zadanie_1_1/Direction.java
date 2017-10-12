package zadanie_1_1;

public enum Direction {
    NORTH("północ"),
    EAST("wschód"),
    SOUTH("południe"),
    WEST("zachod");

    private final String directionName;

    public String getDirectionName() {
        return directionName;
    }

    private Direction(String directionName) {
        this.directionName = directionName;
    }


}



