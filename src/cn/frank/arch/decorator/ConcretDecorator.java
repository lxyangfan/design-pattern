package cn.frank.arch.decorator;

public class ConcretDecorator extends Decorator {

	@Override
	public void doOtherThings() {
		System.out.println("ConcretDecorator::doOtherThings()");
	}

	@Override
	public void operation() {
		super.operation();
		doOtherThings();
	}

}
