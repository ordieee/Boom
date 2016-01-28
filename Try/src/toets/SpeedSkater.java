package toets;

public abstract class SpeedSkater implements Skater {
	int duurvermogen;
	int explosiviteit;
	
	public SpeedSkater() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void updateEndurance(int extra) {
		duurvermogen = duurvermogen + extra;
	}

	@Override
	public void updateExplosiviteit(int extra) {
		explosiviteit = explosiviteit + extra; 
	}

	public int getEnduracne(int extra) {
		return duurvermogen;
	}
	
	public int getExplosiviteit(int extra) {
		return explosiviteit;
	}

	abstract public void rounds(int number);

	abstract public void starts(int number);
}
	
