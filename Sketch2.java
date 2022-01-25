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
  

  public void setup() {
    background(0, 0, 0);

    snowY = new float [width];
    snowPile = new float[width];
    background(0);
    for(int i = 0; i < snowY.length; i++){
      snowY[i] = random(0, height);
    }
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
    text("Press i for instructions", 235, 252);

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

    textSize(90);
    text("I LOVE JOSH", 200, 200);

    if(pback == true){
      background(172, 58, 224);
    }

    if (gback == true){
      background(130, 230, 80);
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
