import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = in.nextLine();
        System.out.println("String Duplicates of "+str+" is "+StrDup(str));
    }
    
    public static String StrDup(String str){
        // String str2 = str;
        String temp= "";
        for(int i = 0; i < str.length(); i++){
            for(int j = i+1; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    temp += str.charAt(i);
                    // System.out.println(Character.toString(str.charAt(i)));
                    str = str.replaceAll(Character.toString(str.charAt(i)),"1");
                    System.out.println(str);
                }
            }
        }
        return temp;
    }
}