import java.util.*;

/* * The Tower of Hanoi is a puzzle that consists of three rods and a number of disks of different sizes, which can slide onto any rod. 
 * The puzzle starts with the disks in a neat stack in ascending order of size on one rod, the smallest at the top, thus making a conical (Links to an external site.)
 * Links to an external site. shape.

The objective of the puzzle is to move the entire stack to another rod, obeying the following simple rules:

1)Only one disk can be moved at a time.
2)Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack.
3)No disk may be placed on top of a smaller disk.
4)Random Number of Disk between 4 and 10
*/

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
