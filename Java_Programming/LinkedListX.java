import java.util.*;

class LinkedListX
{
    public static void main(String A[])
    {
        LinkedList<Character> lobj = new LinkedList <Character> ();

        lobj.add('D');
        lobj.add('E');
        lobj.add('E');
        lobj.add('P');


        Iterator <Character>iobj = lobj.iterator();

        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }

    }
}