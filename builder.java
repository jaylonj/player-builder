package builder;

import java.util.Random;

public class builder {

public static void main(String[] args) {
	String pos = "";
	Random rand = new Random();	
	int p = rand.nextInt(5) + 1;
	String build = bldit(p, pos, rand);
	System.out.println(build);
	System.out.println(secretmsg());
}
public static String bldit (int p, String pos, Random rand) {
	String body = "";
	int hght;
	int wght;
	double wng;
	int pie = rand.nextInt(14) + 1;
	int phys = rand.nextInt(5) + 1;
		
	if(p == 1) {
		pos = "Point Guard";
		hght = rand.nextInt(14) + 67;
		wght = rand.nextInt(51) + 170;
		double[] w = {75.0,75.9, 76.8, 77.7, 78.6, 79.5, 80.4, 81.4, 82.3, 83.2, 84.0};
		wng = w[rand.nextInt(w.length)];
 	}
	
	else if(p == 2) {
		pos = "Shooting Guard";
		hght = rand.nextInt(10) + 72;
		wght = rand.nextInt(46) + 190;
		wng = rand.nextInt(11) + 81;
	}
	else if(p == 3) {
		pos = "Small Forward";
		hght = rand.nextInt(5) + 78;
		wght = rand.nextInt(86) + 180;
		double[] w = {78.0, 78.9, 79.8, 80.7, 81.6, 82.5, 83.4, 84.4, 85.3, 86.2, 87.0};
		wng = w[rand.nextInt(w.length)];
	}
	else if (p == 4) {
		pos = "Power Forward";
		hght = rand.nextInt(6) + 79;
		wght = rand.nextInt(91 + 190);
		wng = rand.nextInt(11) + 81;
	}
	
	else {
		pos = "Center";
		hght = rand.nextInt(7) + 81;
		wght = rand.nextInt(66) + 225;
		wng = rand.nextInt(11) + 87;
	}
	
	String[] s = {"Solid", "Compact", "Defined", "Built", "Burly", "Slight"};
		body = s[rand.nextInt(s.length)];
		
		return "Alright, Whiz. Here's your build, my boy. ENJOY! \n"
				+ pos + "\n Pie Chart: #" + pie + "\n Physicals: #" + phys 
				+ "\n Height: " + hght + " inches \n Weight: " + wght 
				+ " lbs \n Wingspan: " + wng + " inches" + "\n Body Type: " + body
				+ "\n\n\n";
}

























public static String secretmsg () {
	return "SUB TO MY BOY WHIZ, BRO!!! PAUSE THIS VIDEO, CLICK THE LIKE BUTTON AND SUBSCRIBE TODAY TO JOIN THE WHIZ KIDS!!!";
}	
}

