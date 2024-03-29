public interface BankService {
    Double addFundsToAccount(Account account, Double amount) throws AccountException;
    Double withdrawFunds(Account account, Double amount) throws AccountException;
    Double displayBalance(Account account);
    Boolean fundTransfer(Account fromAccount,Account toAccount, Double amount) throws AccountException;

}
