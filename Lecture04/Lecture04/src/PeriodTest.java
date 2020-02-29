/**
 * Created by swakkhar on 6/1/16.
 */
public class PeriodTest
{
    public static void main(String[] args)
    {
        Date myDateOne=new Date(2016,6,1);
        Date myDateTwo=new Date(2016,6,30);
        Period myPeriod =new Period(myDateOne,myDateTwo);
        System.out.println(myDateOne);
        System.out.println(myPeriod);
        myDateTwo.setYear(2022);
        System.out.println(myPeriod);
        myPeriod.getStart().setYear(1983);
        System.out.println(myDateOne);
    }
}
