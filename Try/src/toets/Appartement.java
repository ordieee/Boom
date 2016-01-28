package toets;

public class Appartement implements Woning{
	public int prijs;
	public int rooms;
	public static final int FLOORS = 1;
	
	public Appartement(int p, int k) {
		prijs = p;
		rooms = k;
	}

	
	public int getPrijs() {
		// TODO Auto-generated method stub
		return prijs;
	}

	@Override
	public int getRooms() {
		// TODO Auto-generated method stub
		return rooms;
	}

	@Override
	public int getFloors() {
		return FLOORS;
	}

}
