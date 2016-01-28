package toets;

public interface Skater {
	//@ invariant getEndurance > 0;
	//@ invariant getExplosiveit > 0;

	
	
	//@ requires getEndurance => 0;
	//@ requires extra < getEndurance;
	//@ ensures 
	void updateEndurance(int extra);
	
	int getEndurance();
	
	//@ requires extra => 0;
	//@ requires getExplosiveit => 0;
	void updateExplosiviteit(int extra);
	
	
	int getExplosiviteit();
}
