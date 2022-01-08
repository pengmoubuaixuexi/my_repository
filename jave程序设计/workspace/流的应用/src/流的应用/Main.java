package 流的应用;

import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

import org.xml.sax.InputSource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket socket= new Socket(InetAddress.getByName("localhost"), 12345);
			 PrintWriter out= new PrintWriter(
					 new BufferedWriter(
							 new OutputStreamWriter(
									 socket.getOutputStream())));
			 out.println("hello");
			 out.flush();
			 BufferedReader in=new BufferedReader(
					 new InputStreamReader(
							 socket.getInputStream()));
			 String line;
			 line=in.readLine();
			 System.out.println(line);
			 out.close();
			 socket.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
