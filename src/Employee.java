public class Employee extends Person
{
    private int ID;
    private Date hireDate;
    
    public Employee()
    {
        super();
        this.ID = 0;
        hireDate = new Date();
    }
    public Employee(String fName, String lName, int ID, int year, int month, int day)
    {
        super.setFirstName(fName);
        super.setLastName(lName);
        this.ID = ID;
        hireDate = new Date(year, month, day);
    }
    public Employee(Employee e)
    {
        super.setFirstName(e.getFirstName());
        super.setLastName(e.getLastName());
        this.ID = e.ID;
        this.hireDate = new Date(e.hireDate);
    }
    public int getID()
    {
        return this.ID;
    }
    public Date getHireDate()
    {
        return this.hireDate;
    }
    public void setID(int ID)
    {
        if(ID > 0)
            this.ID = ID;
        else
            this.ID = 0;
    }
    public void setHireDate(int year, int month, int day)
    {
        this.hireDate = new Date(year, month, day);
    }
    public boolean equals(Employee e)
    {
        boolean isEqual = false;
        if(e.ID == this.ID && 
           e.hireDate.equals(this.hireDate) && 
           super.equals(e))
        {
            isEqual = true;
        }
        return isEqual;
    }
    public String toString()
    {
        return (super.toString() + " ID: " + this.getID()
                + " Hire date: " + this.hireDate.toString());
    }
}

