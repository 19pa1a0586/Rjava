import java.util.*;
public class ArrayList
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.print("Enter the size of the Array : ");
	    int n = in.nextInt();
	    ArrayList<Integer> arr = new ArrayList<>(n);
	    for(int i = 0; i < n; i++)
	    {
	        arr.add(in.nextInt());
	    }
            System.out.println("Array List is : "+arr);
            arr.remove(1);
            System.out.println("Array List after remove is : "+arr);
            System.out.println("Element at Index 1 is : "+arr.get(1));
            System.out.println("Element at Index 2 is replaced with 5 and the element that is removed : "+arr.set(2,5));
            System.out.println("Array List after replace is : "+arr);
	}
}

//Routput:

// Enter the size of the Array : 5                                                                                                 
// 9 8 3 4 5                                                                                                                       
// Array List is : [9, 8, 3, 4, 5]                                                                                                 
// Array List after remove is : [9, 3, 4, 5]                                                                                       
// Element at Index 1 is : 3                                                                                                       
// Element at Index 2 is replaced with 5 and the element that is removed : 4                                                       
// Array List after replace is : [9, 3, 5, 5] 
