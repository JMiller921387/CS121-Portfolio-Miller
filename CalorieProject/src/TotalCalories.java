import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TotalCalories {

    String startDate, endDate = "null";
    int cals = 0;
    private DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

    public TotalCalories(int calAmt, String startDate, String endDate){
        this.startDate = startDate;
        this.endDate = endDate;
        this.cals = calAmt;
    }
    public TotalCalories(){}


    int calCounter(int calAmt, String startDate, String endDate) {
        int days = 0;
        //int cals = 0;

        try {
            this.startDate = startDate;
            this.endDate = endDate;
            this.cals = calAmt;
            Date date1 = dateFormat.parse(startDate);
            Date date2 = dateFormat.parse(endDate);
            long difference = date2.getTime() - date1.getTime();
            days = (int) TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
        }
        catch (ParseException e) {
            e.printStackTrace();;
        }
        return calAmt * days;

    }
    public int daysLong(String startDate, String endDate){
        int days= 0;
        try {
            Date date1 = dateFormat.parse(startDate);
            Date date2 = dateFormat.parse(endDate);
            long difference = date2.getTime() - date1.getTime();
            days = (int) TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        return days;
    }

    public String getCalInfo(){
        return ("your calorie intake could be : " + cals + ", or, ");
    }

}
