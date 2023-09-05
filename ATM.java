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
            //System.out.print(userID + amount);
        }
        else
        {
            throw new Exception("The user already exists");
        }
    }

}
