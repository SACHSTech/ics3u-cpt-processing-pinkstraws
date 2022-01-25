import processing.core.PApplet;

/**
 * Main class to execute sketch
 * @author 
 *
 */
class Main {
  public static void main(String[] args) {
    
    String[] processingArgs = {"MySketch"};
	 // Sketch mySketch = new Sketch();  //comment this out to run the other sketch files
<<<<<<< HEAD
	   Sketch1 mySketch = new Sketch1();  // uncomment this to run this sketch file
=======

	  Sketch1 mySketch = new Sketch1();  // uncomment this to run this sketch file
>>>>>>> 1b35fa026f19f3b22128b23a2f92016fdc377406
	  // Sketch2 mySketch = new Sketch2();  // uncomment this to run this sketch file
	  
	  PApplet.runSketch(processingArgs, mySketch);
  }
  
}
