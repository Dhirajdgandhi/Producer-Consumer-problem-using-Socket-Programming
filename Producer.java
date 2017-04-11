/****** DHIRAJ D GANDHI ********/
// This is producer class.

import java.io.*;
import java.net.*;

public class Producer
{
    public static void main(String args[])throws IOException, InterruptedException
    {
        Socket s=new Socket("localhost",7000);
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        
        //Input Output Streams
        PrintStream out = new PrintStream(s.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
       
        while(true){
        	System.out.println("Want to produce?");
        	String console_inp=sc.readLine();
        	
        	if(console_inp.equalsIgnoreCase("Yes")){
        		String item=sc.readLine();
        		
        		out.println(item);
        		
        		in.readLine();
        		System.out.println("Producer produced - "  + item);
        		
        	}
        	 
        	
        }
        
    }
}


