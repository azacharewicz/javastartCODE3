package zadanie_3_1;

import com.sun.javafx.geom.Vec2d;

public class Line2D extends Shape2D {
    Vec2d start;
    Vec2d end;

    public Line2D(Vec2d start, Vec2d end) {
        this.start = start;
        this.end = end;
    }

    public Vec2d getStart() {
        return start;
    }

    public void setStart(Vec2d start) {
        this.start = start;
    }

    public Vec2d getEnd() {
        return end;
    }

    public void setEnd(Vec2d end) {
        this.end = end;
    }
}
