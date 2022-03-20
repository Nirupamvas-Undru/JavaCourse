public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount bobAccount = new BankAccount("Bob Robinson", 500);
        System.out.println("Owner: "+  bobAccount.getOwner());
        System.out.println("balance: "+ bobAccount.getBalance());

        bobAccount.deposit(1000);
        bobAccount.withdraw(200);

        System.out.println();

        BankAccount myAccount = new BankAccount("John Baugh", 100);
        System.out.println("Owner: "+  myAccount.getOwner());
        System.out.println("balance: "+ myAccount.getBalance());

        myAccount.deposit(1000);
        myAccount.withdraw(200);

    }//end main
}
