//: DefaultConstructor.java
package c04;

class Bird {
	int i;
}

class Bush {
	Bush(int i) {}
	Bush(double d) {}
}

public class DefaultConstructor {
	public static void main(String[] args) {
		Bird nc = new Bird(); // default!
		//Bush b = new Bush(); // error!
	}
} ///:~