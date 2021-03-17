import processing.core.PApplet;

public class Circle {

    PApplet canvas;
    public Circle(PApplet s) {
        canvas = s;
    }

    public void draw() {
        canvas.ellipse(200, 200, 50, 50);
    }
}