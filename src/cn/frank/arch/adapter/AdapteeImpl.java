package cn.frank.arch.adapter;

public class AdapteeImpl  implements Adaptee{

	@Override
	public void operation() {
		System.out.println("AdapteeImpl::operation() ");
	}

}
