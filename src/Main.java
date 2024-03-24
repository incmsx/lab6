import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static java.lang.System.clearProperty;
import static java.lang.System.in;

public class Main
{
    public static void main(String[] args) throws IOException {
        while (true) {

            BufferedInputStream bis = new BufferedInputStream(in);
            int c = bis.read();
            if (c > 100) {
                break;
            }
            System.out.println(c);
        }
        System.out.println("adsa");
    }
}