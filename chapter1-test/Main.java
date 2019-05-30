//:Main.java
import java.util.*;
/**
 * Test of Chapter 1 in Thinking in China
 * @author YunFan
 * @author cloudfan@mail.ustc.edu.cn
 * @version 1.0
 */
public class Main {
	/**
	 * @param args array of string arguments
	 */
	public static void main(String[] args) {
		// (1) 打印Hello World
		System.out.println("Hello world");
		// (2) 打印从命令行获取的三个自变量
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(i < 3) {
			System.out.println("Enter a character please:");
			String param = sc.next();
			System.out.println("第" + ++i + "个自变量：" + param);
		}
	}
}
///~