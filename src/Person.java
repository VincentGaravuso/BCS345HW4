
public class Person
{
    private String firstName;
    private String lastName;
    
    public Person()
    {
        this.firstName = "No Name";
        this.lastName = "No Name";
    }
    public Person(String firstName, String lastName)
    {
        setFirstName(firstName);
        setLastName(lastName);
    }
    
    public Person(Person p)
    {
        this.firstName = p.firstName;
        this.lastName = p.lastName;
    }
    
    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public void setFirstName(String fName)
    {
        if(!fName.isEmpty() && !"".equals(fName))
            this.firstName = fName;
        else
            fName = "No Name";
    }
    public void setLastName(String lName)
    {
        if(!lName.isEmpty() && !"".equals(lName))
            this.lastName = lName;
        else
            lName = "No Name";
    }
    public boolean equals(Person p)
    {
        return ((p.firstName.equals(this.firstName)) && (p.lastName.equals(this.lastName)));
    }
    @Override
    public String toString()
    {
        return ("First Name: " + getFirstName() + " Last Name: " + getLastName());
    }
   
    
}
