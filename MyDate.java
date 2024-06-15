import java.util.GregorianCalendar;

public class MyDate {
    private int year = 0;
    private int month = 0;
    private int day = 0;

    MyDate () {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        this.year = gregorianCalendar.get(gregorianCalendar.YEAR);
        this.month = gregorianCalendar.get(gregorianCalendar.MONTH);
        this.day = gregorianCalendar.get(gregorianCalendar.DAY_OF_MONTH);
    }

    MyDate(long elapsedTime){
        setDate(elapsedTime);
    }


    void setDate(long elapsedTime){
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(elapsedTime);
        this.year = gregorianCalendar.get(gregorianCalendar.YEAR);
        this.month = gregorianCalendar.get(gregorianCalendar.MONTH);
        this.day = gregorianCalendar.get(gregorianCalendar.DAY_OF_MONTH);
        System.out.println("The year is " + year + ", The month is " + ( month + 1) + ", and the day is " + day + ".");
    }

    int getYear() {
        return year;
    }
    
    int getMonth() {
        return month;
    }

    int getDay(){
        return day;
    }

    public static void main(String[] args){
        MyDate date1 = new MyDate();
        date1.setDate(0L);
        MyDate date2 = new MyDate();
        date2.setDate(34355555133101L);

    }

}

