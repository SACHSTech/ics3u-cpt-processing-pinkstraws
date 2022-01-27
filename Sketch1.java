import processing.core.PApplet;

public class Sketch1 extends PApplet {



  // Rachel's page
	
  public boolean mClicked = false; 
  public boolean mDragged = false;
  public boolean mWheel = false;
  public boolean upPressed = false;
  public boolean leftPressed = false; 
  public boolean rightPressed = false;
  public boolean shiftPressed = false;

  boolean gameOverScreen;
  boolean levelTwo;

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
  text("Loli's Evil Minions", 10, 400);

  fill(255);
  textSize(30);
  text("Click anywhere to begin!", 10, 430);

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

  if (mClicked) {
    background (0);
    //  fill(255);
  
    // Level One
    fill(66, 245, 173);
    textSize(40);
    text("Yellow", 350, 50);
    
    rect(50, 100, 300, 300);
    
    fill(255, 224, 110);
    rect(450, 100, 300, 300);

    // Level Two
    fill(252, 3, 157);
    textSize(40);
    text("Red", 350, 50);

    rect(50, 100, 300, 300);

    fill(252, 3, 3);
    rect(450, 100, 300, 300);

    if(mWheel) {
      background(0);
      fill(55);
      textSize(70);
      text("Level 2!", 275, 225);

      // Add one point to score board
    }
    if(mDragged){
        background(0);
        fill(55);
        textSize(70);
        text("Game Over", 400, 400);

        fill(55);
        textSize(40);
        text("Press your shift key to restart the game!", 30, 225);

        if(shiftPressed) {

        }
        
        // You win screen
        background(0);

    }
  }
  // You win screen
  background(0);
  drawFlower(random(width), random(height), random(20, 55));
}
  
void drawFlower(float flowerX, float flowerY, float petalSize) {
  float petalDistance = petalSize / 2;

  fill(255, 128, 0);

  // upper-left petal
  ellipse(flowerX - petalDistance, flowerY - petalDistance, 
    petalSize, petalSize);

  // upper-right petal
  ellipse(flowerX + petalDistance, flowerY - petalDistance, 
    petalSize, petalSize);

  // lower-left petal
  ellipse(flowerX - petalDistance, flowerY + petalDistance, 
    petalSize, petalSize);

  // lower-right petal
  ellipse(flowerX + petalDistance, flowerY + petalDistance, 
    petalSize, petalSize);

  // center petal
  fill(255, 0, 0);
  ellipse(flowerX, flowerY, 
    petalSize, petalSize);
  
  fill(255);
  textSize(100);
  text("You win!", 200, 250);
}

  // Define other methods
  
  public void mouseClicked() {
    mClicked = true;
  }

  public void mouseDragged() {
    mDragged = true;
  }

  public void mouseWheel() {
    mWheel = true;
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

      if(keyCode == SHIFT){

        
      }

    }
  }