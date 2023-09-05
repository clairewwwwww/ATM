public class ATMTester 
{
    public static void main(String[] args) throws Exception
    {
        ATM tester = new ATM();
        checkOpenAccount(tester);
        
    }  
    public static void checkOpenAccount(ATM tester) throws Exception
    {
        //case 1
        tester.openAccount("test1", 12.00);
        tester.openAccount("test1", 12.00);
        //case 2
        tester.openAccount("test1", 12.00);
        
    }
}