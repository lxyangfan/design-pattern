package cn.frank.arch.adapter;

public class Client {
	
	public static Adapter adapter;
	
	public static void main(String[] args) {
		exec();
	}
	
	private static void exec() {

		adapter = new AdapterImpl(new AdapteeImpl());
		adapter.target();
	}

}
