import processing.core.PApplet;

public class Main extends PApplet{

	int x = 0;
	int y = 100;
	
	public void settings(){
		size(500, 500);
	}
	
	public void draw(){
		background(255);
		ellipse(x, y, 100, 100);
		x += 1;
	}
	
	public static void main(String[] args){
		String[] processingArgs = {"MySketch"};
		Main mySketch = new Main();
		PApplet.runSketch(processingArgs, mySketch);
	}
}