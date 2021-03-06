import processing.core.PApplet;

public class Sketch1 extends PApplet 
{

  // Rachel's page

  // Booleans for different frames
    boolean minionScreen;
    boolean gameOverScreen;
    boolean levelFourOP;
    boolean levelFour;
    boolean levelFiveOP;
    boolean levelFive;
    boolean winScreen;

  // Variables for minions
    float bodyX = 400;
    float bodyY = 150;
    float bodySize = 193;
    float bodyDistance = bodySize/2;

  // Array Scoreboard
    int points = 0;

public void settings() 
  {
    size(800, 450);
  }
  
public void setup() 
  {
    minionScreen = true;
  }

public void draw() 
  // Order of Screens

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
      levelFour();
    }
    else if(levelFiveOP)
    {
      levelFiveOP();
    }
    else if(levelFive)
    {
      levelFive();
    }
    else if(winScreen)
    {
      winScreen();
    }
    else if(gameOverScreen)
    {
      gameOverScreen();
    }
  }
   
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
   if (mouseX < width && mouseY < height && mousePressed)
    {
      levelFourOP = true;
      minionScreen = false;
    }
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

  // 'o' key is pressed then level four screen is called
    if(key == 'o')
    {
      levelFour = true;
      levelFourOP = false;
    }
  }
  
public void levelFour()
  {
    background(0);

  // Timer
    fill(255);
    text(millis(), 740, 30);

    fill(66, 245, 173);
    textSize(40);
    text("Yellow", 345, 50);
    
  // Box 1
    rect(50, 100, 200, 200);
    if(mouseX > 50 && mouseY > 100 && mouseX <250 && mouseY < 300 && mousePressed)
      { 
        gameOverScreen = true;
        levelFour = false;
      }
  // Box 2
    fill(140, 255, 0);
    rect(300, 100, 200, 200);
    if(mouseX > 300 && mouseY > 100 && mouseX < 500 && mouseY < 300 && mousePressed)
      {
        gameOverScreen = true;
        levelFour = false;
      }
  // Box 3 (Correct Answer)
    fill(255, 224, 110);
    rect(550, 100, 200, 200);
    if(mouseX > 550 && mouseY > 100 && mouseX < 750 && mouseY < 300 && mousePressed)
      {
        levelFiveOP = true;
        levelFour = false;

        // Calculates + stores points
        int timeBonus = ((20000 / millis())*10);
        points = points +10 + timeBonus;
      }
      textSize(20);
      text("Points: " + points, 10, 30);
    }

public void levelFiveOP()
  {
    background(255);
    fill(0);
    textSize(50);
    text("Level 5:", 260, 155);
    text("Can you beat the ultimate boss?!", 25, 305);
  
    textSize(35);
    text("Click the 'q' key when you are ready!", 25, 400);
    
  // If 'q' key is pressed, level Five Screen is true and OP is false
    if(key == 'q')
    {
      levelFive = true;
      levelFiveOP = false;
    }
    textSize(20);
    text("Points: " + points, 10, 30);
  }

public void levelFive()
  {
    background(0);

  // Timer
    fill(255);
    text(millis(), 740, 30);

    fill(252, 3, 157);
    textSize(40);
    text("Red", 350, 50);

  // Box 1
    rect(50, 100, 300, 100);
    if(mouseX > 50  && mouseY > 100 && mouseX < 350 && mouseY < 200 && mousePressed)
    {
      gameOverScreen = true;
      levelFive = false;
    }

  // Box 2 (Correct Answer)
    fill(252, 3, 3);
    rect(450, 100, 300, 100);
    if(mouseX > 450  && mouseY > 100 && mouseX < 750 && mouseY < 200 && mousePressed)
    {
      winScreen = true;
      levelFive = false;

      // Calculates + stores points
      int timeBonus = ((20000/ millis())*10);
      points = points + 10 + timeBonus;
    }
  // Box 3
    fill(255, 115, 0);
    rect(50, 225, 200, 100);
    if(mouseX > 50  && mouseY > 225 && mouseX < 250 && mouseY < 325 && mousePressed)
    {
      gameOverScreen = true;
      levelFive = false;
    }
  // Box 4
    fill(247, 0, 255);
    rect(300, 225, 200, 100);
    if(mouseX > 300  && mouseY > 225 && mouseX < 500 && mouseY < 325 && mousePressed)
    {
      gameOverScreen = true;
      levelFive = false;
    }
  // Box 5
    fill(111, 24, 242);
    rect(550, 225, 200, 100);
    if(mouseX > 550  && mouseY > 225 && mouseX < 750 && mouseY < 325 && mousePressed)
    {
      gameOverScreen = true;
      levelFive = false;
    }
    textSize(20);
    text("Point: "+points, 10, 30);
  }

public void gameOverScreen()
  {
    background(0);
    fill(55);
    textSize(70);
    text("Game Over", 200, 200);
    textSize(30);
    text("Press 'm' to go back to menu", 200, 400);

  // If 'm' key is pressed, then the code will go back to the minionScreen 
    if(key == 'm') 
    {
      minionScreen();
    }
  } 

public void winScreen()
  {
    background(255, 161, 133);
    
    stroke(255);

  // For loop for line design
    for(int i = 1; i<= 9; i++)
    {
      strokeWeight(i);

      int lineX = i * 30;
      line(lineX, 0, lineX, height);
    }
  // Randomizes minions size, placement
    drawMinionOne(random(width), random(height), random(10, 50));
  }
  
  void drawMinionOne(float bodyX, float bodyY, float bodySize) 
  {
    float bodyDistance = bodySize / 2;

    fill(255, 128, 0);
    strokeWeight(0);
  // body
    fill(49, 181, 222);
    ellipse(bodyX, bodyY, bodySize*3, bodySize*4);

  // White part of eye (L)
    fill(255);
    ellipse(bodyX - bodyDistance, bodyY - bodyDistance, bodySize/2, bodySize/2);

  // White part of eye (R)
    ellipse(bodyX + bodyDistance, bodyY - bodyDistance, bodySize/2, bodySize/2);

  // Black part of eye (L)
    fill(0);
    ellipse(bodyX - bodyDistance, bodyY - bodyDistance, bodySize/3, bodySize/3);

  // Black part of eye (R)
    ellipse(bodyX + bodyDistance, bodyY - bodyDistance, bodySize/3, bodySize/3);

  
    fill(0);
    textSize(100);
    text("You win!", 200, 250);

    // Play Again Button
    fill(102);
    rect(75, 310, 250, 50);
    if(mouseX > 75  && mouseY > 310 && mouseX < 325 && mouseY < 360 && mousePressed)
    {
      levelFourOP = true;
      winScreen = false;
    }

    fill(255);
    textSize(40);
    text("Play Again!", 100, 350);

  // Return to Menu Button
    fill(102);
    rect(375, 310, 350, 50);
    if(mouseX > 375  && mouseY > 310 && mouseX < 725 && mouseY < 425 && mousePressed)
    {
      minionScreen = true;
      winScreen = false;
    }
    fill(255);
    textSize(40);
    text("Return to Menu", 410, 350);
  }
}

