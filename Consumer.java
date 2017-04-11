/****** DHIRAJ D GANDHI ********/
// This is client program which connects to server.
// It send request for Critical Section when it wants to access it
// It waits till the time Critical Section is empty

import java.io.*;
import java.net.*;

public class Consumer
{
    public static void main(String args[])throws IOException, InterruptedException
    {
        Socket s=new Socket("localhost",7000);
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        
        //Streams
        PrintStream out = new PrintStream(s.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        
        while(true){
        	System.out.println("Want to consume?");
        	String console_inp=sc.readLine();
        	
        	if(console_inp.equalsIgnoreCase("Yes")){
        		out.println("CONSUME");
        		
        		String item=in.readLine();
            	
        		System.out.println("Consumer consumed - "  + item);
        	}
        	 
        	
        }
        
    }
}