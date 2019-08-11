//: URShift.java
// Test of unsigned right shift
package c03;

public class URShift {
    public static void main(String[] args) {
        int i = -1;
        i >>>= 10;
        System.out.println(i);
        long l = -1;
        l >>>= 10;
        System.out.println(l);
        short s = -1;
        s >>>= 17;
        System.out.println(s);
        byte b = -1;
        b >>>= 25;
        System.out.println(b);
        System.out.println("55>>35:" + (55>>35));
        System.out.println("55>>3:" + (55>>3));
        System.out.println("66>>8:" + (66>>8));
        System.out.println("66>>40:" + (66>>40));
    }
} ///:~