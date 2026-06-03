import java.util.*;

class ArrayListDemoX
{
    public static void main(String A[])
    {
        ArrayList <Character> aobjx = new ArrayList<Character>();

        aobjx.add('D');
        aobjx.add('E');
        aobjx.add('E');
        aobjx.add('P');

        System.out.println(aobjx);

        Iterator iobj = iobj = aobjx.iterator();


        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }


    }
}