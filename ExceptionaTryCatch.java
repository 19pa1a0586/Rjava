
package exceptiona.pkgtry.pkgcatch;

public class ExceptionaTryCatch {

    public static void main(String[] args) {
        try
        {
            int a = 10;
            int b = 0;
            System.out.println("Result is "+(a/b));
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception is : "+e);
        }
        catch(Exception e)
        {
            System.out.println("Exception is : "+e);
        }
    }
    
}
