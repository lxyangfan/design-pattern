package cn.frank.arch.decorator;

public abstract class Decorator extends AbstractComponent {
	
	private AbstractComponent comp;
	
	public abstract void doOtherThings();	
	
	@Override
	public void operation() {
		comp.operation();
		System.out.println("In Decorator::operation()");
	}


	public AbstractComponent getComp() {
		return comp;
	}

	public void setComp(AbstractComponent comp) {
		this.comp = comp;
	}
	
	
	
}
