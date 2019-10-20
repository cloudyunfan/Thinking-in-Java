//: AccessTest.java
// (1) 用 public、 private、 protected 以及“友好的”数据成员及方法成员创建一个类。创建属于这个类的一
// 个对象，并观察在试图访问所有类成员时会获得哪种类型的编译器错误提示。 注意同一个目录内的类属于
// “默认”包的一部分。
public class AccessTest {
	public static void main(String[] args) {
		//! Access a1 = new Access(); // 对于Access(没有参数), 找不到合适的构造器
		Access a2 = new Access("pub");
		Access a3 = new Access("pub", "friend");
		a2.friendlyFunc();
	}
}