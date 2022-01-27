import processing.core.PApplet;

public class Sketch1 extends PApplet {



  // Rachel's page
	
  public boolean mClicked = false; 
  boolean minionScreen;
  boolean gameOverScreen;
  boolean levelFour;
  boolean levelFiveOP;

  // Variables for minions
  float bodyX = 400;
  float bodyY = 150;
  float bodySize = (193);
  float bodyDistance = bodySize/2;

  public void settings() {
    size(800, 450);

  // Background Settings
  
 
  }
  
  public void setup() {
    background(0);
  }

  public void draw() {

    if(gameOverScreen){
      gameOverScreen();
    }
  
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
  
  // Enter Game
  if (mClicked) {
    background (0);
  
    // Level Four
    fill(66, 245, 173);
    textSize(40);
    text("Yellow", 350, 50);
    
    rect(50, 100, 200, 200);
    if(mouseX > 50 && mouseY > 100 && mouseX < 150 && mouseY < 150 && mousePressed){
      gameOverScreen = true;
      levelFour = false;
    }
   
    fill(140, 255, 0);
    rect(300, 100, 200, 200);
    if(mouseX > 200 && mouseY > 100 && mouseX < 400 && mouseY < 400 && mousePressed){
      gameOverScreen = true;
      levelFour = false;
    }
    
    fill(255, 224, 110);
    rect(550, 100, 200, 200);
    if(mouseX > 550 && mouseY > 100 && mouseX < 650 && mouseY < 650 && mousePressed){
      levelFiveOP = true;
      levelFour = true;
    }

    

    

    /* Level Five
    fill(252, 3, 157);
    textSize(40);
    text("Red", 350, 50);

    rect(50, 100, 300, 300);

    fill(252, 3, 3);
    rect(450, 100, 300, 300);
    */

 
      // Add one point to score board
    }
    
    
  }
  // You win screen
 // background(0);
//  drawMinionOne(random(width), random(height), random(20, 55));
//}
  
// void drawMinionOne(float flowerX, float flowerY, float petalSize) {
 //  float petalDistance = petalSize / 2;

 // fill(255, 128, 0);

  // upper-left petal
/*  ellipse(flowerX - petalDistance, flowerY - petalDistance, 
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
  fill(49, 181, 222);
  ellipse(bodyX, bodyY, bodySize, bodySize);
  
  fill(255);
  textSize(100);
  text("You win!", 200, 250);
}
*/
  // Define other methods
  public void minionScreen(){
    background(0);
    
  }

  public void mouseClicked() {
    mClicked = true;
  }

  public void gameOverScreen(){
    background(0);
    fill(55);
    textSize(70);
    text("Game Over", 400, 400);
    textSize(30);
    text("Press 'm' to go back to menu", 200, 400);
    if(key == 'm') {
      gameOverScreen = false;
    }
  } 


}