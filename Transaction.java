public class Transaction {
    private int currentBalance;

    Transaction(int account_number) {
        AccountDetails ac = new AccountDetails();
        currentBalance = ac.returnBalance(account_number);
    }

    void debit(int money_entered) {
        if (money_entered <= currentBalance) {
            currentBalance -= money_entered;
            System.out.println("money Debited Successfully");
        } else {
            System.out.println("InSufficiet balance");

        }
    }

    void credit(int money_entered) {
        currentBalance += money_entered;
        System.out.println("money credited Successfully");
    }

    int getBalance() {
        return currentBalance;
    }

    void transfer(int money_entered, int receiverAccountNumber) {
        if (money_entered <= currentBalance) {
            AccountDetails ac = new AccountDetails();
            if (ac.doesAccountPresent(receiverAccountNumber)) {
                currentBalance -= money_entered;
                ac.updateBalance(receiverAccountNumber, money_entered);
                System.out.println("Money Transferred Successfully");
            } else {
                System.out.println("Receiver's account not found");
            }
        } else {
            System.out.println("Insufficient balance for the transfer");
        }
    }

}
