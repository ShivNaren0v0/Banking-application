public class BankServiceImpl implements BankService{
    @Override
    public Double addFundsToAccount(Account account, Double amount) throws AccountException{
        if(account == null) {
            throw new AccountException("Account null.");
        }
        if(amount <0) {
            throw new AccountException("You cant add -ve Banalce.");
        }
        Double newBalance = account.getBalance();
        newBalance +=amount;
        account.setBalance(newBalance);
        return newBalance;

    }

    @Override
    public Double withdrawFunds(Account account, Double amount) throws AccountException {
        if(account.getBalance()-amount <0) {
            throw new AccountException("You cant have -ve Balance.");
        }
        account.setBalance(account.getBalance()-amount);
        return account.getBalance();
    }

    @Override
    public Double displayBalance(Account account) {
        return account.getBalance();
    }

    @Override
    public Boolean fundTransfer(Account fromAccount, Account toAccount, Double amount) throws AccountException{
        if(fromAccount.getBalance()-amount <0) {
            throw new AccountException("Balance not sufficient for withdrawal.");
        }
       fromAccount.setBalance(fromAccount.getBalance()-amount);
       toAccount.setBalance(toAccount.getBalance()+amount);
       return true;
    }
}
