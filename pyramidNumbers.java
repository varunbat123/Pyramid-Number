// Varun Batra 110256128
import java.util.Scanner;
public class pyramidNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of lines");
		int totalWidth = scan.nextInt()*2;
		for (int row = 1; row <= totalWidth/2; row++) {int x =0;int p = (int)Math.pow(2, row-1);
		    for (int col = 1; col <= totalWidth; col++) {
		      if (col <= totalWidth/2 - row) {
		        System.out.print(" ");
		      }else if ((col>totalWidth/2 - row) &&(col<= totalWidth/2)) {
		        System.out.print((int)Math.pow(2, x)+ " ");
		        x+=1;
		      
		       
		        
		        
		      }
		      
		  
		      
		 
		      }
		    
		    System.out.println();
		  }
		
	}
}



