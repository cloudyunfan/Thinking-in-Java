//: AccessTest.java
// (1) �� public�� private�� protected �Լ����Ѻõġ����ݳ�Ա��������Ա����һ���ࡣ��������������һ
// �����󣬲��۲�����ͼ�����������Աʱ�����������͵ı�����������ʾ�� ע��ͬһ��Ŀ¼�ڵ�������
// ��Ĭ�ϡ�����һ���֡�
public class AccessTest {
	public static void main(String[] args) {
		//! Access a1 = new Access(); // ����Access(û�в���), �Ҳ������ʵĹ�����
		Access a2 = new Access("pub");
		Access a3 = new Access("pub", "friend");
		a2.friendlyFunc();
	}
}