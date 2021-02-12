package com.codewars.kyu7;

/**
 * @author Zurbaevi Nika
 */
public class FIXMERunRunner {
    private static class Logan5 implements Runnable {
        public void run() {
            System.out.println("Hello from Logan5");
//            ThreadUtil.method1(); uncomment
        }
    }

    private static class Jessica6 implements Runnable {
        public void run() {
            System.out.println("Hello from Jessica6");
//            ThreadUtil.method2(); uncomment
        }
    }

    public static void runRunners() {
        new Thread(new Logan5()).start();
        new Thread(new Jessica6()).start();
    }
}
