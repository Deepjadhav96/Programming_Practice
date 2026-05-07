import java.io.*;
import java.net.*;

class ChatClient
{
    public static void main(String A[]) throws Exception
    {
        
        System.out.println("Client application is running...");

        Socket sobj = new Socket("localhost",2100); //localhost is IP address of local machine and 2100 port of server application.

        System.out.println("Connection is successful with server"); 

        PrintStream pobj = new PrintStream(sobj.getOutputStream());//sending data to the other application.

        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));//it takes input as(data coming from the server/other app)

        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in)); //it takes input from keyboard

        System.out.println("---------------------------------------------------------");
        System.out.println("------------Marvellous chat client-----------------------");
        System.out.println("---------------------------------------------------------");

        String str1 = null, str2 =null;

        System.out.println("Enter message for server : ");

        while(!(str1=bobj2.readLine()).equals("end"))
        {
            pobj.println(str1);
            str2 = bobj1.readLine();
            System.out.println("Server says :"+str2);
            System.out.println("Enter message for server : ");
        }

        sobj.close();

    }
}