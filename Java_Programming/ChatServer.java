import java.io.*;
import java.net.*;


class ChatServer
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Server application is running...");

        ServerSocket ssobj = new ServerSocket(2100);

        System.out.println("Server is waiting at port 2100...");

        Socket sobj = ssobj.accept(); //it accept the request of client.

        System.out.println("Client request gets accepted succesfully..");

        PrintStream pobj = new PrintStream(sobj.getOutputStream()); //sending data to the other application.

        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));//it takes input as(data coming from the client/other app)

        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in)); //it takes input from keyboard

        System.out.println("---------------------------------------------------------");
        System.out.println("------------Marvellous chat server-----------------------");
        System.out.println("---------------------------------------------------------");

        String str1 = null, str2 =null;

        while((str1=bobj1.readLine())!= null)
        {
            System.out.println("Client says: "+str1);
            System.out.println("Enter message for client: ");
            str2 = bobj2.readLine();
            pobj.println(str2);

        }

         sobj.close();
         ssobj.close();

    }
   
}