package Chapter12;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * A bank with a number of bank accounts.
 */
public class Bank {
    private final double[] accounts;
//    private ReentrantLock bankLock = new ReentrantLock();
//    private Condition sufficientFunds;

    /**
     * Constructs the bank.
     *
     * @param n              the number of accounts
     * @param initialBalance the initial balance for each account
     */
    public Bank(int n, double initialBalance) {
        accounts = new double[n];
        Arrays.fill(accounts, initialBalance);
//        bankLock=new ReentrantLock();
//        sufficientFunds=bankLock.newCondition();
    }

    /**
     * Transfer money from one to another
     *
     * @param from   the account to transfer from
     * @param to     the account to transfer to
     * @param amount the amount to transfer
     */
    public synchronized void transfer(int from, int to, double amount) throws InterruptedException {
//        bankLock.lock();
//        try {
        while (accounts[from] < amount) wait();
//               sufficientFunds.await();
        System.out.println(Thread.currentThread());
        accounts[from] -= amount;
        accounts[to] += amount;
        System.out.printf("from %d to %d\tTotal Balance:%10.2f%n", from, to, getTotalBalance());
        notify();
//           sufficientFunds.signalAll();
//       } finally {
//           bankLock.unlock();
//       }
    }

    /**
     * Gets the sum of all account balances
     *
     * @return the total balance
     */
    public synchronized double getTotalBalance() {
//        bankLock.lock();
//        try {
        double sum = 0;
        for (double a : accounts)
            sum += a;
        return sum;
//        }finally {
//            bankLock.unlock();
//        }
    }

    /**
     * Gets the number of accounts in the bank
     *
     * @return the number of accounts
     */
    public int size() {
        return accounts.length;
    }
}
