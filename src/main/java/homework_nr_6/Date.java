package homework_nr_6;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = (day >= 1 && day <= 31) ? day : 1;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = (month >= 1 && month <= 12) ? month : 1;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayDate() {
        System.out.printf("%02d/%02d/%04d\n",  day, month, year);
    }
}
