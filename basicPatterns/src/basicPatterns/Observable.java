package basicPatterns;

public abstract class Observable {

	private Observer obs1;

	public Observer getObs1() {
		return obs1;
	}

	public void setObs1(Observer obs1) {
		this.obs1 = obs1;
	}
	
	public void notifying()
	{
		obs1.update();
	}
}

