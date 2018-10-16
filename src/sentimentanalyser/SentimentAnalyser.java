/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentimentanalyser;

import java.io.*;
public class SentimentAnalyser {

	public static String analyse(String text) {
		///{

		//write your code here
		//start
		int good = 0;
		int bad = 0;
        String splitted[] = text.split(" ");
        for (int i = 0; i<splitted.length; i++){
            if(splitted[i].equalsIgnoreCase("good") || splitted[i].equalsIgnoreCase("awesome"))
                good++;
            if(splitted[i].equalsIgnoreCase("bad") || splitted[i].equalsIgnoreCase("terrible"))
                bad++;
        }

         return good + "P" + bad + "N" ;
		//end
		///} 
	}
	
	public static void main(String arg[])throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the text with spaces(press enter to done):");
	String text=br.readLine();
	
	System.out.println("Line:\n"+analyse(text));
	
	
	}
}
