package jfixgateway;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class FIXUtility {
  private static ThreadLocal<SimpleDateFormat> dfMicrosecondUTC = new ThreadLocal<SimpleDateFormat>() {
    protected SimpleDateFormat initialValue() {
      SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss.SSS");
      // SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd-HH:mm:ss.SSSSSS");
      df.setTimeZone(TimeZone.getTimeZone("UTC"));
      return df;
    }
  };

  public static String getUtcDatetime() {
    return dfMicrosecondUTC.get().format(new Date());
  }

  public static void print(byte[] bytes) {
    System.out.print("message: ");
    for (byte b : bytes) {
      if ((char) b == FIXConst.FIX_DELIMITER)
        System.out.print('|');
      else
        System.out.print((char) b);
    }
    System.out.println();
  }
}
