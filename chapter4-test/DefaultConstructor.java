//: Test

class A {
	// 用默认构建器创建一个类（没有自变量），用它打印一条消息。
	// 创建属于这个类的一个对象。
	public A() {
		System.out.println("Default constructor!");
	}
	
	//在练习 1 的基础上增加一个过载的构建器，令其采用一个 String 自变量，并随同自己的消息打印出来。
	public A(String s) {
		System.out.println("Constructor with variable : " + s + "!");
	}
}

public class DefaultConstructor {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A("world");
		// 以练习 2 创建的类为基础上，创建属于它的对象句柄的一个数组，但不要实际创建对象并分配到数组里。
		// 运行程序时，注意是否打印出来自构建器调用的初始化消息。
		A[] array = new A[] {new A("1"), new A("2"), new A("3")};
	}
}///:~