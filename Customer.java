
/**
 * Write a description of class Customer here.
 * 
 * @author Teuku Mohamad Anshar Lotan
 * @version 25/02/2016
 */
public class Customer
{
    private Account accounts = new Account();
    private String cityAddress;
    private int custId;
    private String dateOfBirth;
    private String email;
    private String firstName;
    private String lastName;
    private int numberOfCurrentAccounts;
    private String streetAddress;
    private String phoneNumber;
    private String zipOrPostalCode;
    
    public Customer()
    {}
    
    public Customer (String fname, String Iname, String dob)
    {}
    
    public Customer (String firstname, String lastName, String dateOfBirth, int custId)
    {}
    
    public String getAddress()
    {
        return streetAddress+phoneNumber+zipOrPostalCode;
    }
    
    public Account getAccount()
    {
        return accounts;
    }
    
    public String getCustomerName()
    {
        return lastName+','+firstName;
    }
    
    public void setAddress (String street, String city, String code)
    {
        street = streetAddress;
        city = cityAddress;
        code = zipOrPostalCode;
    }
    
    public void setName(String name, String fname)
    {
        name = firstName;
        fname = lastName;
    }
    
    public void setAccount(Account accounts)
    {
        this.accounts = accounts;
    }
        
}

