//: PrintInt.java

public class PrintInt {
	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			System.out.print(i);
			System.out.print(' ');
			if(i == 47) {
				break;
			}
		}
	}
} ///:~