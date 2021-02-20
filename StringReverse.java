import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = in.nextLine();
        System.out.println("Reverse of "+str+" is "+reverse(str));
    }
    
    public static String reverse(String str){
        String temp= "";
        for(int i = str.length()-1; i >= 0; i--){
            temp += str.charAt(i);
        }
        return temp;
    }
}