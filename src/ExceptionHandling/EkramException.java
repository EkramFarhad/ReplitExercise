package ExceptionHandling;

public class EkramException extends Exception {

    public EkramException(String e) {
        super(e);

    }

}

class MethodClass {

    public static void exceptionMethod(int grade) throws EkramException {

        if (grade > 90) {
            throw new EkramException("you are great");

        } else {
            System.out.println("you are fine");
        }


    }


}


class MainClass {
    public static void main(String[] args) {
        int grade = 90;
        Exception exception = new  exceptionMethod(grade);

    }
}
