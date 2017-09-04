package cn.frank.oper.strategy;

public abstract class AbstractContext implements Context {

	private Strategy strategy;

	@Override
	public void operation() {
		strategy.execute();
	}

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

}
