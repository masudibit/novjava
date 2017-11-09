package corejava;

public class Global_local {

	static int c=500; // global variable can be called if any function
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    age ();
    salary();
    System.out.println(c);
	}
	
	public static void age(){
    int x=3;  //local variable
    System.out.println(x);
    System.out.println(c);
    }
    
	public static void salary(){
	int y=300;	// local variable 
	System.out.println(y);
	System.out.println(c);
	}	
		
	public static void apple(){	
	System.out.println(c);	
	}		
		
		
		
	}

