package cn.frank.arch.adapter;

public class AdapterImpl implements Adapter {
	
	private Adaptee adaptee;
	
	public AdapterImpl(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void target() {
		System.out.println("In AdapterImpl::target()");
		adaptee.operation();
	}

}
