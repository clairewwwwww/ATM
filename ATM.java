import java.util.HashMap;

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
        if(ATM.get(userID) <= 0|| ATM.get(userID) == null)
        {
            ATM.remove(userID);
        }
        else
        {
            throw new Exception("Need to withdraw $$$ before closing");
        }
    }

}
