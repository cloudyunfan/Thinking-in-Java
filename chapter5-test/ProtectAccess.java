//: ProtectAccess.java
// (2) 用 protected 数据创建一个类。在相同的文件里创建第二个类，用一个方法操纵第一个类里的protected 数据。

class ProtectClass {
	String msg;
	public ProtectClass(String msg) {
		this.msg = msg;
	}
	void foo() {
		System.out.println("Protect Access by " + msg);
	}
}

public class ProtectAccess {
	public static void main(String[] args) {
		ProtectClass p = new ProtectClass("Yunfan");
		p.foo();
	}
}
///:~