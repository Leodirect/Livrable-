package fr.leodirect.Interface;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.text.html.HTMLEditorKit;



/*public class fenetre extends JFrame {
	  private JEditorPane editorPane, apercu;
	  private JTabbedPane onglet = new JTabbedPane();
	   
	  public fenetre(){
	    this.setSize(600, 400);
	    this.setTitle("Conteneur éditable");
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    editorPane = new JEditorPane();
	    editorPane.setText(" <HTML><HEAD></HEAD><BODY></BODY></HTML> ");
	      
	    apercu = new JEditorPane();
	    apercu.setEditable(false);
	      
	    onglet.addTab("Editeur HTML", new JScrollPane(editorPane));
	    onglet.addTab("Aperçu", new JScrollPane(apercu));
	    onglet.addChangeListener(new ChangeListener(){

	      public void stateChanged(ChangeEvent e) {            
	        FileWriter fw = null;            
	        try {
	          fw = new FileWriter(new File("tmp/tmp.html"));
	          fw.write(editorPane.getText());
	          fw.close();
	        } catch (FileNotFoundException e1) {
	          e1.printStackTrace();
	        } catch (IOException e1) {
	          e1.printStackTrace();
	        }
	        try {
	          File file = new File("tmp/tmp.html");
	          apercu.setEditorKit(new HTMLEditorKit());               
	          apercu.setPage(file.toURL());
	        } catch (IOException e1) {
	          e1.printStackTrace();
	        }             
	      }            
	    });
	      
	    this.getContentPane().add(onglet, BorderLayout.CENTER);
	    this.setVisible(true);
	  }
	  
}*/
/*
public class fenetre extends JFrame {
	  private JTabbedPane onglet;
	   
	  public fenetre(){
	    this.setLocationRelativeTo(null);
	    this.setTitle("Gérer vos conteneurs");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(400, 200);
	    Panneau[] tPan = {   new Panneau(Color.RED), new Panneau(Color.GREEN), new Panneau(Color.BLUE)};
	     
	    onglet = new JTabbedPane();
	    int i = 0;
	    for(Panneau pan : tPan){
	      onglet.add("Onglet n° "+(++i), pan);
	     

	    }
	  
	    this.getContentPane().add(onglet);
	    this.setVisible(true);
	  }
}*/
public class fenetre extends JFrame {

	  private JTextArea textPane = new JTextArea();
	   
	  public fenetre(){
	    this.setLocationRelativeTo(null);
	    this.setTitle("Gérer vos conteneur");
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setSize(200, 200);
	      
	    JButton bouton =  new JButton("Bouton");
	    bouton.addActionListener(new ActionListener(){
	      public void actionPerformed(ActionEvent e){
	        System.out.println("Texte écrit dans le JTextArea : ");
	        System.out.println("--------------------------------");
	        System.out.println(textPane.getText());            
	      }
	    });
	    this.getContentPane().add(textPane, BorderLayout.CENTER);
	    this.getContentPane().add(bouton, BorderLayout.SOUTH);
	    this.setVisible(true);
	  }
}

/*public class fenetre extends JFrame {
  private JSplitPane split;

  public fenetre(){
    this.setLocationRelativeTo(null);
    this.setTitle("Gérer vos conteneur");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(200, 200);

    JPanel pan = new JPanel();
    pan.setBackground(Color.blue);
      
    JPanel pan2 = new JPanel();
    pan2.setBackground(Color.red);
    split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, pan, pan2);
    this.getContentPane().add(split, BorderLayout.CENTER);
    this.setVisible(true);
  }
  
}*/
/*
public class fenetre extends JFrame {
	  private JPanel container = new JPanel();
	  private JFormattedTextField jtf = new JFormattedTextField(NumberFormat.getIntegerInstance());
	  private JFormattedTextField jtf2 = new JFormattedTextField(NumberFormat.getPercentInstance());
	  private JLabel label = new JLabel("Un JTextField");
	  private JButton b = new JButton ("OK");

	  public fenetre(){
	    this.setTitle("Animation");
	    this.setSize(300, 300);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    container.setBackground(Color.white);
	    container.setLayout(new BorderLayout());
	    JPanel top = new JPanel();        
	    Font police = new Font("Arial", Font.BOLD, 14);
	    jtf.setFont(police);
	    jtf.setPreferredSize(new Dimension(150, 30));
	    jtf.setForeground(Color.BLUE);
	    jtf2.setPreferredSize(new Dimension(150, 30));
	    b.addActionListener(new BoutonListener());
	    top.add(label);
	    top.add(jtf);
	    top.add(jtf2);
	    top.add(b);
	    this.setContentPane(top);
	    this.setVisible(true);            
	  }       

	  class BoutonListener implements ActionListener{
	    public void actionPerformed(ActionEvent e) {
	      System.out.println("TEXT : jtf " + jtf.getText());
	      System.out.println("TEXT : jtf2 " + jtf2.getText());
	    }
	  }
	}*/
 
/*public class fenetre extends JFrame {
  private JPanel container = new JPanel();
  private JCheckBox check1 = new JCheckBox("Case 1");
  private JCheckBox check2 = new JCheckBox("Case 2");
      
  public fenetre(){
    this.setTitle("Animation");
    this.setSize(300, 300);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    container.setBackground(Color.white);
    container.setLayout(new BorderLayout());
    JPanel top = new JPanel();
    check1.addActionListener(new StateListener());
    check2.addActionListener(new StateListener());
    top.add(check1);
    top.add(check2);
    container.add(top, BorderLayout.NORTH);
    this.setContentPane(container);
    this.setVisible(true);        
  }     
      
  class StateListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
      System.out.println("source : " + ((JCheckBox)e.getSource()).getText() + " - état : " + ((JCheckBox)e.getSource()).isSelected());
    }
  }
}*/
/*import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class fenetre extends JFrame {
  private JPanel container = new JPanel();
  private JComboBox combo = new JComboBox();
  private JLabel label = new JLabel("Une ComboBox");

  public fenetre(){
    this.setTitle("Animation");
    this.setSize(300, 300);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    container.setBackground(Color.white);
    container.setLayout(new BorderLayout());
    combo.setPreferredSize(new Dimension(100, 20));

    JPanel top = new JPanel();
    top.add(label);
    top.add(combo);
    container.add(top, BorderLayout.NORTH);
    this.setContentPane(container);
    this.setVisible(true);     
    combo.setPreferredSize(new Dimension(100, 20));
    combo.addItem("Option 1");
    combo.addItem("Option 2");
    combo.addItem("Option 3");
    combo.addItem("Option 4");
    
  }
}
*/
/*import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
 
public class fenetre extends JFrame{
  private Panneau pan = new Panneau();
  private JButton bouton = new JButton("Mon bouton");
  public fenetre(){        
    this.setTitle("Animation");
    this.setSize(300, 300);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pan.add(bouton);
    this.setContentPane(pan);
    this.setVisible(true);
    this.setLocationRelativeTo(null);
    this.setContentPane(pan);
    this.setVisible(true);
    go();
  }

  private void go(){
    for(int i = -50; i < pan.getWidth(); i++){
      int x = pan.getPosX(), y = pan.getPosY();
      x++;
      y++;
      pan.setPosX(x);
      pan.setPosY(y);
      pan.repaint();  
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }       
}*/
/*import javax.swing.JFrame;

 
public class fenetre extends JFrame {
  public fenetre(){                
    this.setTitle("Ma première fenêtre Java");
    this.setSize(100, 150);
    this.setLocationRelativeTo(null);               
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(new Panneau());

    this.setVisible(true);
  }     
}*/