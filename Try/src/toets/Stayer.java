package toets;

public class Stayer extends SpeedSkater implements Skater{
	public static final int rounds = 5;
	public static final int starts = 10;
	public List<String> ijshal = new List<String>();
	

	
	@Override
	public int getEndurance() {
		return duurvermogen;
	}
	@Override
	public int getExplosiviteit() {
		return explosiviteit;
	}
	@Override
	//@ requires number > 0;
	//@ ensures \old.getEndurance() =< (\new.getEndurance() - (number/rounds));
	public void rounds(int number) {
		duurvermogen = duurvermogen + (number/rounds);
	}
	@Override
	//@ requires number > 0;
	//@ ensures old.explosiviteit =< new.explosiviteit;
	
	public void starts(int number) {
		duurvermogen = duurvermogen - (number/starts);
		explosiviteit = explosiviteit + (number/starts);		
	}
}
	
	


