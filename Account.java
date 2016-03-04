
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
   
   /**
    *  Metode konstruktor Account
    */
   public Account()
   {
       acctType = 'S';
       balance = 10.00;
   }
   
   /**
    * Metode konstruktor Account
    * @param type tipe akun
    * @param amount JumlahNilai
    */
   public Account (char type, double amount)
   {
       acctType = type;
       balance = amount;
   }
   
   /**
    * Metode deposit untuk depositon uang ke akun
    * @param amount JumlahNilai
    */
   public boolean deposit (double amount)
   {
       if (amount < 0) {
           return false;
        }
        
        else
            balance = balance + amount;
            return true;
   }
   
   /**
    * metode getAccType
    * @return type akun
    */
   public char getAcctType() 
   {
       return acctType;
   }
   
   /**
    * Metode getBalance
    * @return jumlah saldo akun
    */
   public double getBalance()
   {
       return balance;
   }
   
   /**
    * Metode getId mendapatkan nomor ID customer
    * @return ID customer
    */
   public String getId()
   {
       return id;
   }
    
   /**
    * metode setBalance
    * @param amount jumlah nilai yang akan ditabung
    */
   public void setBalance(double amount)
   {
       balance = amount;
   }
   
   /** 
    * metode setID menentukan ID dari customer
    * @param acctID ID account
    */
   public void setID (String acctId)
   {
       id = acctId;
   }
   
   /**
    * metode setAcctType 
    * @param type tipe akun
    */
   public void setAcctType (char type)
   {
       acctType = type;
   }
   
   public boolean withdraw (double amount) {
       if (balance-amount < 0) {
           return false;
        }
        
       else
           balance = balance - amount;
           return true;
   }
}
