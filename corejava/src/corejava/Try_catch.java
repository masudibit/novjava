package corejava;

import java.util.Scanner;

public class Try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	try {	//tries the specific code
		
	Scanner reader	=  new Scanner (System.in); 
	System.out.println("Provide me first integer");
	int n = reader.nextInt();
	System.out.println("Provide me second integer");
	int p=reader.nextInt();
	
	int sum=n+p;
	
	System.out.println("your additional value is" +sum);
	
	} catch (Exception e) { //tries to catch every execution with e
		
	 System.out.println("provide a number value");
		
	
		
		
	}		
		
	}

}
