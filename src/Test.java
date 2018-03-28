/**
 * Created by oneBite on 2018/3/19.
 */
class MyThread extends Thread
{
    int i1 = 0;
    public void run()
    {
        for (;i1<10;i1++)
        {
            System.out.println(this.getName()+i1);
        }
    }
}


class MyRun implements Runnable
{
    int i1 = 0;
    public void run()
    {
        for (;i1<10;i1++)
        {
            System.out.println(Thread.currentThread().getName()+i1);
        }
    }
}


public class Test {
    public void testForThread()
    {
        //main函数定义主线程
        System.out.println(Thread.currentThread().getName());
        MyThread tmp = new MyThread();
        tmp.start();
        //tmp.start(); //线程不能在死亡状态启动  IllegalThreadStateException
        int i1 = 0;
        for (;i1<10;i1++)
        {
            System.out.println(Thread.currentThread().getName()+i1);
        }

        MyThread tmp2 = new MyThread();
        tmp2.start();
    }

    public void testForRunnable()
    {
        MyRun tmp = new MyRun();
        new Thread(tmp).start();
        new Thread(tmp).start();
    }

    public static void main(String[] args)
    {
        Test tmpT = new Test();
        //tmpT.testForThread();
        tmpT.testForRunnable();
    }
}