package BDD;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;


public class main{

	public static void main(String[] args)  {
		
		 EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                // Votre fonction Run
	                // Vos information de connexion à une base de données
	               String url = "jdbc:mysql://localhost//world";
	                String user = "root";
	                String passwd = "";
	                // L'essaie de connexion à votre base de donées
	                try {
	                    Class.forName("com.mysql.jdbc.Driver");
	                    Connection conn = DriverManager.getConnection(url, user, passwd);
	                    System.out.println("Connecter");
	                } catch (Exception e){
	                    e.printStackTrace();
	                    System.out.println("Erreur");
	                    System.exit(0);
	                }
	            }
	        });

	}

}
