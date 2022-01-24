import processing.core.PApplet;

public class Sketch1 extends PApplet {

  // Rachel's page
	
  public void settings() {
    size(800, 450);
  }

  

  public void setup() {
    background(0);
  }

  public void draw() {
  
  // head
  ellipse( width/ 4, height/2, width/16, height/9);
  fill(255, 200, 122);

  // Charater #1
  ellipse(200, 200, 50, 50);
  fill(255);

   // nose
   ellipse(200, 200, 10, 10);
   fill(78);

   // mouth
   strokeWeight((float)width/130);
   arc(200, 150, 100, 100, 400, 400);
   


  

  // Character #2
  ellipse(400, 200,  50, 50);
  fill(255);

  // Character #3
  ellipse(600, 200, 50, 50);
  fill(255);


  }
  
}
