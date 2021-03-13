
package exception.user.defined;

import java.util.Scanner;

class InvalidNumberException extends Exception
{
    public String toString()
    {
        return "We must enter Numbers in between 1 and 9.";
    }
}
public class ExceptionUserDefined {
    
    public static int number() throws InvalidNumberException
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the valid number from 1 to 9 : ");
        int num = in.nextInt();
        if(num <= 0 || num >= 10)
        {
            throw new InvalidNumberException();
        }
        return num;
    }
    
    public static void numberCall() throws InvalidNumberException
    {
        System.out.println("Number is : "+number());
    }
    public static void main(String[] args) {
        try
        {
            numberCall();
        }
        catch(InvalidNumberException e)
        {
            System.out.println("Exception in main method is : "+e);
        }
        finally
        {
            System.out.println("Finally block");
        }
    }
}
