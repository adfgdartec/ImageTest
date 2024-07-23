package imagetest;
import processing.core.PApplet;
import processing.core.PImage;
public class ImageTest extends PApplet{
    PImage character;
    PImage background;
    public static void main(String[] args){
        PApplet.main("imagetest.ImageTest");

    }
    public void settings(){
        size(500,500);
    }

    public void setup(){
       character = loadImage("images/Character (2).png");
       background = loadImage("images/Background.png");
    }

    public void draw(){
        background(background);
        image(character,200,200);
        character.resize(300,300);
        tint(184,160);
        tint(0,255,0);
    }
}
