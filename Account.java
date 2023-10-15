import java.util.*;

public class Account {
    public static void main(String[] args) {

        Scanner ns = new Scanner(System.in);
        AccountDetails account = new AccountDetails();
        System.out.println("Enter account number");
        int account_number = ns.nextInt();
        System.out.println("Enter passkey");
        int passkey = ns.nextInt();
        Transaction tx = new Transaction(account_number);

        if (account.doesAccountPresent(account_number) || account.doesKeyMatch(passkey)) {
            while (true) {
                System.out.println("Enter Transaction type" + '\n' + "1:Debit" + '\n' + "2:Credit" + '\n' + "3:Balance"
                        + '\n' + "4:Transfer" + '\n' + "5:exit");
                int type = ns.nextInt();
                if (type == 1) {
                    int debitAmount = ns.nextInt();
                    tx.debit(debitAmount);
                } else if (type == 2) {
                    int creditAmount = ns.nextInt();
                    tx.credit(creditAmount);
                } else if (type == 3) {
                    System.out.println("balance:" + tx.getBalance());
                } else if (type == 4) {
                    int transferamount = ns.nextInt();
                    int touserid = ns.nextInt();
                    tx.transfer(transferamount, account_number);
                } else {
                    break;
                }
            }
        }
    }

}
