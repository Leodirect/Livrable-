package fr.leodirect.Interface;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;

public class Window extends JWindow{

		   
		  public Window(){      
		    setSize(220, 165);
		    setLocationRelativeTo(null);      
		    JPanel pan = new JPanel();
		    JLabel img = new JLabel(new ImageIcon("file:///C:/Users/L%E9o%20OLIVIER/eclipse-workspace/Programme/src/fr/leodirect/Interface/owl-paris-eternal-logo-equipe-roster-joueur.jpg"));
		    img.setVerticalAlignment(JLabel.CENTER);
		    img.setHorizontalAlignment(JLabel.CENTER);      
		    pan.setBorder(BorderFactory.createLineBorder(Color.blue));
		    pan.add(img);
		    getContentPane().add(pan);
		  }
		}


