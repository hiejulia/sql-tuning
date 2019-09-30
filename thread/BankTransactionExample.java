import java.util.Arrays;

public class BankTransactionExample {


    
    public static void main(String [] args) {

    }


    private void settleTransfers() {
        AccountWithLock firstAccount= new AccountWithLock();
        AccountWithLock secondAccount= new AccountWithLock();
        
        TransferLock(1,firstAccount,secondAccount,200);
        TransferLock(2,secondAccount,firstAccount,150);
        Thread t1 = new Thread(transfer1);
        Thread t2 = new Thread(transfer2);
        t1.start();
        t2.start();
      }


      public void run(){
        int transferAttempts = 3;
        while (transferAttempts > 0) {
          if (fromAccount.transfer(fromAccount, toAccount, amount)) {
            break;
          }
          transferAttempts--;
        }
      }



      // Main transfer function 

      private boolean transfer(Account fromAccount, Account toAccount, double amount) {
        synchronized(fromAccount) {
          Thread.sleep(50); 
          synchronized (toAccount) {
            if(fromAccount.withdraw(amount)) {
              toAccount.deposit(amount);
            }
           
      }


      private boolean mainTransfer(){
        try {
            fromAccount.lock.tryLock(3, TimeUnit.SECONDS);
          } catch (InterruptedException ex) {
            
          }
          
          if (!fromAccount.lock.isHeldByCurrentThread()) {
            return false;
          }
          
          try {
            toAccount.lock.tryLock(3, TimeUnit.SECONDS);
          } catch (InterruptedException ex) {
        
          }
          if(!toAccount.lock.isHeldByCurrentThread()){
            fromAccount.lock.unlock();
            return false;
          }
        //   ...
          if(fromAccount.withdraw(amount)){
            toAccount.deposit(amount);
            fromAccount.lock.unlock();
            toAccount.lock.unlock();
          }
          
          return true;
      }





}
