import java.math.*;
public class Assignment1 {

	public void sqrt(int n){
		double Squreroot = Math.sqrt(n);
		System.out.println("The Squreroot of "+ n +" is " + Squreroot);	
	}
	
	public void curt(int n){
		double cuberoot = Math.cbrt(n);
		System.out.println("The Cuberoot of "+ n +" is "+ cuberoot);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment1 sr = new Assignment1();
		Assignment1 cr = new Assignment1();
		
		sr.sqrt(4);
		cr.curt(16);
		
	}

}
