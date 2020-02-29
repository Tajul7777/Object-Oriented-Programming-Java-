import javax.xml.crypto.Data;
/**
 * Created by swakkhar on 6/1/16.
 */
public class Date
{
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public Date(Date other)
    {
        this.month=other.month;
        this.day=other.day;
        this.year=other.year;
    }
    @Override
    public String toString() {
        return "" + year + "/" + month + "/" + day ;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
}


