package fr.leodirect.Interface;

import javax.swing.JInternalFrame;

class MiniFenetre extends JInternalFrame{
		    public MiniFenetre(int nbre){
		      this.setTitle("Fenetre N°"+nbre);
		      this.setClosable(true);
		      this.setResizable(true);
		      this.setSize(150, 80);
		      int xy = 10;
			this.setLocation(xy, xy);
		      this.setVisible(true);
		    }      
		  }
