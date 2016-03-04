import java.util.regex.*;
/**
 * Write a description of class Customer here.
 * 
 * @author Teuku Mohamad Anshar Lotan
 * @version 25/02/2016
 */
public class Customer
{
    public Account accounts = new Account();
    public String cityName;
    public int custId;
    public String dateOfBirth;
    public String email;
    public String firstName;
    public String lastName;
    public int numberOfCurrentAccounts;
    public String streetAddress;
    public String phoneNumber;
    public String zipOrPostalCode;
    private Pattern pattern;
    private Matcher matcher;
    private static final String testPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    
    /**
     * Constructor customer
     */
    public Customer(String firstName, String lastName)
    {
        this("","", "none");
    }
    
    /**
     * @param fname nama panjang
     * @param lname nama belakang
     * @param dob tanggal lahir
     */
    public Customer (String fname, String lname, String dob)
    {
        this.firstName = fname;
        this.lastName = lname;
        this.dateOfBirth = dob;
        
        custId = this.getCustomerId();
    }
    
    /**
     * @param firstName nama depan
     * @param lastName nama belakang
     * @param dateOfBirth tanggal lahir
     * @param custID nomor ID customer
     */
    public Customer (String firstname, String lastName, String dateOfBirth, int custId)
    {}
    
    /**
     * method getAddress
     * @return data alamat, nama kota, kode pos
     */
    public String getAddress()
    {
        return streetAddress+", "+ cityName +", "+zipOrPostalCode;
    }
    
    /**
     * Method getCustomerID
     * @return nomor identitas customer
     */
    public int getCustomerId() {
        return custId;
    }
    
    /**
     * Method getEmail
     * @return email customer
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Method getName
     * @return nama customer
     */
    public String getName()
    {
        return firstName+", "+lastName;
    }
    
    /**
     * Method getNumOfAccounts
     * @return jumlah account yang dimiliki customer
     */
    public int getNumOfAccounts() {
        return numberOfCurrentAccounts;
    }
    
    /** 
     * Method getPhoneNumber
     * @return nomor telepon customer
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    /** 
     * Method setAddress 
     * @param street nama jalan
     * @param city nama kota
     * @param code kode pos
     */
    public void setAddress (String street, String city, String code)
    {
        streetAddress = street;
        cityName = city;
        zipOrPostalCode = code;
        return;
    }
    
    /** 
     * Method getAccount
     * @return akun customer
     */
    public Account getAccount() 
    {
        return accounts;
    }
    
    /**
     * Method setEmail 
     * @param emailAddress alamat email
     */
    public boolean setEmail (String emailAddress) {
        pattern = Pattern.compile(testPattern);
        matcher = pattern.matcher(emailAddress);
        
        if (matcher.matches()){
            email = emailAddress;
            return true;
        }
        else
            return false;
    }
    
    /**
     * Method setName
     * @param fname nama depan
     * @param lname nama belakang
     */
   public void setName(String name, String fname)
    {
        name = firstName;
        fname = lastName;
    }
   
   /**
    * method setAccount
    * @param accounts akun customer
    */
   public void setAccount(Account accounts)
    {
        this.accounts = accounts;
    }
   
   /**
    * Method setPhoneNumber 
    * @return phoneNum nomor telepon
    */
   public void setPhoneNumber (String phoneNum){
   phoneNumber = phoneNum;
   }
   
}

