package SE;

import java.util.HashSet;
import java.util.Set;

public class uebung8_3 {
	public static void main(String[] args) {
		Set<K�chenger�t> K�che = new HashSet<>();
		BeheizbareGer�te Toaster = new BeheizbareGer�te();
		BeheizbareGer�te Ofen = new BeheizbareGer�te();
		BeheizbareGer�te Kaffeemaschine = new BeheizbareGer�te();
		MitMotor Handr�hrer = new MitMotor();
		MitMotor Sp�lmaschine = new MitMotor();
		
		K�che.add(Toaster);
		K�che.add(Ofen);
		K�che.add(Kaffeemaschine);
		K�che.add(Handr�hrer);
		K�che.add(Sp�lmaschine);
		
		for(K�chenger�t k : K�che) {
			k.einschalten();
		}
		
		for(K�chenger�t k : K�che) {
			k.ausschalten();
		}
	}
}

interface K�chenger�t{
	public void einschalten();
	public void ausschalten();
	
}

abstract class Signalleuchte{
	boolean onoff = false;
}

class BeheizbareGer�te extends Signalleuchte implements K�chenger�t {
	
	public void einschalten() {
		System.out.println("wird aufgeheizt");
		onoff = true;
	}

	
	public void ausschalten() {
		System.out.println("k�hlt runter");
		onoff = false;
	}
	
}

class MitMotor extends Signalleuchte implements K�chenger�t{

	public void einschalten() {
		System.out.println("Motor startet");
		onoff = true;
	}

	
	public void ausschalten() {
		System.out.println("Motor stoppt");
		onoff = false;	
	}
	
}
