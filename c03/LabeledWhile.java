//: LabeledWhile.java
// Java's "labeled while" loop

package c03;

public class LabeledWhile {
    public static void main(String[] args) {
        int i = 0;
        outer: // Can't have statements here
        while(true) { // infinite loop
            prt("Outer while loop");
            // Can't have statements here
            while(true) {
                i++;
                prt("i = " + i);
                if (i == 1) {
                    prt("continue");
                    continue;
                }
                if (i == 3) {
                    prt("continue outer");
                    continue outer;
                }
                if (i == 5) {
                    prt("break");
                    break;
                }
                if (i == 7) {
                    prt("break outer");
                    break outer;
                }
            }
        }
        // Can't break or continue
        // to labels here
    }
    static void prt(String s) {
        System.out.println(s);
    }
} ///:~