import java.util.*;
public class LinkedList
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.print("Enter the size of the Array : ");
	    int n = in.nextInt();
	    LinkedList<Integer> arr = new LinkedList<>();
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
        
        
        arr.addFirst(2);
        arr.addLast(4);
        System.out.println("Array List after Insertion is : "+arr);
        
        System.out.println("Array element at first index is  "+arr.getFirst());
        System.out.println("Array List after last index is : "+arr.getLast());


        
	}
}

//Routput:

// Enter the size of the Array : 5                                                                                                   
// 9 8 4 5 6                                                                                                                         
// Array List is : [9, 8, 4, 5, 6]                                                                                                   
// Array List after remove is : [9, 4, 5, 6]                                                                                         
// Element at Index 1 is : 4                                                                                                         
// Element at Index 2 is replaced with 5 and the element that is removed : 5                                                         
// Array List after replace is : [9, 4, 5, 6]                                                                                        
// Array List after Insertion is : [2, 9, 4, 5, 6, 4]                                                                                
// Array element at first index is  2                                                                                                
// Array List after last index is : 4
