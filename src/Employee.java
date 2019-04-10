
/*
I certify that this submission is my own original work: R01656356
 */
/**
 *Represents an Employee containing an ID and hire date
 * Is a person containing first name and last name
 */
public class Employee extends Person
{

    /**
     * *An identifier for the employee
     */
    private int ID;
    /**
     * *Hire date of employee
     */
    private Date hireDate;

    /**
     * Creates a new employee object with: a default ID of 0 a default date of
     * 1/1/2001
     */
    public Employee()
    {
        super();
        this.ID = 0;
        hireDate = new Date();
    }
    /**
     * Creates a new employee object with given first name, last name, ID, year,
     * month and day
     * @param fName
     * @param lName
     * @param ID
     * @param year
     * @param month
     * @param day 
     */
    public Employee(String fName, String lName, int ID, int year, int month, int day)
    {
        super.setFirstName(fName);
        super.setLastName(lName);
        this.ID = ID;
        hireDate = new Date(year, month, day);
    }

    /**
     * Creates a deep copy of an employee object given the employee to be copied.
     * @param e
     */
    public Employee(Employee e)
    {
        super.setFirstName(e.getFirstName());
        super.setLastName(e.getLastName());
        this.ID = e.ID;
        this.hireDate = new Date(e.hireDate);
    }
    /**
     * Returns employees ID
     * @return 
     */
    public int getID()
    {
        return this.ID;
    }
    /**
     * Returns employees hire date
     * @return 
     */
    public Date getHireDate()
    {
        return this.hireDate;
    }

    /**
     * Sets employee ID
     * Must be > 0
     * Defaults to 0
     * @param ID 
     */
    public void setID(int ID)
    {
        if (ID > 0) {
            this.ID = ID;
        } else {
            this.ID = 0;
        }
    }

    /**
     * Sets hire date of employee
     * @param year
     * @param month
     * @param day 
     */
    public void setHireDate(int year, int month, int day)
    {
        this.hireDate = new Date(year, month, day);
    }

    /**
     * Compares two employee objects for equality between fields
     * If all fields are equal, returns true
     * @param e
     * @return 
     */
    public boolean equals(Employee e)
    {
        boolean isEqual = false;
        if (e.ID == this.ID
                && e.hireDate.equals(this.hireDate)
                && super.equals(e)) {
            isEqual = true;
        }
        return isEqual;
    }

    /**
     * Returns formatted string of employee's fields
     * @return 
     */
    public String toString()
    {
        return (super.toString() + " ID: " + this.getID()
                + " Hire date: " + this.hireDate.toString());
    }
}
