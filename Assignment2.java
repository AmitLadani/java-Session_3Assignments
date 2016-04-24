
public class Assignment2 {

	
	public void Primenumber(int n){
		
		int y=n;
		int j=0;
      	for(y =n; y>=1; y--)
  			{      		 
      			if(n%y==0);
      		
      			j = j + 1;	
      		}
  			
  			
      	if (j ==2)
      		{
  		      System.out.println(n + " is a Primenumber");     		
  		    }
      	else 
      	{ 
      		System.out.println(n + " is not a Primenumber");
      	}
	}      	
      				
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Assignment2 nmb = new Assignment2();
		
		nmb.Primenumber(27);
	}

}
