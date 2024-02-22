package Array;

public class ForEachMutliDimen {

	public static void main(String[] args) {
		int[][] arr = {{10,20},{30,40,50},{60,70}};
		
		 for(int[]  element : arr)
		 
		  {
			 for (int element2 : element ) {
				 System.out.print(element2 + " "); 
			 }
			 System.out.println();
		  }
		
	    }
	
	}


