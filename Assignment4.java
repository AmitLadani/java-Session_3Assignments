import java.util.Scanner;
public class Assignment4 {

	public void addition(int a, int b){
		int ans = a+b;
		System.out.println("The addition of "+ a + " and " + b + " is " + ans);	}
	
	public void substration (int a, int b){
		int ans = a-b;
		System.out.println("The substration of "+ a + " and " + b + " is " + ans);	}
	
	public void multiplication (int a, int b){
		int ans = a*b;
		System.out.println("The multiplication of "+ a + " and " + b + " is " + ans);	}
	
	public void division(int a, int b){
		int ans = a/b;
		System.out.println("The division of "+ a + " and " + b + " is " + ans);	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner aa = new Scanner(System.in); 
		System.out.print("Enter a Number: ");
		int a = aa.nextInt();
		
		Scanner bb = new Scanner(System.in); 
		System.out.print("Enter a Second Number: ");
		int b = bb.nextInt();
		
		Scanner cc = new Scanner(System.in); 
		System.out.print("Enter a Operator from (+,-,*,/): ");
		char c = cc.next().charAt(0);
		
				
		Assignment4 Answer = new Assignment4();
		
		switch (c) {
        case '+':  Answer.addition(a, b);
           break;
        case '-':  Answer.substration (a,b) ;
        	break;               
        case '*':  Answer.multiplication(a,b);
        	break;
        case '/':  Answer.division(a,b);
        	break;
	}

	}
	
}
