/**
 * Created by swakkhar on 6/1/16.
 */
/**
 * Created by swakkhar on 6/1/16.
 */
public class DefensivePeriod
{
    private Date start;
    private Date end;

    public DefensivePeriod(Date start, Date end) {
        this.start = new Date(start);
        this.end = new Date(end);
    }

    @Override
    public String toString() {
        return "Period{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    public Date getStart() {
        return new Date(start);
    }

    public void setStart(Date start) {
        this.start = new Date(start);
    }

    public Date getEnd() {
        return new Date(end);
    }

    public void setEnd(Date end) {
        this.end = new Date(end);
    }
}

