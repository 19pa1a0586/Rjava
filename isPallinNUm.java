import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = in.nextInt();
        if(isPallinNum(n)){
            System.out.println(n+" is  a pallindrome.");
        }
        else{
            System.out.println(n+" is not a pallindrome.");
        }
    }
    
    public static boolean isPallinNum(int num){
        int temp = 0,m = 0, n = num;
        while(num != 0){
            m = num%10;
            temp = (temp*10)+m;
            num = num/10;
        }
        return temp == n;
    }
}