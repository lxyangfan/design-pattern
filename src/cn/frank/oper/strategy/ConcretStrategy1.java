package cn.frank.oper.strategy;

public class ConcretStrategy1 implements Strategy{

	@Override
	public void execute() {
		System.out.println("ConcretStrategy1::execute()");
	}

}
