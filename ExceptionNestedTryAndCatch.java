
package exception.nested.pkgtry.and.pkgcatch;

public class ExceptionNestedTryAndCatch {

    public static void main(String[] args) {
        try
        {
            try
            {
                int a = 10;
                int b = 0;
                System.out.println("Result : "+(a/b));
            }
            catch(ArithmeticException e)
            {
                System.out.println("Exception for inner try is : "+e);
            }
            catch(Exception e)
            {
                System.out.println("Exception for inner try is : "+e);
            }
            int[] arr = new int[5];
            arr[9] = 55;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception for outer try is : "+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception for outer try is : "+e);
        }
        catch(Exception e)
        {
            System.out.println("Exception for outer try is : "+e);
        }
    }
    
}
