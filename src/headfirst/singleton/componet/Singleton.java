package headfirst.singleton.componet;

//利用java的枚举类实现单例模式，enum修饰默认保留一个实例
public enum Singleton {
	// 唯一枚举
	INSTANCE;

	private String name = "world";

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
