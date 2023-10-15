import java.util.*;

class AccountDetails {
    private List<User> listofusers = new ArrayList<>();
    private static HashMap<Integer, Integer> balanceMap = new HashMap<>();

    AccountDetails() {
    }

    static {
        User user1 = new User(123, 123);
        User user2 = new User(234, 234);
        User user3 = new User(345, 345);

        balanceMap.put(user1.getAccountNumber(), 1000);
        balanceMap.put(user2.getAccountNumber(), 500);
        balanceMap.put(user3.getAccountNumber(), 10);
    }

    boolean doesAccountPresent(int account_number) {
        return balanceMap.containsKey(account_number);
    }

    boolean doesKeyMatch(int Pass_key) {
        return true;
    }

    int returnBalance(int account_number) {
        return balanceMap.get(account_number);
    }

    void updateBalance(int account_number, int amount) {
        int currentBalance = balanceMap.get(account_number);
        balanceMap.put(account_number, currentBalance + amount);
    }

}