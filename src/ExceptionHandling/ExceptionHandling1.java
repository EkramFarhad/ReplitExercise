package ExceptionHandling;

public class ExceptionHandling1 {
    public static void main(String[] args) {

        try {
            int a=10, b=0 ;

            System.out.println(a/b);

        }catch (ArithmeticException ae){
            System.out.println(ae);
        }


    }
}
