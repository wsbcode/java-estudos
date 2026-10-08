package ClassesUtilitarias.Format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTST01 {
    public static void main(String[] args) {
        String isoFormat = "dd/MM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(isoFormat);
        sdf.format(new Date());
        System.out.println(sdf.format(new Date()));
    }
}
