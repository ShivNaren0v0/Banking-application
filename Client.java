public class Client {
    public static void main(String[] args)  {
        BankService bankService = new BankServiceImpl();

        Account account = new Account(1,"Ford",500.0);
        Account accountTwo = new Account(2,"India",100.0);
        System.out.println(account.toString());

        try {
            bankService.addFundsToAccount(null,250.0);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }
        try {
            bankService.addFundsToAccount(account,-1250.0);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }
        try {
            bankService.fundTransfer(account,accountTwo,1450.0);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }
        try {
            bankService.withdrawFunds(account,1450.0);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }

    }
}
