package corejava;

public class if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int i= 500;
	int j= 200;
	int a= 300;                  /*System.out.println (i);
	                               System.out.println (j);
	                               System.out.println (a);*/
		
	if (i==j)
		System.out.println ("Value of i and j are equal");
	else
		System.out.println ("value of i nad j are not equal, value of i is "+i);
	
	if (i<j)
		System.out.println ("i is less then j");
	else
		System.out.println ("i is not less then j");
		
	if (j==a)
		System.out.println ("Value of j and a are equal");
	else
		System.out.println ("value of j and a are not equal");
	
	if(j==a) // equal condition
		System.out.println ("Value of j and a are equal");
	else
		System.out.println ("They are not same, value of j is "+j);
			
		
	if (!(i==a)) // not equal condition
		System.out.println ("a and i are not the same");
	else
		System.out.println ("a and i are the same same");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
