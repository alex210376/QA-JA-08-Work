package academy.lesson05;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {
        day = 10;
        month = 10;
        year = 1975;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void set(int day, int month, int year) {
        if(0 < day && day <= 31)
            this.day = day; else System.out.println("Неверное значение дня");
        if(0 < month && month <= 12)
            this.month = month; else System.out.println("Неверное значение месяца");
        if(0 < year && year <= 2049)
            this.year = year; else System.out.println("Неверное значение года");
    }

    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public void printDate(){
        System.out.println("День:" + this.day);
        System.out.println("Месяц:" + this.month);
        System.out.println("Год:" + this.year);
    }
    public String getFormattedDate() {
        return String.format("%02d.%02d.%02d", getDay(), getMonth(), getYear());
    }
    public void printDateLine(){
        System.out.println(this.day + "." + this.month + "." + this.year);
    }
}
