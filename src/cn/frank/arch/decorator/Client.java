package cn.frank.arch.decorator;

public class Client {
	public static void main(String[] args) {
		
		AbstractComponent com = new ConcretComponent1();
		Decorator comp = new ConcretDecorator();
		comp.setComp(com);
		
		comp.operation();
	}
}
