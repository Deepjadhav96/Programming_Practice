import java.util.*;

class ArrayListDemo
{
    public static void main(String A[])
    {
        ArrayList <Integer> aobj = new ArrayList<Integer>();

        aobj.add(10);
        aobj.add(20);
        aobj.add(30);
        aobj.add(40);

        System.out.println(aobj);

        ArrayList <Float> aobj2 = new ArrayList<Float>();
        aobj2.add(85.34f);
        aobj2.add(67.45f);
        aobj2.add(98.4f);
        aobj2.add(123.91f);

        System.out.println(aobj2);

        ArrayList <String>aobj3 = new ArrayList<String>();
        aobj3.add("Python");
        aobj3.add(" Javascript ");
        aobj3.add("Golang");

        System.out.println(aobj3);
    }
}