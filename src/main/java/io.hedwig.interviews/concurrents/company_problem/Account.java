package io.hedwig.interviews.concurrents.company_problem;

/**
 * Created by patrick on 16/3/28.
 */
public class Account {
    private double balance;

    /**
     * Add an import to the balance of the account
     *
     * @param amount import to add to the balance
     */
    public void addAmount(double amount) {
        double tmp = balance;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tmp += amount;
        balance = tmp;
    }

    /**
     * Subtract an import to the balance of the account
     *
     * @param amount import to subtract to the balance
     */
    public void subtractAmount(double amount) {
        double tmp = balance;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tmp -= amount;
        balance = tmp;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
