import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by oneBite on 2018/3/27.
 */
public class CollectionTest {
    public static void main(String[] args)
    {
        String str = "132";
        //System.out.println(str.length()+" "+str.charAt(0)+ (int)(str.indexOf(49))+" "+(int)str.indexOf(1) );
        int length = str.length();
        //for(char i:str)
        int count = 0;
        for(int i1 = 0;i1<length;i1++)
        {
            count+=((int)str.indexOf(i1)-48)*Math.pow(10,length-i1-1);
        }


        /*

        int i1 = (int)Math.pow(10,3);
        System.out.println(i1);


        HashSet<Integer> tmp2 = new HashSet<Integer>();
        tmp2.add(10);
        tmp2.add(2);
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        tmp.addAll(0,tmp2);
        for (Integer tmp3 : tmp)
        {System.out.println(tmp3);}
        //throw new IllegalArgumentException();
        */

    }
}
