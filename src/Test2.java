/**
 * Created by oneBite on 2018/3/19.
 */
class MyThread2 extends Thread
{
    public void run(){
        //Thread.sleep(100);
        Thread.yield();
    }
}
public class Test2 {
    public static void main(String[] args) throws Exception
    {
        MyRun tmp = new MyRun();
        Thread myThread = new Thread(tmp);
        //myThread.setDaemon(true);
        myThread.setPriority(6);
        myThread.setPriority(Thread.MAX_PRIORITY);

        //Thread.currentThread().yield();    //调用yield 重新触发调度
        myThread.start();
        myThread.join();  //此时join所在线程需要等待mythread线程

    }
}
