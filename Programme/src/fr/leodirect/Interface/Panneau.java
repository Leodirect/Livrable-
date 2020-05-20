package fr.leodirect.Interface;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panneau extends JPanel{
  private Color color = Color.white;
  private static int COUNT = 0;
  private String message = "";
   
  public Panneau(){}
  public Panneau(Color color){
    this.color = color;
    this.message = "Contenu du panneau N°" + (++COUNT);
  }
  public void paintComponent(Graphics g){
    g.setColor(this.color);
    g.fillRect(0, 0, this.getWidth(), this.getHeight());
    g.setColor(Color.white);
    g.setFont(new Font("Arial", Font.BOLD, 15));
    g.drawString(this.message, 10, 20);
  }
}
/*import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
 
public class Panneau extends JPanel {
  private int posX = -50;
  private int posY = -50;

  public void paintComponent(Graphics g){
   
    g.setColor(Color.white);
 
    g.fillRect(0, 0, this.getWidth(), this.getHeight());
 
    g.setColor(Color.red);

    g.fillOval(posX, posY, 50, 50);
  }

  public int getPosX() {
    return posX;
  }

  public void setPosX(int posX) {
    this.posX = posX;
  }

  public int getPosY() {
    return posY;
  }

  public void setPosY(int posY) {
    this.posY = posY;
  }
}
*/











/*import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
 
public class Panneau extends JPanel {
  public void paintComponent(Graphics g){
    Graphics2D g2d = (Graphics2D)g;         
    GradientPaint gp = new GradientPaint(0, 0, Color.RED, 30, 30, Color.cyan, true);                
    g2d.setPaint(gp);
    g2d.fillRect(0, 0, this.getWidth(), this.getHeight());                
  }               
}



*/







/*import java.awt.Graphics;
import javax.swing.JPanel;
 
public class Panneau extends JPanel { 
  public void paintComponent(Graphics g){
    g.fillOval(20, 20, 75, 75);
  }               
}*/