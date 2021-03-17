import processing.core.PApplet;

public class Main extends PApplet{

	int x = 0;
	int y = 100;

	Circle b = new Circle(this);
	
	public void settings(){
		size(500, 500);
	}
	
	public void draw(){
		background(255);
		ellipse(x, y, 50, 50);
		x += 1;
		text("Hello", 10, 10);

		b.draw();
	}
	
	public void mousePressed(){
		background(64);
	}
	
	public static void main(String[] args){
		String[] processingArgs = {"MySketch"};
		Main mySketch = new Main();
		PApplet.runSketch(processingArgs, mySketch);
	}
}