package cn.frank.arch.bridge;

/**
 * 抽象父类
 * @author fan.yang
 *
 */
public abstract class Shape {
	
	private PaintColor color;
	
	public abstract void disp();

	public PaintColor getColor() {
		return color;
	}

	public void setColor(PaintColor color) {
		this.color = color;
	}
	
	

}
