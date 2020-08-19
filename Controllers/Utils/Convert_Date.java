package Controllers.Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Convert_Date{
    public static String DateToString(){
        Date date=new Date();
        SimpleDateFormat sDF=new SimpleDateFormat("dd/MM/yyyy");
        String str_date=sDF.format(date);
        return str_date;
    }
    public static String HourToString(){
        Date date=new Date();
        SimpleDateFormat sDF=new SimpleDateFormat("hh:mm");
        String str_hour=sDF.format(date);
        return str_hour;
    }
}