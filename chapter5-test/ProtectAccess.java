//: ProtectAccess.java
// (2) �� protected ���ݴ���һ���ࡣ����ͬ���ļ��ﴴ���ڶ����࣬��һ���������ݵ�һ�������protected ���ݡ�

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