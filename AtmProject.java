class ATM {
    public synchronized void CheckBalance(String name) {
        System.out.print(name + " checking ");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        System.out.println("balance");
    }

    public synchronized void Withdraw(String name, int amount) {
        System.out.print(name + " withdrawing ");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        System.out.println(amount);
    }
}

class Customer extends Thread {
    String name;
    int amount;
    ATM atm;

    Customer(String n, ATM a, int amt) {
        name = n;
        atm = a;
        amount = amt;
    }

    public void useATM() {
        atm.CheckBalance(name);
        atm.Withdraw(name, amount);
    }

    public void run() {
        useATM();
    }
}

class AtmProject {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Customer c1 = new Customer("Aadi", atm, 700);
        Customer c2=new Customer("golu" atm,900);
        c1.start();
    }
}
