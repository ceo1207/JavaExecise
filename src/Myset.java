import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by oneBite on 2018/3/21.
 */
class R
{
    int a = 1;
    R(int c)
    {
        this.a = c;
    }
}
public class Myset {

    public static void main(String[] args){

        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        a.add(new Integer(1));
        a.add(new Integer(2));
        System.out.println(a.get(0));
        //a.get(0) = 10;

        System.out.println(a.get(0));
        b.add(a.get(0));
        //不能修改、只能替换，也就没有联动的问题了。

        /*
        HashSet<R> c = new HashSet<R>();
        c.add(new R(1));
        c.add(new R(2));
        Iterator<R> d = c.iterator();
        R e = d.next();
        e.a = 4;
        Iterator<R> f = c.iterator();
        for (;f.hasNext();) {
            e = f.next();
            System.out.println(e.a);
        }
        */
    }
}
