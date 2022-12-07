package SE;

import java.util.HashSet;
import java.util.Set;

public class uebung8_3 {
	public static void main(String[] args) {
		Set<Küchengerät> Küche = new HashSet<>();
		BeheizbareGeräte Toaster = new BeheizbareGeräte();
		BeheizbareGeräte Ofen = new BeheizbareGeräte();
		BeheizbareGeräte Kaffeemaschine = new BeheizbareGeräte();
		MitMotor Handrührer = new MitMotor();
		MitMotor Spülmaschine = new MitMotor();
		
		Küche.add(Toaster);
		Küche.add(Ofen);
		Küche.add(Kaffeemaschine);
		Küche.add(Handrührer);
		Küche.add(Spülmaschine);
		
		for(Küchengerät k : Küche) {
			k.einschalten();
		}
		
		for(Küchengerät k : Küche) {
			k.ausschalten();
		}
	}
}

interface Küchengerät{
	public void einschalten();
	public void ausschalten();
	
}

abstract class Signalleuchte{
	boolean onoff = false;
}

class BeheizbareGeräte extends Signalleuchte implements Küchengerät {
	
	public void einschalten() {
		System.out.println("wird aufgeheizt");
		onoff = true;
	}

	
	public void ausschalten() {
		System.out.println("kühlt runter");
		onoff = false;
	}
	
}

class MitMotor extends Signalleuchte implements Küchengerät{

	public void einschalten() {
		System.out.println("Motor startet");
		onoff = true;
	}

	
	public void ausschalten() {
		System.out.println("Motor stoppt");
		onoff = false;	
	}
	
}
