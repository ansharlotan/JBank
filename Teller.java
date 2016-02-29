
/**
 * Write a description of class Teller here.
 * 
 * @author Teuku Mohamad Anshar Lotan 
 * @version 25/02/2016
 */
public class Teller
{
    private Customer customers = new Customer ();
    
    public static void main (String args[])
    {
        Customer c1 = new Customer();
        c1.setName("Sanadhi", "Sutandi");
        
        Account a1 = new Account(), acc;
        a1.setBalance(20000);
        c1.setAccount(a1);
        acc = c1.getAccount();
        System.out.println(acc.getBalance());
    }
    
    public Teller()
    {}
}
