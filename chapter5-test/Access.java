//: Access.java

public class Access {
	public String pub;
	protected static String prot;
	private static String pri;
	String friend;
	
	public Access(String pub) {
		this.pub = pub;
	}
	
	private Access() {
	}
	
	protected Access(String pub, String friend) {
		this.pub = pub;
		this.friend = friend;
		System.out.println("pub = " + pub + ", " + "friend = " + friend);
	}
	
	void friendlyFunc() {
		System.out.println("friendly!");
	}
}