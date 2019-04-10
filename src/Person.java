
/*
I certify that this submission is my own original work: R01656356
 */
/**
 * Represents a person containing a first name and last name
 * @author Vinny
 */
public class Person
{
    private String firstName;
    private String lastName;
    
    /**
     * Creates a new person with default values for first and last name
     * firstName = "No Name"
     * lastName = "No Name"
     */
    public Person()
    {
        this.firstName = "No Name";
        this.lastName = "No Name";
    }
    /**
     *Creates a new person with given first and last name
     * @param firstName
     * @param lastName
     */
    public Person(String firstName, String lastName)
    {
        setFirstName(firstName);
        setLastName(lastName);
    }
    
    /**
     *Creates a deep copy of a person object given the person to be copied.
     * @param p
     */
    public Person(Person p)
    {
        this.firstName = p.firstName;
        this.lastName = p.lastName;
    }
    
    /**
     *Returns first name of person of type string
     * @return
     */
    public String getFirstName()
    {
        return this.firstName;
    }
    /**
     * Returns the last name of person of type string
     * @return 
     */
    public String getLastName()
    {
        return this.lastName;
    }
    /**
     * Sets the first name of person given a string
     * String can not be null or empty
     * @param fName 
     */
    public void setFirstName(String fName)
    {
        if(!fName.isEmpty() && !"".equals(fName))
            this.firstName = fName;
        else
            this.firstName = "No Name";
    }
    /**
     * Sets the last name of person given a string
     * String can not be null or empty
     * @param lName 
     */
    public void setLastName(String lName)
    {
        if(!lName.isEmpty() && !"".equals(lName))
            this.lastName = lName;
        else
            this.lastName = "No Name";
    }
    
    /**
     * Compares two person objects for equality between fields
     * If all fields are equal, returns true
     * @param p
     * @return 
     */
    public boolean equals(Person p)
    {
        return ((p.firstName.equals(this.firstName)) && (p.lastName.equals(this.lastName)));
    }
    /**
     * Returns formatted string of person's fields
     * @return 
     */
    @Override
    public String toString()
    {
        return ("First Name: " + getFirstName() + " Last Name: " + getLastName());
    }
   
    
}
