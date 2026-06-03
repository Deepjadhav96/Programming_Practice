class ArrayDemoMulti
{
    public static void main(String A[])
    {
        System.out.println("Inside java main");

        int Arr[][] = new int[3][4];

         Arr[0][0] = 10;
         Arr[0][3] = 30;

         Arr[2][0] = 40;
         Arr[2][1] = 60;
         Arr[2][2] = 90;

        System.out.println(Arr.length); //3

        System.out.println(Arr[0].length);//4
        System.out.println(Arr[1].length);//4
        System.out.println(Arr[2].length);//4



    }
}