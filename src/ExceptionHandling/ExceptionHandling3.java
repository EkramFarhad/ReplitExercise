package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling3 {
    static void exception() throws Exception {

        try {
            FileInputStream fileInputStream = new FileInputStream("");

        } catch (FileNotFoundException FNF) {
            System.out.println(FNF);
        }
    }

    public static void main(String[] args) throws Exception {
        exception();
    }
}
