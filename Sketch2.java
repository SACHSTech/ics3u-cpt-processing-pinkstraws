import processing.core.PApplet;

public class Sketch2 extends PApplet {
	
	// Romuel's Page

  public void settings() {
    size(800, 450);
  }

  // Snow Settings
  float[] snowY;
  float speed = 1;

  float[] snowPile;
  float snowHeight = height;

  // Background Settings
  boolean pback = false;
  boolean gback = false;

  // Time Settings
  int time;
  int wait = 5;
  int tick;

  // Correct Answers Settings
  

  public void setup() {
    background(0, 0, 0);

    snowY = new float [width];
    snowPile = new float[width];
    background(0);
    for(int i = 0; i < snowY.length; i++){
      snowY[i] = random(0, height);
    }

    // Time unit
    time = millis();
    tick = time - 1;

  }

  public void draw() {
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
    text("Press e to play", 240, 150);

    // How To Play Button
    fill(255, 255, 255);
    rect(225, 200, 300, 75);

    // Play Sign
    fill(50);
    textSize(28);
    text("Press i for instructions", 235, 250);

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

    if(pback == true){
      background(172, 58, 224);

      // Level 1
      fill(0);
      textSize(75);
      text("Level 1:", 300, 155);
      text("Get Passed Evil", 150, 305);
      text("Loli's Minions!", 200, 375);
      
      if(key == 'p'){
        background(79, 10, 10);

        
        // Colour Option
        fill(255);
        textSize(50);
        text("Blue", 350, 100);

        // Time Settings
        if(millis() - time >= wait){
          fill(255);
          text(time, 10, 50);; //if it is, do something
          time = 5; //also update the stored time
        }

        // Box 1: White
        fill(255);
        rect(150, 150, 150, 150);
        fill(0);
        textSize(30);
        text("Left Click", 165, 200);

        // Box 2: Blue
        fill(19, 21, 143);
        rect(500, 150, 150, 150);
        fill(0);
        textSize(30);
        text("Right Click", 505, 200);

          if(mousePressed && (mouseButton == LEFT)){
            background(0);
          }
          else if(mouseButton == RIGHT){
            background(0);
            fill(55);
            textSize(70);
            text("Game Over", 400, 400);
          }
        }
      }

    if (gback == true){
      background(130, 230, 80);

      // Instruction Title
      fill(0);
      textSize(50);
      text("Instructions", 250, 75);

      // Instructions
      fill(0);
      textSize(30);
      text("Use your left click to", 30, 150);
      text("choose the right tile", 30, 190);
      text("Click the right colour to ", 30, 250);
      text("move onto the next level ", 30, 290);
      text("If you don't move fast enough,", 400, 150);
      text("you will die!", 400, 190);
      text("Click p to start the game", 400, 250);
      text("Press 'm' to go back to", 200, 350);
      text("the main menu at any time", 200, 390);
    }
    
  }

  public void keyPressed(){
    
    // Menu Toggling
    if(key == 'e'){
      pback = true;
    }
    if(key == 'i'){
      gback = true;
    }
    if(key == 'm'){
      gback = false;
      pback = false;
    }
  }
}
