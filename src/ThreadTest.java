public class ThreadTest {
    public static void main(String[] args) {
        new Thread(new Person()).start();
        new Thread(new Person()).start();
        new Thread(new Person()).start();
    }
}

class Person implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            if (i %2 == 0) {
                System.out.println(Thread.currentThread().getName() +":"+ i);
            }
        }
    }
}
