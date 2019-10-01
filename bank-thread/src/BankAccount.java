class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
    }

    public synchronized void withdraw(double amount)
            throws RuntimeException {
        if (amount > balance) {
            throw new RuntimeException("Overdraft");
        }
        balance -= amount;
    }

    public synchronized void transfer(double amount, BankAccount toAccount) {
        this.withdraw(amount);
        Thread.yield();   //Force a context switch
        toAccount.deposit(amount);
    }


}