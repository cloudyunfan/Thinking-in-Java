//: Switch.java

public class Switch {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			switch(i) {
		    case 1:
			    System.out.print("hello ");
				break;
			case 2:
			    System.out.print("hi ");
				break;
			case 3:
			    System.out.print("world");
				break;
			default:
			    System.out.print("!");
			}
		}
	}
}///:~