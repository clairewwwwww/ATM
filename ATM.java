import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Set;

public class ATM 
{
    private HashMap<String, Double> ATM;

    public ATM()
    {
        ATM = new HashMap<String, Double>();
    }
    /*A method 'openAccount'
    Input:
        String: userId - of an email of the new user ID
        double: amount - initial deposit amount
    Behavior:
        If the user does not exist
            Create a new account for the user
            Store their deposit amount 
        If the user does exist, throws an error stating that the user already exists */
    public void openAccount(String userID, double amount) throws Exception
    {
        if(!ATM.containsKey(userID))
        {
            ATM.put(userID, amount);
        }
        else
        {
            throw new Exception("The user already exists");
        }
    }
    /*A method 'closeAccount'
    Input:
        String: userId - of the account email / ID
    Behavior:
        If there is no balance
            Closes the account, deleting the account entry
        If there is a balance, throws an error mentioning the need to withdraw $$$ before closing */
    public void closeAccount(String userID) throws Exception
    {
        if(!ATM.containsKey(userID))
        {
            throw new Exception("no account is found");
        }
        if(ATM.get(userID) <= 0|| ATM.get(userID) == null)
        {
            ATM.remove(userID);
        }
        else
        {
            throw new Exception("Need to withdraw $$$ before closing");
        }
    }
    /*A method 'checkBalance'
    Input:
        String: userId - of the account email / ID
    Output:
        the exact account value
        throws exception if no account is found */
    public double checkBalance(String userID) throws Exception
    {
        if(ATM.containsKey(userID))
        {
            return ATM.get(userID);
        }
        else
        {
            throw new Exception("no account is found");
        }
    }
    /*A method called 'depositMoney'
    Input:
        String: userId - of an email of the new user ID
        double: amount - deposit amount
    Output:
        double of the deposited amount or throws exception
    Behavior:
        if account exists, increase the amount of the users account value
        if not, throws exception mentioning they're broke AF */
    public double depositMoney(String userID, double amount)throws Exception
    {
        if(!ATM.containsKey(userID))
        {
            throw new Exception("account is not found");
        }

        if(ATM.containsKey(userID))
        {
            double newAmount = ATM.get(userID) + amount;
            ATM.replace(userID, newAmount);
            return newAmount;
        }
        else
        {
            throw new Exception("You're broke :(");
        }
    }
    /*A method 'withdrawMoney'
    Input:
        String: userId - of an email of the new user ID
        double: amount - withdrawal amount
    Output:
        double:  of the returned amount or throws exception
    Behavior:
        checks for withdrawal amount within the account
        if amount exists, reduce the withdrawn amount and return that value
        if not, throws exception mentioning they're broke AF */
    public double withdrawMoney(String userID, double amount)throws Exception
    {
        if(!ATM.containsKey(userID))
        {
            throw new Exception("account is not found");
        }
        
        double current = ATM.get(userID);
        if(current >= amount)
        {
            double newAmount = current - amount;
            ATM.replace(userID, newAmount);
            return newAmount;
        }
        else
        {
            throw new Exception("You don't have enough money :(");
        }
    }
    public void audit() throws Exception
    {
        //File file = new File("AccountAudit.txt");
        PrintWriter pw = new PrintWriter("AccountAudit.txt"); 
        Set<String> setOfKeys = ATM.keySet();
			for(String key: setOfKeys)
			{
				pw.println("Email:" + key + " Value:" + ATM.get(key));
			}
		pw.close();
		
	}

}
