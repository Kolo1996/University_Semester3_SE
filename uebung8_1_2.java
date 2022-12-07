package SE;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class uebung8_1_2 {

}

class Mitarbeiter {
	 //private Abteilung abteilung;
	 
	 public void setAbteilung(Abteilung abt) {
		 HR.linkObj(this, abt);
	 }
	 
	 public Abteilung getAbteilung() {
		 return HR.getAbteilung(this);
	 }
	 
}

class Abteilung {
	 //private Set<Mitarbeiter> mitarbeiter;
	 
	 public void addMitarbeiter(Mitarbeiter m) {
		HR.linkObj(m, this);
		//mitarbeiter.add(m);
	 }
	 
	 public Set<Mitarbeiter> getMitarbeiter(){
		 return HR.getMitarbeiter(this);
	 }
	 
	 
}

abstract class HR {
	private static Map<Mitarbeiter, Abteilung> AssoMap = new TreeMap<>(); //any k,v Map
	
	public static void linkObj(Mitarbeiter m, Abteilung a) {
		 AssoMap.put(m, a);
	 }
	
	public static Set<Mitarbeiter> getMitarbeiter(Abteilung a){
		Set<Mitarbeiter> result  = new HashSet<>();
		for(Mitarbeiter m : AssoMap.keySet()) {
			if(AssoMap.get(m) == a) {
				result.add(m);
			}
		}
		return result;
	}
	
	public static Abteilung getAbteilung(Mitarbeiter m) {
		return AssoMap.get(m);
		}
}

