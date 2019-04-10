
/*
I certify that this submission is my own original work: R01656356
 */
/**
 *Represents a start date for an employee.
 */
public class Date
{

    /**
     * *The year which an employee was hired.
     */
    private int year;
    /**
     * *The month which an employee was hired.
     */
    private int month;
    /**
     * *The day which an employee was hired.
     */
    private int day;

    /**
     * Creates a new date with default values for year, month and day (2001, 1,
     * 1 respectively).
     */
    public Date()
    {
        this.year = 2001;
        this.month = 1;
        this.day = 1;
    }
    /**
     * Creates a new date with given year, month and day respectively.
     * @param year
     * @param month
     * @param day 
     */
    public Date(int year, int month, int day)
    {
        setDate(year, month, day);
    }
    /**
     * Creates a deep copy of a date object given the date to be copied.
     * @param d 
     */
    public Date(Date d)
    {
        this.day = d.day;
        this.month = d.month;
        this.year = d.year;
    }
    /**
     * Sets a dates year, month and day respectively. Year must be between 1900
     * and 2019 Month must be between values 1 and 12 Day must be between 1 and
     * 31 depending on the month. Defaults year, month and day to 2001, 1, 1
     * respectively.
     * @param year
     * @param month
     * @param day 
     */
    public void setDate(int year, int month, int day)
    {
        if (year >= 1900 && year <= 2019) {
            this.year = year;
        } else {
            this.year = 2001;
        }

        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 1;
        }

        int numDays = 0;
        switch (month) {
            case 1:
                numDays = 31;
                break;
            case 2:
                numDays = 28;
                break;
            case 3:
                numDays = 31;
                break;
            case 4:
                numDays = 30;
                break;
            case 5:
                numDays = 31;
                break;
            case 6:
                numDays = 30;
                break;
            case 7:
                numDays = 31;
                break;
            case 8:
                numDays = 31;
                break;
            case 9:
                numDays = 30;
                break;
            case 10:
                numDays = 31;
                break;
            case 11:
                numDays = 30;
                break;
            case 12:
                numDays = 31;
                break;

        }
        switch (numDays) {
            case 31:
                if (day <= 31 && day >= 1) {
                    this.day = day;
                } else {
                    break;
                }
                break;
            case 30:
                if (day <= 30 && day >= 1) {
                    this.day = day;
                } else {
                    break;
                }
                break;
            case 28:
                if (day <= 28 && day >= 1) {
                    this.day = day;
                } else {
                    break;
                }
                break;
            default:
                this.day = 1;
        }
    }
    /**
     * Returns the year of a date
     * @return 
     */
    public int getYear()
    {
        return this.year;
    }
    /**
     * Returns the month of a date
     * @return 
     */
    public int getMonth()
    {
        return this.month;
    }
    /**
     * Returns the day of a date
     * @return 
     */
    public int getDay()
    {
        return this.day;
    }
    /**
     * Returns true if two date is equal to given date.
     * @param d
     * @return 
     */
    public boolean equals(Date d)
    {
        return ((d.day == this.day) && (d.month == this.month) && (d.year == this.year));
    }
    /**
     * Returns formatted string of year, month and day respectively.
     * @return 
     */
    @Override
    public String toString()
    {
        return (getYear() + "-" + String.format("%02d", getMonth()) + "-" + String.format("%02d", getDay()));
    }
}
