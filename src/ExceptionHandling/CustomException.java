package ExceptionHandling;

public class CustomException extends Exception {

    public CustomException(String e){
        super(e);
    }

}

class printException{
     public static void gradeCheck(int grade) throws CustomException {
         if(grade>90){
             throw new CustomException("You are an exceptionally awesome student");
         }else {
             System.out.println("you are a great student");
         }

     }

    public static void main(String[] args) {
        int grade = 91;
        try {
            gradeCheck(grade);
        } catch (CustomException e) {
            System.out.println("SyntaxStudentException: " + e.getMessage());
        }
    }

}
