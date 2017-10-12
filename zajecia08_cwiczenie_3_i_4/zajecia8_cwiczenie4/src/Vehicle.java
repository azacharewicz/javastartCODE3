public abstract class Vehicle implements Moveable {
    private String name;
    private int year;
    private String direction; //lub enum

    private final static String DIRECTION_LEFT = "Lewo";
    private final static String DIRECTION_RIGHT = "Prawo";
    private final static String DIRECTION_FORWARD = "Przód";
    private final static String DIRECTION_BACK = "Tył";

    public Vehicle(String name, int year) {
        this.name = name;
        this.year = year;
        this.direction = DIRECTION_FORWARD; // domyślnie jedziemy do przodu
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public void turnLeft() {
        this.direction = DIRECTION_LEFT;
    }

    @Override
    public void turnRight() {
        this.direction = DIRECTION_RIGHT;
    }

    @Override
    public void goBack() {
        this.direction = DIRECTION_BACK;
    }

    @Override
    public void goForward() {
        this.direction = DIRECTION_FORWARD;
    }

    @Override
    public String toString() {
        return name + " " + year + " " + direction;
    }
}
