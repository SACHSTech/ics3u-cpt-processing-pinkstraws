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
    rect(250, 100, 300 , 75);

    // How To Play Button
    fill(255, 255, 255);
    rect(300, 200, 200 , 75);

    // Extreme
    fill(194, 25, 25);

    // Colour
    fill(18, 179, 21);
    arc(50, 200, 100, 200, 10, 270);
    fill(0, 0, 0);
    arc(70, 230, 100, 200, 10, 270);

    // Picker
    fill(24, 15, 209);

    // Game
    fill(227, 224, 70);

  }
  
}
