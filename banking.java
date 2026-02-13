import java.util.Scanner;

public class Account {

    int acc_no;
    String acc_hol_name, acc_type, add;
    double bal;

    Account(String name, int ac_no, double bal) {
        this.acc_hol_name = name;
        this.acc_no = ac_no;
        this.bal = bal;
    }

    Account(String name, int ac_no, String adr, String typacc, double currentbalance) {
        this.acc_hol_name = name;
        this.acc_no = ac_no;
        this.add = adr;
        this.acc_type = typacc;
        this.bal = currentbalance;
    }

    void deposit(double amt) {
        bal = bal + amt;
    }

    void withdraw(double amt) {
        if (bal - amt < 1000) {
            System.out.println("Insufficient balance (minimum balance is 1000)");
        } else {
            bal = bal - amt;
        }
    }

    double getBal() {
        return bal;
    }

    void printDetail() {
        System.out.println("Name: " + acc_hol_name);
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + getBal());
        System.out.println("Account Type: " + acc_type);
        System.out.println("Address: " + add);
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account acc1 = new Account("Amit", 1001, 2000);
        Account acc2 = new Account("Rajesh", 1002, "Mathura", "Saving", 10000);

        acc1.printDetail();

        System.out.println("Enter amount to deposit in acc1:");
        double amount = sc.nextDouble();
        acc1.deposit(amount);
        System.out.println("Updated Balance: " + acc1.getBal());

        System.out.println("Enter amount to withdraw from acc2:");
        double amtt = sc.nextDouble();
        acc2.withdraw(amtt);
        System.out.println("Updated Balance: " + acc2.getBal());

        sc.close();
    }
}