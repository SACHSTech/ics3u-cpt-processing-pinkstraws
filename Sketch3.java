import processing.core.PApplet;

public class Sketch3 extends PApplet {
    boolean minionScreen;
    boolean gameOverScreen;
    boolean levelFourOP;
    boolean levelFour;
    boolean levelFiveOP;
    boolean levelFive; 
public void settings(){
    size(800, 450);
    }
public void setup(){
    minionScreen = true;
    }

public void draw(){
    if(minionScreen){
        minionScreen();
    }
    if(levelFourOP){
        levelFourOP();
    }
    if(levelFour){
        levelFour();
    }
    if(levelFiveOP){
        levelFiveOP();
    }
    if(levelFive){
        levelFive();
    }
    if(gameOverScreen){
        gameOverScreen();
    }
    }
public void minionScreen(){
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
    if(mouseX > 0 && mouseY > 0 && mouseX < 800 && mouseY < 450 && mousePressed){
        levelFourOP = true;
        minionScreen = false;
    }
    }
public void levelFourOP(){
    background(255);
    fill(0);
    textSize(75);
    text("Level 4:", 250, 155);
    text("Good Luck!", 50, 305);

    textSize(45);
    text("Click the 'o' key when you are ready!", 25, 400);
    if(key == 'o')
    {
      levelFour();
    }
}
public void levelFour(){
    background(0);
    fill(66, 245, 173);
    textSize(40);
    text("Yellow", 345, 50);
  
    // box 1
    rect(50, 100, 200, 200);
    if(mouseX > 50 && mouseY > 100 && mouseX < 250 && mouseY < 300 && mousePressed)
    {
      gameOverScreen = true;
      levelFour = false;
    }
    
    // box 2
    fill(140, 255, 0);
    rect(300, 100, 200, 200);
    if(mouseX > 300 && mouseY > 100 && mouseX < 500 && mouseY < 300 && mousePressed)
    {
      gameOverScreen = true;
      levelFour = false;
    }
    
    // correct box 3
    fill(255, 224, 110);
    rect(550, 100, 200, 200);
    if(mouseX > 550 && mouseY > 100 && mouseX < 750 && mouseY < 300 && mousePressed)
    {
      levelFiveOP = true;
      levelFour = false;
    }
}
public void levelFiveOP(){
    background(255);
    fill(0);
    textSize(75);
    text("Level 5:", 250, 155);
    text("Can you beat the ultimate boss?!", 50, 305);

    textSize(45);
    text("Click the 'q' key when you are ready!", 25, 400);
      if(key == 'q'){
      levelFive = true;
      levelFiveOP = false;
      }
}
public void levelFive(){
    background(0);
    fill(252, 3, 157);
    textSize(40);
    text("Red", 350, 50);
    rect(50, 100, 300, 300);
    fill(252, 3, 3);
    rect(450, 100, 300, 300);
    }

public void gameOverScreen(){
    background(0);
    fill(55);
    textSize(70);
    text("Game Over", 200, 200);
    textSize(30);
    text("Press 'm' to go back to menu", 200, 400);
    if(key == 'm') 
    {
      minionScreen = true;
    }
}
}