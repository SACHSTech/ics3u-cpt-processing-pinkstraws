import processing.core.PApplet;

public class Sketch1 extends PApplet {

  // Rachel's page

  // Input boolean
    boolean mClicked = false;
    boolean mPressed = false;
    boolean mReleased = false;

  // Frame booleans
    boolean minionScreen;
    boolean gameOverScreen;
    boolean levelFourOP;
    boolean levelFour;
    boolean levelFiveOP;
    boolean levelFive;

  // Variables for minions
    float bodyX = 400;
    float bodyY = 150;
    float bodySize = 193;
    float bodyDistance = bodySize/2;


  public void settings() 
  {
    size(800, 450);
  }
  
  public void setup() 
  {
    minionScreen = true;
  }

  public void draw() 
  {
    if(minionScreen)
    {
      minionScreen();
    }
    else if(levelFourOP)
    {
     levelFourOP();
    }
    else if(levelFour)
    {
      levelFour(mouseX <= 550);
    }
    else if(levelFiveOP)
    {
      levelFiveOP();
    }
    else if(levelFive)
    {
      levelFive();
    }
    else if(gameOverScreen)
    {
      gameOverScreen();
    }
  }
    
      // Add one point to score board
    
    
  // Define other methods
  public void minionScreen()
  {
  
    background(0);
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
   if (mClicked) 
    {
      background(0);
      levelFourOP();
    }
   }
  
  public void mouseClicked() 
    {
      mClicked = true;
    }

  public void mousePressed()
  {
    mPressed = true;
  }
  public void mouseReleased()
  {
    mReleased = true;
  }

  public void levelFourOP()
  {
    background(255);
    fill(0);
    textSize(75);
    text("Level 4:", 250, 155);
    text("Good Luck!", 50, 305);

    textSize(45);
    text("Click the 'o' key when you are ready!", 25, 400);
    if(keyPressed = true)
    {
      if(key == 'o')
      {
      levelFour(mouseX <= 550);
      }
    }
  }
  public void levelFour(boolean b)
  {
    background(0);
    fill(66, 245, 173);
    textSize(40);
    text("Yellow", 345, 50);
   
    
    // box 1
      rect(50, 100, 200, 200);
    // box 2
      fill(140, 255, 0);
      rect(300, 100, 200, 200);
    // correct box 3
      fill(255, 224, 110);
      rect(550, 100, 200, 200);

     
      if(mouseX > 50 && mouseY > 100 && mouseX <150 && mouseY < 200 && mClicked)
      {
        gameOverScreen();
      }
      
      if(mouseX > 300 && mouseY > 100 && mouseX < 500 && mouseY < 300 && mousePressed)
      {
        gameOverScreen();
      }
      
      if(mouseX > 550 && mouseY > 100 && mouseX < 750 && mouseY < 300 && mousePressed)
      {
        levelFiveOP();
      }
    }
  
  

  public void levelFiveOP()
  {
    background(255);
    fill(0);
    textSize(75);
    text("Level 5:", 250, 155);
    text("Can you beat the ultimate boss?!", 50, 305);

    textSize(45);
    text("Click the 'q' key when you are ready!", 25, 400);
    if(keyPressed = true)
    {
      if(key == 'q')
      {
      levelFive();
      }
    }
  }
  public void levelFive()
  {
    fill(252, 3, 157);
    textSize(40);
    text("Red", 350, 50);

    rect(50, 100, 300, 300);

    fill(252, 3, 3);
    rect(450, 100, 300, 300);
  }

  public void gameOverScreen()
  {
    background(0);
    fill(55);
    textSize(70);
    text("Game Over", 200, 200);
    textSize(30);
    text("Press 'm' to go back to menu", 200, 400);
    if(key == 'm') 
    {
      minionScreen();
    }
  } 

  public void winScreen()
  {
    background(0);
    drawMinionOne(random(width), random(height), random(20, 55));
  }
  
  void drawMinionOne(float flowerX, float flowerY, float petalSize) 
  {
    float petalDistance = petalSize / 2;

    fill(255, 128, 0);

  // upper-left petal
    ellipse(flowerX - petalDistance, flowerY - petalDistance, petalSize, petalSize);

  // upper-right petal
    ellipse(flowerX + petalDistance, flowerY - petalDistance, petalSize, petalSize);

  // lower-left petal
    ellipse(flowerX - petalDistance, flowerY + petalDistance, petalSize, petalSize);

  // lower-right petal
    ellipse(flowerX + petalDistance, flowerY + petalDistance, petalSize, petalSize);

  // center petal
    fill(49, 181, 222);
    ellipse(bodyX, bodyY, bodySize, bodySize);
  
    fill(255);
    textSize(100);
    text("You win!", 200, 250);
  }
}

