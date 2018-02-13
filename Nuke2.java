package testhw1;
import java.io.*;

public class Nuke2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader keyBoard;
		String inputString;
		
		keyBoard = new BufferedReader(new  InputStreamReader(System.in));
		System.out.print("Please enter a string:  ");
		System.out.flush();
		inputString = keyBoard.readLine();
		
		String nuke2String;
	    nuke2String = inputString.substring(0,1) + inputString.substring(2);
	    System.out.println(nuke2String);
		}
	}

