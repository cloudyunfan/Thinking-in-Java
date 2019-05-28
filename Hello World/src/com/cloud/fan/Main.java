package com.cloud.fan;

//: Main.java
import java.math.BigDecimal;
import java.util.*;

/** The first Thinking in Java example program.
 * Lists system information on current machine.
 * @author Bruce Eckel
 * @author http://www.BruceEckel.com
 * @version 1.0
 *
 */
public class Main {

    /** Sole entry point to class & application
     * @param args args point to class & application
     * @return No return value
     * @exception exceptions No exceptions thrown
     */
    public static void main(String[] args) {
        // write your code here
        String s = new String("yunfan");
        char c = 'x';
        Character C = new Character(c);
        // Character C = new Character('x');
        int [] al;
        int bl[];
        int x = 12;
        /* only x available */
        {
            int q = 96;
            /* both x & q available */
        }
        /* only x avaliable */
        /* q "out of scope" */
        DataOnly d = new DataOnly();
        d.i = 47;
        d.f = 1.1f;
        d.b = false;
        int y = StaticTest.i;
        System.out.println(new Date());
        Properties p = System.getProperties();
        p.list(System.out);
        System.out.println("--- Memory Usage:");
        Runtime rt = Runtime.getRuntime();
        System.out.println("Total Memory = " + rt.totalMemory()
                + " Free Memory = " + rt.freeMemory());
        try {
            Thread.currentThread().sleep(5 * 1000);
        } catch(InterruptedException e) {
        }
    }
}

/**
 * @see String
 * @see String#concat
 * @version 0.0.1-SNAPSHOT
 * @author yunfan cloudfan@mail.ustc.edu.cn
 */
class DataOnly {
    int i;
    float f;
    boolean b;
}

class StaticTest {
    static int i = 47;
}
///:~