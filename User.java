public class User {
    private int account_number;
    private int password;

    User(int account_number, int password) {
        this.account_number = account_number;
        this.password = password;
    }

    int getAccountNumber() {
        return account_number;
    }

    int getPassword() {
        return password;
    }

}
