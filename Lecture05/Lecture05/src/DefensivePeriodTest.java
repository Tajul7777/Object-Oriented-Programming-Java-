/**
 * Created by swakkhar on 6/1/16.
 */
public class DefensivePeriodTest
{
    public static void main(String[] args)
    {
        Date myDateOne=new Date(2016,6,1);
        Date myDateTwo=new Date(2016,6,30);
        DefensivePeriod myPeriod =new DefensivePeriod(myDateOne,myDateTwo);
        System.out.println(myDateOne);
        System.out.println(myPeriod);
        myDateTwo.setYear(2022);
        System.out.println(myPeriod);
        myPeriod.getStart().setYear(1983);
        System.out.println(myDateOne);
    }
}


