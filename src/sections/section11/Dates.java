package sections.section11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {
  public static void main(String[] args) throws ParseException {
    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    Date y1 = sdf1.parse("25/03/3434");
    Date yw = sdf2.parse("25/03/3434 15:23:23");

    System.out.println(sdf1.format(y1));
    System.out.println(sdf2.format(yw));
    
    Date x = new Date();
    System.out.println(x);
  }
}
