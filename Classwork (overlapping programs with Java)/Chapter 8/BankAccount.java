public class BankAccount{
    
    String name;
    double balance;
    double transactionFee;
   
    public BankAccount(){
        //default
    }
    
    public void deposit(double  amount){
        this.balance += amount;
    }
    
    public void withdraw(double amount){
        this.balance -= amount;
        this.transactionFee();
    }
    
    public void transactionFee(){
        transactionFee = 0;
        if(balance-transactionFee >= 0){
            balance -= transactionFee;
        }
    }
    
    public void transfer(BankAccount b,double amount){
        if(this.balance - 5 >= 0){
            this.balance -= 5;
            if(this.balance > amount){
                b.deposit(amount);
                this.balance -= amount;
            }else{
                b.deposit(balance);
                this.balance = 0;
            }
        }
        
    }
    
    public String toString(){
        return name + ", $" + balance;
    }


}