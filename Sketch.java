import processing.core.PApplet;

public class Sketch extends PApplet {
	
	// Romuel's Page
  // Snow Settings
  float[] snowY;
  float speed = 1;

  float[] snowPile;
  float snowHeight = height;

  // Screens
  boolean menuScreen;
  boolean instructionScreen;
  boolean gameoverScreen;
  boolean Level1OP;
  boolean Level1;
  boolean Level2OP;
  boolean Level2;
  boolean Level3OP;
  boolean Level3;
  boolean minionScreen;
  boolean levelFourOP;
  boolean levelFour;
  boolean levelFiveOP;
  boolean levelFive;
  boolean winScreen;
  boolean loseScreen;

  // Minion Variables
  float bodyX = 400;
  float bodyY = 150;
  float bodySize = 193;
  float bodyDistance = bodySize/2;

  // Scoreboard
  int points = 0;

  public void settings() {
    size(800, 450);
  }

  public void setup() {
    menuScreen = true;
    background(0, 0, 0);

    snowY = new float [width];
    snowPile = new float[width];
    background(0);
    for(int i = 0; i < snowY.length; i++){
      snowY[i] = random(0, height);
    }
  }

  public void draw() {
    if(menuScreen){
      menuScreen();
    }
    else if(instructionScreen){
      instructionScreen();
    }
    else if(minionScreen){
      minionScreen();
    }
    else if(Level1OP){
      Level1OP();
    }
    else if(Level1){
      Level1();
    }
    else if(Level2OP){
      Level2OP();
    }
    else if(Level2){
      Level2();
    }
    else if(Level3OP){
      Level3OP();
    }
    else if(Level3){
      Level3();
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
    else if(loseScreen){
      loseScreen();
    }
    else if(winScreen)
    {
      winScreen();
    }
    else if(gameoverScreen){
      gameoverScreen();
    }
  }
  
  public void menuScreen(){
    // Snow Falling Down
    background(0);
    fill(75);


    for(int i = 0; i < snowY.length; i++){
      ellipse(i * 2, snowY[i], width / 80, height / 80);
      snowY[i] += speed;

      if(snowY[i] > height){
        snowY[i] = 0;
        snowPile[i] += (width / 90);
      }
    }
    
    // Start Button
    fill(255, 255, 255);
    rect(225, 100, 300 , 75);

    // How To Play Sign
    fill(50);
    textSize(40);
    text("Press 'e' to play", 235, 150);

    // How To Play Button
    fill(255, 255, 255);
    rect(225, 200, 300, 75);

    // Play Sign
    fill(50);
    textSize(28);
    text("Press 'i' for instructions", 230, 250);

    // Extreme
    fill(194, 25, 25);
    rect(10, 100, 80, 30);
    rect(10, 190, 80, 30);
    rect(10, 270, 80, 30);
    rect(10, 100, 30, 200);

    // Colour
    fill(18, 179, 21);
    rect(120, 100, 80, 30);
    rect(120, 270, 80, 30);
    rect(120, 100, 30, 200);

    // Picker
    fill(24, 15, 209);
    rect(550, 100, 80, 30);
    rect(550, 170, 80, 30);
    rect(620, 100, 30, 100);
    rect(550, 100, 30, 200);

    // Game
    fill(227, 224, 70);
    rect(680, 100, 90, 30);
    rect(740, 220, 30, 70);
    rect(725, 200, 60, 30);
    rect(680, 270, 90, 30);
    rect(680, 100, 30, 200);

    // Character #1
    fill(49, 181, 222);
    ellipse(50, 380, 75, 120);
    
    // eyes
    fill(255);
    ellipse(35, 360, 20, 20);
    ellipse(65, 360, 20, 20);

    fill(0);
    ellipse(35, 360, 5, 5);
    ellipse(65, 360, 5, 5);

    // mouth 
    fill(255, 42, 38);
    textSize(50);
    text("~", 35, 420);

    // Character #2
    fill(255, 143, 205);
    ellipse(400, 380, 75, 120);
    
    // eyes
    fill(255);
    ellipse(410, 360, 20, 20);
    ellipse(430, 360, 20, 20);

    fill(0);
    ellipse(410, 360, 5, 5);
    ellipse(430, 360, 5, 5);

    // mouth 
    fill(255, 42, 38);
    textSize(50);
    text("O", 400, 420);

    // Character #3
    fill(183, 74, 255);
    ellipse(730, 380, 75, 120);
    
    // eyes
    fill(255);
    ellipse(720, 360, 20, 20);
    ellipse(740, 360, 20, 20);

    fill(0);
    ellipse(720, 360, 5, 5);
    ellipse(740, 360, 5, 5);

    // mouth 
    fill(255, 42, 38);
    textSize(50);
    text("_", 720, 400);

    if(key == 'e'){
      menuScreen = false;
      minionScreen = true;
    }
    if(key == 'i'){
      menuScreen = false;
      instructionScreen = true;
      }
  }

  public void instructionScreen(){
    background(255, 158, 158);
    // Instruction Title
    fill(0);
    textSize(50);
    text("Instructions", 250, 75);

    // Instructions
    fill(0);
    textSize(30);
    text("Click your mouse button", 30, 150);
    text("to choose the right colour", 30, 190);
    text("Click the right colour to ", 30, 250);
    text("move onto the next level ", 30, 290);
    text("If you don't move fast", 400, 150);
    text("enough, you will die!", 400, 190);
    text("Press 'm' to go back to the", 400, 250);
    text("main menu when prompted", 400, 290);

    // Character #1
    fill(49, 181, 222);
    ellipse(50, 380, 75, 120);
    
    // eyes
    fill(255);
    ellipse(60, 360, 20, 20);
    ellipse(80, 360, 20, 20);

    fill(0);
    ellipse(65, 355, 5, 5);
    ellipse(85, 355, 5, 5);

    // mouth 
    fill(255, 42, 38);
    textSize(50);
    text("~", 50, 420);

    // Character #2
    fill(183, 74, 255);
    ellipse(730, 380, 75, 120);
    
    // eyes
    fill(255);
    ellipse(700, 360, 20, 20);
    ellipse(720, 360, 20, 20);

    fill(0);
    ellipse(695, 355, 5, 5);
    ellipse(715, 355, 5, 5);

    // mouth 
    fill(255, 42, 38);
    textSize(50);
    text("_", 700, 400);

    if(key == 'm'){
      instructionScreen = false;
      menuScreen = true;
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

    // Enter Game
    if (mouseX < width && mouseY < height && mousePressed)
    {
      Level1OP = true;
      minionScreen = false;
    }
  }

  public void gameoverScreen(){
    background(0);
    fill(255);
    textSize(70);
    text("Game Over", 210, 200);
    textSize(30);
    text("Press 'm' to go back to menu", 200, 400);
    if(key == 'm'){
      gameoverScreen = false;
      menuScreen = true;
    }
  }
  
  public void Level1OP(){
    background(255);
    // Level 1 Opening Page
    fill(0);
    textSize(75);
    text("Level 1:", 255, 155);
    text("Get Passed Evil", 120, 255);
    text("Loli's Minions!", 160, 325);

    // Ready Phrase
    fill(0);
    textSize(30);
    text("press 'p' when ready!", 500, 430);
    if(key == 'p'){
      Level1 = true;
      Level1OP = false;
    }
  }

  public void Level1(){
    background(0);
    
    // Timer
    fill(255);
    text(millis(), 740, 30);

    // Colour Chosen
    fill(255);
    textSize(70);
    text("Blue", 330, 100);

    // Box 1: Blue
    fill(19, 21, 143);
    rect(150, 200, 150, 150);
    if(mouseX > 150 && mouseY > 200 && mouseX < 300 && mouseY < 350 && mousePressed){
      Level2OP = true;
      Level1 = false;
      int timeBonus = ((20000 / millis()) * 10);
      points = points + 10 + timeBonus;
    }

    // Box 2: White
    fill(255);
    rect(500, 200, 150, 150);
    if(mouseX > 500 && mouseY > 150 && mouseX < 650 && mouseY < 350 && mousePressed){
      gameoverScreen = true;
      Level1 = false;
    }
    textSize(20);
    text("Points: " + points, 10, 30);
  }

  public void Level2OP(){  
    background(255);
    // Level 2 Opening Page
    fill(0);
    textSize(75);
    text("Level 2:", 250, 155);
    text("Defeat More Minions!", 50, 305);

    // Ready Phrase
    fill(0);
    textSize(30);
    text("press 'u' when ready!", 500, 430);
    if(key == 'u'){
      Level2OP = false;
      Level2 = true;
    }
    textSize(20);
    text("Points: " + points, 10, 30);
}

  public void Level2(){
    background(0);
    // Timer
    fill(255);
    text(millis(), 740, 30);

    // Colour Chosen
    fill(255, 215, 84);
    textSize(70);
    text("Orange", 285, 100);

    // Box 1: Yellow
    fill(255, 215, 84);
    rect(150, 200, 150, 150);
    if(mouseX > 150 && mouseY > 200 && mouseX < 300 && mouseY < 350 && mousePressed){
      gameoverScreen = true;
      Level2 = false;
    }

    // Box 2: Orange
    fill(255, 119, 0);
    rect(500, 200, 150, 150);
    if(mouseX > 500 && mouseY > 200 && mouseX < 650 && mouseY < 350 && mousePressed){
      Level3OP = true;
      Level2 = false;
      int timeBonus = ((20000 / millis()) * 10);
      points = points + 10 + timeBonus;
    }
    textSize(20);
    text("Points: " + points, 10, 30);
  }

  public void Level3OP(){
    background(255);
    // Level 3 Opening Page
    fill(0);
    textSize(75);
    text("Level 3:", 250, 155);
    text("Defeat Mini Boss!", 100, 255);

    // Ready Phrase
    fill(0);
    textSize(30);
    text("press 'p' when ready!", 500, 430);
    if(key == 'p'){
      Level3OP = false;
      Level3 = true;
    }
    textSize(20);
    text("Points: " + points, 10, 30);
}

  public void Level3(){
    background(74, 47, 47);
    
    // Timer
    fill(255);
    text(millis(), 740, 30);

    // Colour Chosen
    fill(53, 2, 54);
    textSize(70);
    text("pink", 330, 100);

    // Box 1: Black
    fill(0);
    rect(50, 200, 150, 150);
    if(mouseX > 50 && mouseY > 200 && mouseX < 200 && mouseY < 350 && mousePressed){
      gameoverScreen = true;
      Level3 = false;
    }

    // Box 2: Pink
    fill(239, 75, 242);
    rect(325, 200, 150, 150);
    if(mouseX > 325 && mouseY > 200 && mouseX < 475 && mouseY < 350 && mousePressed){
      levelFourOP = true;
      Level3 = false;
      int timeBonus = ((20000 / millis()) * 10);
      points = points + 10 + timeBonus;
    }

    // Box 3: Purple
    fill(53, 2, 54);
    rect(600, 200, 150, 150);
    if(mouseX > 600 && mouseY > 200 && mouseX < 750 && mouseY < 350 && mousePressed){
      gameoverScreen = true;
      Level3 = false;
    }
    textSize(20);
    text("Points: " + points, 10, 30);
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
    
    // box 1
    rect(50, 100, 200, 200);
    if(mouseX > 50 && mouseY > 100 && mouseX <250 && mouseY < 300 && mousePressed)
      { 
        gameoverScreen = true;
        levelFour = false;
      }
    // box 2
    fill(140, 255, 0);
    rect(300, 100, 200, 200);
    if(mouseX > 300 && mouseY > 100 && mouseX < 500 && mouseY < 300 && mousePressed)
      {
        gameoverScreen = true;
        levelFour = false;

      }
  // correct box 3
    fill(255, 224, 110);
    rect(550, 100, 200, 200);
    if(mouseX > 550 && mouseY > 100 && mouseX < 750 && mouseY < 300 && mousePressed)
      {
        levelFiveOP = true;
        levelFour = false;

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

    // box 1
    rect(50, 100, 300, 100);
    if(mouseX > 50  && mouseY > 100 && mouseX < 350 && mouseY < 200 && mousePressed)
    {
      gameoverScreen = true;
      levelFive = false;
    }

    // Correct Rectangle box 2
    fill(252, 3, 3);
    rect(450, 100, 300, 100);
    if(mouseX > 450  && mouseY > 100 && mouseX < 750 && mouseY < 200 && mousePressed)
    {
      winScreen = true;
      levelFive = false;

      int timeBonus = ((20000/ millis())*10);
      points = points + 10 + timeBonus;

      if(points >= 160)
      {
        winScreen = true;
        levelFive = false;
      }
      else if(points < 160)
      {
        loseScreen = true;
        levelFive = false;
      }
    }
    // box 3
    fill(255, 115, 0);
    rect(50, 225, 200, 100);
    if(mouseX > 50  && mouseY > 225 && mouseX < 250 && mouseY < 325 && mousePressed)
    {
      gameoverScreen = true;
      levelFive = false;
    }
    // box 4
    fill(247, 0, 255);
    rect(300, 225, 200, 100);
    if(mouseX > 300  && mouseY > 225 && mouseX < 500 && mouseY < 325 && mousePressed)
    {
      gameoverScreen = true;
      levelFive = false;
    }
    // box 5
    fill(111, 24, 242);
    rect(550, 225, 200, 100);
    if(mouseX > 550  && mouseY > 225 && mouseX < 750 && mouseY < 325 && mousePressed)
    {
      gameoverScreen = true;
      levelFive = false;
    }
    textSize(20);
    text("Point: "+points, 10, 30);
  }

  public void winScreen()
  {
    background(255, 161, 133);

    // Background Design
    stroke(255);
    for(int i = 1; i<= 9; i++)
    {
      strokeWeight(i);
      int lineX = i * 30;
      line(lineX, 0, lineX, height);
    }
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

    // Win Screen
    fill(0);
    textSize(100);
    text("You win!", 200, 250);
    
    // Play Again Button
    fill(102);
    rect(75, 310, 250, 50);
    if(mouseX > 75  && mouseY > 310 && mouseX < 325 && mouseY < 360 && mousePressed)
    {
      Level1OP = true;
      winScreen = false;
    }

    // Play Again Sign
    fill(255);
    textSize(40);
    text("Play Again!", 100, 350);

    // Main Menu Button
    fill(102);
    rect(375, 310, 350, 50);
    if(mouseX > 375  && mouseY > 310 && mouseX < 725 && mouseY < 425 && mousePressed)
    {
      menuScreen = true;
      winScreen = false;
    }

    // Main menu Sign
    fill(255);
    textSize(40);
    text("Return to Menu", 410, 350);
  }

  public void loseScreen() 
  {
    if(points < 160){
    background(0);

    fill(255);
    textSize(50);
    text("You Lose!" , 200, 100);
    text("Your score was: " + points, 100, 150);
    text("The Evil Loli", 100, 300);
    text("has taken over", 100, 350);
    text("the world!", 100, 400);

    // Character #1
    fill(49, 181, 222);
    ellipse(50, 380, 75, 120);
  
    // eyes
    fill(0);
    textSize(30);
    text("x", 20, 380);
    text("x", 60, 380);

    // mouth 
    fill(255, 42, 38);
    textSize(50);
    text("~", 35, 420);

    // Character #2
    fill(255, 143, 205);
    ellipse(600, 200, 75, 120);
  
    // eyes
    fill(255);
    textSize(30);
    text("x", 580, 200);
    text("x", 610, 200);

    // mouth 
    fill(255, 42, 38);
    textSize(50);
    text("_", 590, 230);

    // Character #3
    fill(183, 74, 255);
    ellipse(730, 380, 75, 120);
  
    // eyes
    fill(0);
    textSize(30);
    text("x", 710, 360);
    text("x", 730, 360);
    
    // mouth 
    fill(255, 42, 38);
    textSize(30);
    text("w", 720, 410);
    }
  if(key == 'm'){
    menuScreen = true;
    loseScreen = false;
    }
  }
}
