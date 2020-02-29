/**
 * Created by swakkhar on 6/1/16.
 */
public class Period
{
    private Date start;
    private Date end;

    public Period(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Period{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
