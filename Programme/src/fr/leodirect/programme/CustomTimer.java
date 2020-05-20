package fr.leodirect.programme;

import java.util.Random;
import java.util.TimerTask;

public class CustomTimer extends TimerTask {

	int time = 5;
	

	@Override
	public void run() {
		System.out.println("Bonjour "+ time );
		if(time == 0) {
			Random r = new Random();
			int alea = r.nextInt(6 - 1 )+ 1;
			System.out.println("de " +alea);
			cancel();
		}
		time--;
	}
}
