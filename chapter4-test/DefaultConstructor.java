//: Test

class A {
	// ��Ĭ�Ϲ���������һ���ࣨû���Ա�������������ӡһ����Ϣ��
	// ��������������һ������
	public A() {
		System.out.println("Default constructor!");
	}
	
	//����ϰ 1 �Ļ���������һ�����صĹ��������������һ�� String �Ա���������ͬ�Լ�����Ϣ��ӡ������
	public A(String s) {
		System.out.println("Constructor with variable : " + s + "!");
	}
}

public class DefaultConstructor {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A("world");
		// ����ϰ 2 ��������Ϊ�����ϣ������������Ķ�������һ�����飬����Ҫʵ�ʴ������󲢷��䵽�����
		// ���г���ʱ��ע���Ƿ��ӡ�����Թ��������õĳ�ʼ����Ϣ��
		A[] array = new A[] {new A("1"), new A("2"), new A("3")};
	}
}///:~