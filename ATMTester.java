public class ATMTester 
{
    public static void main(String[] args) throws Exception
    {
        ATM tester = new ATM();
        checkOpenAccount(tester);
        //checkCloseAccount(tester);
        //checkCheckBalance(tester);
        //checkDepositMoney(tester);
        //checkWithdrawMoney(tester);
        checkTransferMoney(tester);
        tester.audit();
        
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
        
    }
    public static void checkCloseAccount(ATM tester) throws Exception
    {
        tester.closeAccount("test1");
        //tester.openAccount("test2", 16.00);
    }
    public static void checkCheckBalance(ATM tester) throws Exception
    {
        //System.out.print(tester.checkBalance("test1")); //if account exist
        System.out.print(tester.checkBalance("test23423"));//if account doesn't exist
    }
    public static void checkDepositMoney(ATM tester) throws Exception
    {
        //System.out.print(tester.depositMoney("test23423", 100));//if account doesn't exist
        System.out.print(tester.depositMoney("test1", 10)); //if account exist
    }
    public static void checkWithdrawMoney(ATM tester) throws Exception
    {
        System.out.print(tester.withdrawMoney("test1", 10)); 
        //System.out.print(tester.withdrawMoney("test1", 10));
        //System.out.print(tester.withdrawMoney("test1", 10));
    }
    public static void checkTransferMoney(ATM tester) throws Exception
    {
        tester.transferMoney("test1", "test2", 20);
    }
}