public class ATMTester 
{
    public static void main(String[] args) throws Exception
    {
        ATM tester = new ATM();
        checkOpenAccount(tester);
        checkCheckBalance(tester);
        
    }  
    public static void checkOpenAccount(ATM tester) throws Exception
    {
        //case 1
        //tester.openAccount("test1", 12.00);
        //tester.openAccount("test1", 12.00);
        //case 2
        tester.openAccount("test1", 12.00);
        tester.openAccount("test2", 16.00);
        tester.openAccount("test3", 36.00);
        //tester.audit();
    }
    public static void checkCheckBalance(ATM tester) throws Exception
    {
        //System.out.print(tester.checkBalance("test1")); //if account exist
        System.out.print(tester.checkBalance("test23423"));//if account doesn't exist
    }
}