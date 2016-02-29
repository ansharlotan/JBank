
/**
 * Write a description of class Account here.
 * 
 * @author Teuku Mohamad Anshar Lotan 
 * @version 25/02/2016
 */
public class Account
{
   private char acctType;
   private double balance;
   private String id;
   
   public Account()
   {
   
   }
   
   public Account (char type, double amount)
   {
       
   }
   
   public void deposit (double amount)
   {
       
   }
   
   public char getAcctType() 
   {
       return acctType;
   }
    
   public double getBalance()
   {
       return balance;
   }
    
   public String getId()
   {
       return id;
   }
    
   public void setBalance(double amount)
   {
       balance = amount;
   }
    
   public void setID (String acctId)
   {
       id = acctId;
   }
    
   public void setAcctType (char type)
   {
       acctType = type;
   }
        
}
