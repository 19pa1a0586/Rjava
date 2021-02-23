import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = in.nextLine();
        if(isPallindrome(str)){
            System.out.println(str+" is a Pallindrome");
        }
        else{
            System.out.println(str+" is not a Pallindrome");
        }
    }
    
    public static boolean isPallindrome(String s){
        String temp = "";
        for(int i = s.length()-1; i >= 0; i--){
            temp += s.charAt(i);
        }
        return temp.equals(s);
    }
}