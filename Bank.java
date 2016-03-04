
/**
 * Write a description of class Bank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bank
{   
    public static double creditInterestRate, investmentInterestRate, premiumInterestRate;
    private static int lastCustID, nextCustID, numOfCurrentCustomer;
    public static int NumOfCurrentCustomers;
    public static final int maxNumOfCustomers = 20;
    public static String closeTime, phone, startTime;
    public static String website, bankName = "JBANK", bankAddress = "1234 JavaStreet, AnyCity, ThisState, 34567";
    private static final String EMAIL_PATTERN = 
        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
   
    public Bank() 
    {}
    
    /**
     * metode getAddress
     */
    /*public static String getAddress() {
        return null;
    }*/
    
    /**
     * metode getCreditRate
     */
    public static double getCreditRate() {
        return 0;
    }
    
    /**
     * metode getInvestmentRate
     */
    public static double getInvestmentRate() {
        return 0;
    }
    
    /**
     * metode getHoursOfOperation
     */
    public static String getHoursOfOperation() {
        return null;
    }
    
    /** 
     * metode getLastID
     */
    public static int getLastID() {
        return 0;
    }
    
    public static int getNextID() {
        if (nextCustID == 0) {
            nextCustID = 1000;
            NumOfCurrentCustomers++;
            return nextCustID;
        }
        
        else if (nextCustID != 0) {
        
            if (NumOfCurrentCustomers == maxNumOfCustomers) {
                nextCustID = 0;
                return nextCustID;
            }
            else {
                lastCustID = nextCustID;
                nextCustID++;
                numOfCurrentCustomer++;
                return nextCustID;
            }
        }
        
        else
            return 0;
    }
    
    
    /** 
     * metode getName
     */
    /*public static String getName() {
        return null;
    }*/
    
    /*public static getMaxCustomers() {
    }*/
    
    /**
     * metode getWebsite
     */
    public static String getWebsite() {
        return null;
    }
    
    public static double getPremiumRate() {
        return 0;
    }
    
    public static String getPhone() {
        return null;
    }
    
    /**
     * metode getNumOfCurrentCustomer
     * @return Jumlah pelanggan
     */
    public static int getNumOfCurrentCustomer() {
        return numOfCurrentCustomer;
    }
    
    public static void setCreditRate (double rate) {}
    
    public static void setInvestmentRate (double rate) {}
    
    public static void setPremium (double rate) {}
    
}
