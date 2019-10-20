//: Foreign.java
package c05.foreign;
import c05.*;

// 解释编译器为什么会产生一个错误。将Foreign（外部）类作为c05包的一部分改变了什么东西吗？
// 改变了Foreign类的位置，Foreign和PackagedClass不再是同一个包
public class Foreign {
	public static void main(String[] args) {
		PackagedClass pc = new PackagedClass(); // PackagedClass在c05中不是公共的；无法从外部程序包中对其进行访问
	}
} ///:~
