package StreamingServices;

public final class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public Date() {
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            this.day = 1;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 1;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 2023) {
            this.year = year;
        } else {
            this.year = 2023;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }

    public Date expiryDate(int subscriptionYears) {
        int EXPYear = year + subscriptionYears;
        return new Date(day, month, EXPYear);
    }
}