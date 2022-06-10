import java.util.*;

// Notes 4 Move increment 

public class TheTowerOfW {

	public static int count;
   
	// Creating Stack array
	public static Stack<Integer>[] tower = new Stack[4]; 
	
	public static void BWTOH(int num){
		  for(int c = num; c > 0; c--)
		    tower[1].push(c);
		    display();
		    movingdisk(num, 1, 2, 3);
		  
		}
	
	// Moves disks 
    public static void movingdisk(int n, int a, int b, int c){
        if (n > 0){
            movingdisk(n-1, a, c, b);     
            int d = tower[a].pop();                                             
            tower[c].push(d);
            display();                   
            movingdisk(n-1, b, a, c);     
        }         
    }
    
    // Display table
    public static void display(){

    	  for(int i = count - 1; i >= 0; i--){
    	    String d1 = " ", d2 = " ", d3 = " ";    
    	    
    	    		 try{
    	                 d1 = String.valueOf(tower[1].get(i));  
    	             }
    	             catch (Exception e){
    	             }    
    	             try{
    	                 d2 = String.valueOf(tower[2].get(i));
    	             }
    	             catch(Exception e){
    	             }
    	             try{
    	                 d3 = String.valueOf(tower[3].get(i));
    	             }
    	             catch (Exception e){
    	             }
    	             System.out.println("  "+d1+"  |  "+d2+"  |  "+d3);
    	         }
    	  System.out.println("---------------");
    	  System.out.println("  A  |  B  |  C");
    	  
    	         System.out.println("\n"); 
    	  }

	
	public static void main(String[] args) {
		
		Random rand = new Random();

	    tower[1] = new Stack<Integer>();
	    tower[2] = new Stack<Integer>();
	    tower[3] = new Stack<Integer>();
	    int numstack = rand.nextInt(10-4+1)+4; // Generate Numbers between 10 and 4

	    count = numstack;
	    BWTOH(numstack);
		
	}

}
