package FinalKeyword;

public class FinalMethod {

    final public static  String reverse(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = input.length()-1;i>=0;i--){
            stringBuilder.append(input.charAt(i));
        }
        return stringBuilder.toString();
    }
    public static void main(String[] args) {
       String input = "hello";
       String stringBuilder = reverse(input);
        System.out.println(stringBuilder);

    }
}