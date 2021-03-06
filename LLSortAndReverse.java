import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    LinkedList<Integer> ln = new LinkedList<Integer>();
	    ln.add(8);
	    ln.add(4);
	    ln.add(9);
	    ln.add(54);
	    ln.add(2);
	    Collections.sort(ln);
	    System.out.println("Sorted List : "+ln);
	    Collections.reverse(ln);
	    System.out.println("Reversed List : "+ln);
	}
}


//Routput:

// Sorted List : [2, 4, 8, 9, 54]                                                                                                    
// Reversed List : [54, 9, 8, 4, 2]
