import java.io.*;
import java.util.Scanner;

/**
 * Created by oneBite on 2018/3/26.
 */
public class IoTest {
    public static void main(String[] args) throws IOException{


        /*
        //使用File类做文件系统的操作
        System.out.println("hello world");
        File tmp = new File(".");
        System.out.println(tmp.getAbsolutePath()+tmp.getParent());
        String[] tmpList = tmp.list();
        for (String tmp1 : tmpList){
            System.out.println(tmp1);
        }
        */


        /*
        //基本操作
        FileInputStream read = new FileInputStream("2.txt");
        FileOutputStream out = new FileOutputStream("3.txt");
        byte[] buffer = new byte[10];
        int count = 0;
        while ((count = read.read(buffer))>=0)
        {
            System.out.println(buffer);
            out.write(buffer,0,count);
        }
        read.close();
        out.close();
        */

        /*
        //体会装饰器设计模式，处理流
        FileWriter tmp = new FileWriter("4.txt");
        PrintWriter tmp2 = new PrintWriter(tmp);
        tmp2.println("helloworld");
        tmp2.close();
        */

        //获取用户输入
        Scanner tmp = new Scanner(System.in);
        String i1 = tmp.next();
        System.out.println(i1);
        tmp.close();

    }
}
