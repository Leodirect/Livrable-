package fr.leodirect.programme;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Timer;
import java.util.TimerTask;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		Ville ville =new Ville ("Estreux", 1000, "France");
		
		
		
		Calculatrice calculette = new Calculatrice();
		System.out.println("Hello World !");
		int a = 18 ;
		String nom = "Léo";
		
		double i = 1.23;
		int k = (int)i;
		
		
		
			
		System.out.println(nom + " "+ a);
		a++;
		System.out.println(nom +" "+a);

		
		if(a>18) {
			System.out.println("Majeur");
		}else {
			System.out.println("Mineur");
		}
		
		String[]names = {"léo", "Matthieu","Boostien","Ethan"};
		System.out.println(names[0]);
		
		if(nom.equalsIgnoreCase(names[0])) {
			System.out.println("=");
		}else 
			System.out.println("!");
		
		int [][] numbers = {
				{
				9, 11, 93
				},
				{
				39, 39
				}
		};
		System.out.println(numbers[1][1]);
		
		
		String pseudoss = "Léo,Matthieu,Boostien,Ethan";
		String [] pseudos = pseudoss.split(",");
		System.out.println(pseudos.length);/*
		for (int i = 1; i<= 10; i++) {
			System.out.println("nombre de tour : " + i);
		}
		for (String str : pseudos) {
			System.out.println(str);
		}
		int y = 10;
		do {
			System.out.println("Non /"+y);
			y =y-1;
		}while (y != 0);
		
		sendMessage("Bonjour");
		
		Player player1 = new Player("Test", 20.0, 300.0);
		System.out.println("vie : " + player1.getHealth());
		System.out.println("Nom : " + player1.getName());
		System.out.println("Attack : " + player1.getAttack());
		player1.damage(player1.getAttack());
		System.out.println("vie : "+player1.getHealth());
		
		Apple a = new Apple();
		a.taste();
		a.mian();
		
		PineApple pen = new PineApple();
		pen.taste();
		pen.mian();
		
		if(a instanceof PeelFruit) {
			System.out.println("ce fruit implemente l'interface PeelFruit");
		}
		
		for (Day moment : Day.values()) {
			System.out.println(moment.name().toLowerCase()+" " + moment.getHour()+" " +moment.getMessage());

		}
		ArrayList <Integer> list  = new ArrayList<Integer>();
		list.add(25);
		list.add(35);
		list.add(50);
		
		System.out.println(list);
		System.out.println(list.get(0));
		list.remove(0);
		System.out.println(list);
		if(list.contains(35)) {
			System.out.println("EKIP");
		}
		
		Map<String,Integer> ages = new HashMap<>();
		ages.put("Léodirect", 19);
		ages.put("Ethan", 13);
		System.out.println(ages.toString());
		System.out.println(ages.get("Léodirect"));
		ages.remove("Ethan");
		System.out.println(ages.toString());
		if(ages.containsKey("Léodirect")) {
			System.out.println("Salut mon pote");
		}
		if(ages.containsValue(19)) {
			System.out.println("Il y a bien 19");
		}
		for (Entry<String, Integer> element : ages.entrySet()) {
			System.out.println("La clé est " + element.getKey() + " et la valeur " + element.getValue());
		}
		ages.clear();
		System.out.println(ages.toString());*/
		
		int[] numero = { 4,7,9,1};
		int calcul = 5+1;
		try { 
			System.out.println(numero[4]);
			calcul /=0;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("L'erreur est ici");
		}finally {
			System.out.println("Finalement ");
		}
		double balance = 5000;
		double price = 20.3;
		try {
			buy(balance,price);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		/*Stream<Personne> sp = listP.stream();
		sp.forEach(System.out::println);

		System.out.println("\nAprès le filtre");
		sp = listP.stream();
		sp.	filter(x -> x.getPoids() > 50)
			.forEach(System.out::println);*/
		
	 /*
		Timer chrono = new Timer();
		chrono.schedule(new CustomTimer(), 1000, 1000);
		
		File folder = new File ("C://Users//Léo OLIVIER//Desktop/doss/");
		File file = new File("C://Users//Léo OLIVIER//Desktop/index.html");
		if(!folder.exists()) {
			folder.mkdir();
		}
		if(!file.exists()) 
		{
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			java.util.List<String> htmlLines = Arrays.asList("<html>","<head>","<title>Mon titre</title>","<body>","<p>Salut les gens</p>","</body>","</head>","</html>");
			try {
				FileWriter writer = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(writer);
				BufferedReader reader = new BufferedReader (new InputStreamReader(new FileInputStream(file),"UTF-8"));
				for(String line : htmlLines)
				{
					bw.write(line);
					bw.newLine();
				}
				bw.close();
				writer.close();
				String line = reader.readLine();
				while(line != null)
				{
					System.out.println(line);
					line = reader.readLine();

				}
				reader.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		File source = new File("C://Users//Léo OLIVIER//Desktop/index.html");
		File dest = new File ("C://Users//Léo OLIVIER//Desktop/doss/"+source.getName());
		try {
			Files.copy(source.toPath(), dest.toPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		substract(10,12, new CalculListener() {

			@Override
			public void onPositiveResult() {
				System.out.println("C'est COol");
				
			}

			@Override
			public void onNegativeResult() {
				System.out.println("C'est pas cool");
				
			}
			
		});
	}

	private static void substract(int a, int b, CalculListener listener) {
		int result = a-b;
		System.out.println("Mon result est de : "+result);
		if(result>0)
		{
			System.out.println("resultat +");
			listener.onPositiveResult();
			
		}else {
			System.out.println("resultat - ");
			listener.onNegativeResult();
		}
		
		TestThread t = new TestThread("A");
	    TestThread t2 = new TestThread("  B", t);
	    try {
	      Thread.sleep(1000);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	    System.out.println("statut du thread " + t.getName() + " = " + t.getState());
	    System.out.println("statut du thread " + t2.getName() + " = " +t2.getState());               
	    CompteEnBanque cb = new CompteEnBanque();
	    CompteEnBanque cb2 = new CompteEnBanque();

	    Thread tt = new Thread(new RunImpl(cb, "Cysboy"));
	    Thread tt2 = new Thread(new RunImpl(cb2, "Zéro"));
	    t.start();
	    t2.start();
	 
	
		
	}

	private static void buy(double balance, double price) throws NoMoneyException {
		double b = balance - price;
		if (b<0)
		{
			throw new NoMoneyException();
		}
		System.out.println(b);
	}
	
	
	private static void sendMessage(String message) {
		System.out.println("CC la console Function " + message);
	}
	
	

}
