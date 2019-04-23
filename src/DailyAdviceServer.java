import java.io.*;
import java.net.*;
import java.util.Scanner;


public class DailyAdviceServer {
    public void go() {

        try {
            ServerSocket serverSocket = new ServerSocket(4242);


            while (true) {
                Socket socket = serverSocket.accept();
                PrintWriter printWriter = new PrintWriter(socket.getOutputStream());


                String advice = "anurag karwa 001";
                printWriter.println(advice);
                printWriter.close();


            }
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("error");


        }

    }
    public static void main(String []args)
    {

        DailyAdviceServer dailyAdviceClient=new DailyAdviceServer();
        dailyAdviceClient.go();

    }



}





