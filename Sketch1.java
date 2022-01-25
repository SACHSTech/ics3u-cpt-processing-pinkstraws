import processing.core.PApplet;

public class Sketch1 extends PApplet {

  // Rachel's page
	
  public void settings() {
    size(800, 450);

  // Background Settings
  
 
  }
  
  public void setup() {
    background(0);
  }

  public void draw() {
  
  fill(255);
  textSize(40);
  text("Left click to choose a character!", 130, 400);

  // Character #1
  fill(49, 181, 222);
  ellipse(width/4, height/3, width/5, height/2);
  
  // eyes
  fill(255);
  ellipse(175, 120, 40, 40);
  ellipse(230, 120, 40, 40);

  fill(0);
  ellipse(175, 120, 20, 20);
  ellipse(230, 120, 20, 20);

  // mouth 
  fill(255, 42, 38);
  textSize(75);
  text("~", 180, 230);

  // Character #2
  fill(255, 143, 205);
  ellipse(width/2, height/3,  width/5, height/2);

  // eyes
  fill(255);
  ellipse(400, 120, 40, 40);
  ellipse(450, 120, 40, 40);

  fill(0);
  ellipse(400, 120, 20, 20);
  ellipse(450, 120, 20, 20);

  // mouth
  fill(255, 42, 38);
  textSize(50);
  text("O", 400, 230);

  // Character #3
  fill(183, 74, 255);
  ellipse(600, height/3, width/5, height/2);

  // eyes
  fill(255);
  ellipse(620, 120, 40, 40);
  ellipse(580, 120, 40, 40);

  fill(0);
  ellipse(620, 120, 20, 20);
  ellipse(580, 120, 20, 20);

  // mouth
  fill(255, 42, 38);
  textSize(50);
  text("__", 575, 200);

  
  
  // Choose your character
  


  // Game
  }
}
 
  

  
  
