package headfirst.singleton.componet;

public class ChocolateBoiler {
	// 私有属性
	private boolean empty;
	private boolean boiled;

	// 静态字段，只有静态方法可以访问，类独享的内存空间
	private static ChocolateBoiler singleBoiler;

	// 私有的构造方法
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}

	// 内部访问构造方法，创建出单独的一个实例对象
	public static ChocolateBoiler getInstance() {
		if (singleBoiler == null) {
			singleBoiler = new ChocolateBoiler();
		}
		return singleBoiler;
	}
	
	//其他正常方法
	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
		}
	}

	public Boolean isEmpty() {
		return empty;
	}
}
