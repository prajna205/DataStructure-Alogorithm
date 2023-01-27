//ConcurrentModificationException in ConcurrentHashMap
package Java;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MyThread1 extends Thread {
    static ConcurrentHashMap<Integer, String> m = new ConcurrentHashMap<>();

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("Child thread updating m");
        m.put(104, "D");
    }

    public static void main(String[] args) {
        m.put(101, "A");
        m.put(102, "B");
        m.put(103, "C");
        MyThread1 thread = new MyThread1();
        thread.start();
        Set<Integer> s1 = m.keySet();
        Iterator<Integer> itr = s1.iterator();
        while (itr.hasNext()) {
            Integer i1 = (Integer) itr.next();
            System.out.println("Main thread is iterating and concurrent entry is " + i1 + "..." + m.get(i1));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
        System.out.println(m);
    }
}
