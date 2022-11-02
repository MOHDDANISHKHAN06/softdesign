package basicPatterns;

public abstract class Decorator implements Graph {
	
	private Graph component;

	public Graph getComponent() {
		return component;
	}

	public void setComponent(Graph component) {
		this.component = component;
	}
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		if(component != null) component.operation();
	}

}
