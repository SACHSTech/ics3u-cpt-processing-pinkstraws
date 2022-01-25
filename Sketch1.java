import processing.core.PApplet;

public class Sketch1 extends PApplet {

  // Rachel's page
	
  public boolean mClicked = false; 
  public boolean upPressed = false;
  public boolean leftPressed = false; 
  public boolean rightPressed = false;

  public void settings() {
    size(800, 450);

  // Background Settings
  
 
  }
  
  public void setup() {
    background(0);
  }

  public void draw() {
  
  fill(255);
  textSize(30);
  text("1. Click the arrow on your keyboard to choose one!", 10, 400);

  fill(255);
  textSize(30);
  text("2. Then click anywhere to proceed!", 10, 430);

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

  fill(255);
  textSize(50);
  text("<-", 190, 310);

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

  fill(255);
  textSize(50);
  text("^", 390, 310);
  text("|", 395, 310);

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

  fill(255);
  textSize(50);
  text("->", 590, 310);
  
  // Choose your character
  if (mClicked) {
    background (0);
    
    // Level One
    fill(66, 245, 173);
    textSize(40);
    text("Yellow", 350, 50);
    
    rect(50, 100, 300, 300);

    fill(255, 224, 110);
    rect(450, 100, 300, 300);


  }

<<<<<<< HEAD

  
  

  
  

  // Define other methods
  

  }
  public void mouseClicked() {
    mClicked = true;
    }
  
  public void keyPressed(){
      if(keyCode == LEFT){
          leftPressed = true;
      }
      else if(keyCode == UP){
        upPressed = true;
      }
      else if(keyCode == RIGHT) {
        rightPressed = true;
      }
    }
  }

=======
  // Game
  }
}
 
  

  
  
>>>>>>> 65887ff827d6f62a8f3217d5302da27db9c4453f
