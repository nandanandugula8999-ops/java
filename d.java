class d {
    private int accountNumber;
    private double balance;
    public String accountType;
    protected String branchName;
 d(int accountNumber, double balance,
                String accountType, String branchName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
        this.branchName = branchName;
    }
    void deposit(double amount) {
        balance = amount;
    }
    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Account Type: " + accountType);
        System.out.println("Branch Name: " + branchName);
        System.out.println("Helo java");
    }
}
//Find all the errors in the program.