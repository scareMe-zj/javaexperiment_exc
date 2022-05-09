package test;

public class TwoThreadsDemo {
    public static void main(String[] args) {
        new SimpleThread("ThreadOne").start();
        new SimpleThread("ThreadTwo").start();
    }
}
