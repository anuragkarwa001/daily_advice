import java.io.*;
import java.net.*;


public class DailyAdviceClient {
    public void go()
    {
        try{
            Socket s = new Socket("127.0.0.1", 4242);
            InputStreamReader isr=new InputStreamReader(s.getInputStream());

            BufferedReader br=new BufferedReader(isr);
            String advice;
            advice=br.readLine();
            System.out.println(advice);
            br.close();









        }catch (IOException ex){


           ex.printStackTrace();

        }

    }


    public static void main(String [] args)
    {
        DailyAdviceClient dailyAdviceClient=new DailyAdviceClient();
        dailyAdviceClient.go();


    }

}
