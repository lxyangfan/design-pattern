package cn.frank.arch.bridge;

/**
 * 桥接模式(Bridge Pattern)：将抽象部分与它的实现部分分离，使它们都可以独立地变化。
 * 它是一种对象结构型模式，又称为柄体(Handle and Body)模式或接口(Interface)模式。
 * @author fan.yang
 *
 */
public class Client {
	public static void main(String[] args) {
		Shape rect = new Rectangle();
		rect.setColor(new PaintGreen());
		rect.disp();
		rect.setColor(new PaintYellow());
		rect.disp();
	}

}
