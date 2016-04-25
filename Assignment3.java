import java.util.Random;
import java.util.Scanner;
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		int x = 0;
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a Maximum Number: ");
		int y = sc.nextInt();
		
		Scanner aa = new Scanner(System.in);
		System.out.print("How many Random number you want ? - ");
		int i = aa.nextInt();
		System.out.println();
		System.out.println("Below are the " + i + " Random numbers :");
		for (int j=i; j>0; j--)
		{
			System.out.print((r.nextInt(y - x) + x) + " ");
		}
	}

}
