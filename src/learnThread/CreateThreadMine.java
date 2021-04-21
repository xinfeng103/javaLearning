package learnThread;

public class CreateThreadMine {
    private static final String TEXT = "太阳在这个平静的小村庄缓缓升起，又是开始了平常的一天。我们故事的主人公睡眼惺忪的起来\n" +
            "......";

    public static void main(String[] args) {
        // TODO 代码是被线程执行的，任何代码都可以通过Thread.currentThread()获取执行当前代码的线程
        System.out.println("程序开始，执行的线程名字叫做" + Thread.currentThread().getName());

        for (int i=1; i<=2;i++){
            Thread thread = new Thread(new PrintStoryRunnable(TEXT,200*i),"我的线程-"+i);
            thread.start();
        }
    }

    static class PrintStoryRunnable implements Runnable {
        private String text;
        private long interval;

        public PrintStoryRunnable(String text, long interval) {
            this.text = text;
            this.interval = interval;
        }

        @Override
        public void run() {
            try{
                double num = Math.random();
                System.out.println("执行这段代码的线程名字叫做" +Thread.currentThread().getName());
                printSlowly(text,interval);
                System.out.println(Thread.currentThread().getName() + "执行结束");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printSlowly(String text, long interval) throws InterruptedException {
        for (char ch : text.toCharArray()) {
            Thread.sleep(interval);
            System.out.print(ch);
        }
        System.out.println();
    }
}
