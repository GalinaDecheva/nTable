import java.util.Scanner;

public class nTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int a;
			
		
		System.out.print("Enter Value: ");
		 a = input.nextInt();
		 
		for(int c = 0; c < a; c++){	
		 
		 for(int b = 0; b < a; b++){
			 System.out.print(a-1 + 2*c);
		 }
		 System.out.println();
		}
		 
			 
		input.close();
	}
	
}
