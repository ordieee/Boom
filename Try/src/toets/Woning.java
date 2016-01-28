package toets;

public interface Woning {
	
	//@ ensures /result >= 0;
	public int getPrijs();
	//@ ensures /result >= 1;
	public int getRooms();
	//@ ensures /result >= 1;
	public int getFloors();
	
}
