package corejava;

public class non_static {
// to call a non static function we have to make an object
// if static is not mentioned in a function, it becomes non static	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	non_static x = new non_static();   // instance of a class
	x.car();
	x.flower();
	}
	

	public void car() {     //non static function. how static function can be called everywhere 
	System.out.println("toyota");	
	}
	
	public void flower() {
	System.out.println("rose");
	}
	
	
	
	
	}


