//ConcurrentModificationException in HashMap
package Java;

import java.util.*;

public class MyThread extends Thread {
    static ArrayList<String> list = new ArrayList<>();

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("Child thread updating list");
        list.add("D");
    }

    public static void main(String[] args) {
        list.add("A");
        list.add("B");
        list.add("C");
        MyThread thread = new MyThread();
        thread.start();
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String s1 = (String) itr.next();
            System.out.println("Main thread is iterating and concurrent object is " + s1);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
        System.out.println(list);

    }
}
