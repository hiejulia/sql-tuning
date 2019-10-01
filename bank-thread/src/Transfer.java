public class Transfer implements Runnable {

    public BankAccount fromAccount, toAccount;
    public double amount;

    public Transfer(BankAccount fromAccount, BankAccount toAccount, double amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    public void run() {
        System.out.println("Before transfer 1 has $"+fromAccount.getBalance());
        System.out.println("Before transfer 2 has $"+fromAccount.getBalance());
        fromAccount.transfer(amount, toAccount);
        System.out.println("After transfer 1 has $"+fromAccount.getBalance());
        System.out.println("After transfer 2 has $"+toAccount.getBalance());
    }

    public static void main(String[] args) {
        Transfer tf = new Transfer(new BankAccount(100.0),
                new BankAccount(100.0), 50.0);
        Thread t = new Thread(tf);  // x implements runnable and
        // therefore can be attached to a thread
        t.start();
        Thread.yield();  // Force a context switch

        System.out.println("Account 1 has $"+tf.fromAccount.getBalance());
        System.out.println("Account 2 has $"+tf.toAccount.getBalance());
    }
}
