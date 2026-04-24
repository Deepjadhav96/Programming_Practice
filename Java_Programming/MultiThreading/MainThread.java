class MainThread
{
    public static void main(String A[])
    {
        System.out.println("Inside the main thread...");

        Thread tobj = Thread.currentThread();

        // String name = tobj.getName();

        // System.out.println("Name of Thread: "+name);

        String name = tobj.setName("Deep");

        System.out.println("Name of Thread: "+name);



    }
}