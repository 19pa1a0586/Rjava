package ranagrams;

import java.util.Scanner;

public class RAnagrams {
    public static boolean checkAnagram(String s1,String s2 ){
        int[] freq=new int[256];
        if(s1.length()!=s2.length())
            return false;
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-32]++;
            freq[s2.charAt(i)-32]--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0) return false;
        }
        return true;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String 1");
        String s1=sc.nextLine();
        System.out.println("Enter String 2");
        String s2=sc.nextLine();
        if(checkAnagram(s1,s2))
            System.out.println("Two strings are anagrams");
        else
            System.out.println("Two strings are not anagrams");
 }

    
}
