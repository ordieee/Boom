package toets;
import java.util.*;

public class Aanbod implements Woning {
	private Set<Woning> aanbod= new HashSet<Woning>();
	private int aantal;
	private int rooms;
	private int floors;
	
		/*@ pure */ public Set<Woning> getAanbod() {
		return aanbod;
}
		/** Retourneert een map die gegeven een aantal kamers k,
		* alle huizen oplevert met k kamers. */
		public Map<Integer,Set<Woning>> groepeerOpAantalKamers() {
		HashMap<Integer,Set<Woning>> resultaat = new HashMap<Integer,Set<Woning>>();
		for(Woning woning : aanbod) {
			int kamers = woning.getFloors();
			if(resultaat.containsKey(kamers)) {
				resultaat.get(kamers).add(woning);
			} else {
				Set<Woning> woningSet = new HashSet<Woning>();
				woningSet.add(woning);
				resultaat.put(kamers, woningSet);
			}
		}
		return resultaat;
 }
		
		public List<Woning> laagstePrijs(int n) {
			// Resultaatlijst waar alle woningen gesorteerd op prijs in komen
		List<Woning> result = new ArrayList<Woning>();
			for(Woning originalWoning : aanbod){
				// Zodra de prijs van een woning kleiner is dan een prijs van een
				// reeds gesorteerde woning, zetten we hem op die plek.
				boolean found = false;
					// ipv break kan ook een extra boolean gebruikt worden
			for (int i = 0 ; i < result.size() && !found; i++){
				if(originalWoning.getPrijs() < result.get(i).getPrijs()) {
					result.add(i,originalWoning);
					found = true;
				}
			}
			// Als de prijs van een woning niet kleiner was dan een woning
			// reeds gesorteerd, dan moet hij achteraan de lijst.
			if(!found){
				result.add(originalWoning);
			}
		}
	// haal de top uit de gesorteerde lijst.
	return result.size() <= n ? result : result.subList(0, n);				
}
		public void nieuweWoning(Woning w) {
		aanbod.add(w);
		aantal = aantal + 1;
		}
		
		
		@Override
		public int getPrijs() {
			// TODO Auto-generated method stub
			return 0;
		}
		@Override
		public int getRooms() {
			// TODO Auto-generated method stub
			return rooms;
		}
		@Override
		public int getFloors() {
			// TODO Auto-generated method stub
			return floors;
		}
}