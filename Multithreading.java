package Day10;

class Demo1 extends Thread {
    public void run() {
        System.out.println("Addition has started");

        int a = 10;
        int b = 20;
        int c = a + b;

        System.out.println("Sum = " + c);

        System.out.println("Addition has completed");
    }
}

class Demo2 extends Thread {
    public void run() {
        System.out.println("Character printing started");

        for (char ch = 'A'; ch <= 'J'; ch++) {
            System.out.println(ch);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }

        System.out.println("Character printing completed");
    }
}

class Demo3 extends Thread {
    public void run() {
        System.out.println("Number printing started");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }

        System.out.println("Number printing completed");
    }
}

public class Multithreading {
    public static void main(String[] args) {

        Demo1 d1 = new Demo1();
        Demo2 d2 = new Demo2();
        Demo3 d3 = new Demo3();

        d1.start();
        d2.start();
        d3.start();
    }
}