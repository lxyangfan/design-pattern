package cn.frank.arch.bridge;

public class Rectangle extends Shape{

	@Override
	public void disp() {
		this.getColor().paint();
		System.out.println("This is Rectangular");
	}

}
