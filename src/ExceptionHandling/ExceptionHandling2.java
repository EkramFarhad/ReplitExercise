package ExceptionHandling;

public class ExceptionHandling2 {
    public static void main(String[] args) {

        try {
            int[] numbers = new int[3];

            System.out.println(numbers[4]);

        }catch (ArrayIndexOutOfBoundsException aroobe){
            System.out.println(aroobe);
        }



    }
}
