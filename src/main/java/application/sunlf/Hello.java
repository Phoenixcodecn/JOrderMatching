package application.sunlf;

import java.io.IOException;

public class Hello {
    public static final char FIX_DELIMITER = 1;

    public static void main(String[] args) throws IOException {
        String str = "8=FIX.4.29=5935=034=449=MARKET52=20210108-10:34:22.00060356=CLIENT110=018";

        str = str.replace(FIX_DELIMITER, '|');

        System.out.println(str);
        long x = 0;
        // System.out.println(stringSize(x));
    }

}
