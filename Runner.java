import java.awt.*;
import gpdraw.*;
public class Runner{
    public static Color RED = Color.red, BLUE = Color.blue,
        YELLOW = Color.yellow, ORANGE = Color.orange, 
        BLACK = Color.black, GREEN = Color.green, 
        MAGENTA = Color.magenta, WHITE = Color.white;
    public static void main(String[] args){
        System.out.println("Hello World");
        SketchPad paper = new SketchPad(750, 750);
        DrawingTool pen = new DrawingTool(paper);
        pen.down(); //pen is touching the vertical sketch pad
        //duck feet
        pen.up();
        pen.move(-25, -125);
        pen.down();
        pen.setColor(ORANGE);
        pen.drawRect(15, 100);
        pen.fillRect(15, 100);
        
        pen.up();
        pen.move(25, -125);
        pen.down();
        pen.setColor(ORANGE);
        pen.drawRect(15, 100);
        pen.fillRect(15, 100);
        
        pen.up();
        pen.move(-17, -177);
        pen.down();
        pen.setColor(ORANGE);
        pen.drawRect(30, 10);
        pen.fillRect(30, 10);
        
        pen.up();
        pen.move(33, -177);
        pen.down();
        pen.setColor(ORANGE);
        pen.drawRect(30, 10);
        pen.fillRect(30, 10);
        //duck body
          //Yellow body
        pen.up();
        pen.move(0, 0);
        pen.down();
        pen.setColor(YELLOW);
        pen.drawCircle(115);
        pen.fillCircle(115);
          //Orange wing
        pen.up();
        pen.move(0, -25);
        pen.down();
        pen.setColor(ORANGE);
        pen.drawCircle(60);
        pen.fillCircle(60);
          //White rectangle
        pen.up();
        pen.move(0, 60);
        pen.down();
        pen.setColor(WHITE);
        pen.drawRect(230, 115);
        pen.fillRect(230, 115);
        
        //duck beak
        pen.up();
        pen.move(150, 100);
        pen.down();
        pen.setColor(ORANGE);
        pen.drawRect(75, 25);
        pen.fillRect(75, 25);
        
        //duck head
        pen.up();
        pen.move(100, 100);
        pen.down();
        pen.setColor(YELLOW);
        pen.drawCircle(50); 
        pen.fillCircle(50);
        //duck neck
        pen.up();
        pen.move(100, 50);
        pen.down();
        pen.setColor(YELLOW);
        pen.drawRect(28, 100);
        pen.fillRect(28, 100);
        //duck eye
        pen.up();
        pen.move(110, 100);
        pen.down();
        pen.setColor(BLACK);
        pen.drawCircle(10);
        pen.fillCircle(10);
        pen.up();
        pen.move(115, 100);
        pen.down();
        pen.setColor(BLUE);
        pen.drawCircle(5);
        pen.fillCircle(5);
        pen.up();
        pen.move(117, 100);
        pen.down();
        pen.setColor(WHITE);
        pen.drawCircle(3);
        pen.fillCircle(3);
        //top hat
        pen.up();
        pen.move(100, 140);
        pen.down();
        pen.setColor(BLACK);
        pen.drawRect(125, 25);
        pen.fillRect(125, 25);
        
        pen.up();
        pen.move(100, 165);
        pen.down();
        pen.setColor(BLACK);
        pen.drawRect(60, 75);
        pen.fillRect(60, 75);
        
        pen.up();
        pen.move(100, 165);
        pen.down();
        pen.setColor(BLUE);
        pen.drawRect(60, 18);
        pen.fillRect(60, 18);
        
    }
    
    
}