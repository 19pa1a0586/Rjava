
package exception.pkgthrows.and.pkgthrow;

public class ExceptionThrowsAndThrow {

    public static void main(String[] args) {
        try
        {
            throw new ArithmeticException("division by zero error ");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
    
}
