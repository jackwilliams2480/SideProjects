import java.util.*;

public class Date{

    //feilds
    private int year,month,day;
    private int daysInMonth[] = {0,31,59,90,120,151,181,212,243,273,304,334,365};
    private int daysInMonthLeapYear[] = {0,31,60,91,121,152,182,213,244,274,305,335,366};

    //constructors
    public Date(){
        this(0,0,0);
    }

    public Date(int year,int month,int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    public int getYear(){
        return this.year;
    }
    //methods
    public void setDate(int year,int month,int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public void addDays(int daysToAdd)
    {        
        daysToAdd--;
        while (daysToAdd > daysInYear()) {
            daysToAdd -= daysInYear();
            year++;
        }
        
        int dayInMonth;
        for (int i = 0; i < daysToAdd; i++) {
            day++;
            dayInMonth = daysInMonth[month];
            if (month == 2 && isLeapYear()) {
                dayInMonth++;
            }
            if (day > dayInMonth) {
                month++;
                day = 1;
                if (month > 12) {
                    year++;
                    month = 1;
                }
            }
        }
    } // addDays

    public void addWeeks(int weeks)
    {
        addDays(weeks*7);
    }

    public int daysInYear(){
        if(isLeapYear()){
            return 366;
        }else{
            return 365;
        }
    }
    
    public boolean isLeapYear(){
        if (((this.year % 4 == 0) && (this.year % 100 != 0)) || (this.year % 400 == 0)){
            return true;
        }else{
            return false;
        }
    }

    public String toString(){
        return this.year + "/" + this.month + "/" + this.day;
    }
}