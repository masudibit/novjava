package corejava;

public class double_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String flight[][]=new String [4][4];
		
		flight [0][0]= "dallas"; 
		flight [0][1]= "nyc";
		flight [0][2]= "arknasas";
		flight [0][3]= "miami";
		
		flight [1][0]= "los angeles";
		flight [1][1]= "california";
		flight [1][2]= "wisconsoin";
		flight [1][3]= "new mexico";
		
		flight [2][0]= "seatle";
		flight [2][1]= "arizona";
		flight [2][2]= "verginia";
		flight [2][3]= "new jersy";
		
		flight [3][0]= "philedelphia";
		flight [3][1]= "dublin";
		flight [3][2]= "london";
		flight [3][3]= "frankfort";

		/*System.out.println (flight[0][0]);
		System.out.println (flight[3][0]);
		System.out.println (flight[2][2]);*/
	
        int rows=flight[0].length;
		int cols=flight[0].length;
		      // argument for rows
		for (int rownum=0; rownum<rows; rownum++) {
		     //argument for colnum
			
	    for (int colnum=0; colnum<cols; colnum++) {
		    // argument for printing rows and colnum 
		   
	   System.out.println(flight [rownum][colnum]);	   
	   }
		}
	   }

}
