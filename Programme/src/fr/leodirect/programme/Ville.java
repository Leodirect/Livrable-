package fr.leodirect.programme;

public class Ville {
	
		  String nomVille;
		  String nomPays;
		  int nbreHabitants;
		 
		
		  public Ville(String pNom, int pNbre, String pPays)
		  {
		    System.out.println("Cr�ation d'une ville avec des param�tres !");
		    nomVille = pNom;
		    nomPays = pPays;
		    nbreHabitants = pNbre;
		  }   
		  
		//*************   ACCESSEURS *************
		    
		  //Retourne le nom de la ville
		  public String getNom()  {  
		    return nomVille;
		  }

		  //Retourne le nom du pays
		  public String getNomPays()
		  {
		    return nomPays;
		  }

		  // Retourne le nombre d'habitants
		  public int getNombreHabitants()
		  {
		    return nbreHabitants;
		  } 
		 
		  //*************   MUTATEURS   *************

		  //D�finit le nom de la ville
		  public void setNom(String pNom)
		  {
		    nomVille = pNom;
		  }

		  //D�finit le nom du pays
		  public void setNomPays(String pPays)
		  {
		    nomPays = pPays;
		  }

		  //D�finit le nombre d'habitants
		  public void setNombreHabitants(int nbre)
		  {
		    nbreHabitants = nbre;
		  }
		  
		  public String comparer(Ville v1){
			    String str = new String();

			    if (v1.getNombreHabitants() > this.nbreHabitants)
			      str = v1.getNom()+" est une ville plus peupl�e que "+this.nomVille;
			     
			    else
			      str = this.nomVille+" est une ville plus peupl�e que "+v1.getNom();
			     
			    return str;
			  }
		
		}

