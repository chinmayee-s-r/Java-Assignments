package banking;
import java.util.*;

class Node {
    int Account_no;
    String Name;
    String address;
    Float balance;
    Node next;

    Node(String name, String addr, int ac, int bal) {
        Account_no = ac;
        address = addr;
        Name = name;
        balance = (float) bal;
        next = null;
    }
}

class Bankoper {
    Node head;
    int size;

    Bankoper() {
        head = null;
        size = 0;
    }

    public void addlast(String name, String a, int acc, int bal) {
        Node n = new Node(name, a, acc, bal);
        size++;
        if (head == null) {
            head = n;
            return;
        }
        Node ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = n;
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.Name + "--");
            System.out.print(ptr.Account_no + "--");
            System.out.print(ptr.address + "--");
            System.out.print(ptr.balance + "--");
            System.out.println();
            ptr = ptr.next;
        }
        System.out.println("Null");
    }

    void delete(int acc) {
        Node ptr = head.next;
        Node prev = head;
        // If no member
        if (prev == null) {
            System.out.println("No Customer Details Available.");
            return;
        }
        size--;
        // If only one member
        if (acc == prev.Account_no) {
            head = head.next;
            System.out.println("Customer Details Deleted.ok");
            return;
        }
        int c = 0;
        // For last node as member
        while (prev != null && acc == prev.Account_no) {
            prev = prev.next;
            ptr = ptr.next;
            c++;
        }
        if (prev == null) {
            System.out.println("Account Not Found.\nTry Again:");
            return;
        }
        prev.next = ptr.next;
        System.out.println("Customer Details Deleted.");
    }

    void deposit(int acc) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to deposit:");
        float am = sc.nextFloat();
        Node temp = head;
        int counter = 0;
        while (temp != null && acc == temp.Account_no) {
            temp.balance = temp.balance + am;
            counter = 1;
            break;
        }
        temp = temp.next;
        if (counter == 0) {
            System.out.println("Account Not Found.\nTry Again:");
        } else {
            System.out.println("Balance After Deposit: " + temp.balance);
        }
    }

    void withdraw(int acc) {
        Scanner sc = new Scanner(System.in);
        Node temp = head;
        int counter = 0;
        while (temp != null && acc == temp.Account_no) {
            System.out.println("Enter amount to withdraw:");
            float am = sc.nextFloat();
            if (temp.balance > am) {
                temp.balance = temp.balance - am;
                counter = 1;
            } else {
                System.out.println("Insufficient balance");
            }
            break;
        }
        temp = temp.next;
        if (counter == 0) {
            System.out.println("Account not found.\nTry again");
        } else {
            System.out.println("Balance After Withdraw: " + temp.balance);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bankoper b = new Bankoper();
        System.out.println("Welcome to my Bank!\n Enter your choice: ");
        int ch = 0;
        do {
            System.out.println("0.Exit\n1.Accept\n2.Delete a particular member\n3.Display All Customer List\n4.Deposit Amount\n5.Withdraw Amount");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter number of accounts");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Enter Account Number:");
                        int acc = sc.nextInt();
                        System.out.println("Enter Account Holder's Name:");
                        String name = sc.next();
                        System.out.println("Enter Address:");
                        sc.nextLine(); // Consume the newline character
                        String a = sc.nextLine(); // Read the entire line for address
                        System.out.println("Enter Account Balance:");
                        int bal = sc.nextInt();
                        b.addlast(name, a, acc, bal);
                    }
                    break;
                case 2:
                    System.out.println("Enter the account number which you want to delete:");
                    int ano = sc.nextInt();
                    b.delete(ano);
                    break;
                case 3:
                    b.display();
                    break;
                case 4:
                    System.out.println("Enter account number to Deposit:");
                    int ano1 = sc.nextInt();
                    b.deposit(ano1);
                    break;
                case 5:
                    System.out.println("Enter account number to Withdraw:");
                    int ano2 = sc.nextInt();
                    b.withdraw(ano2);
                    break;
                case 0:
                    break;
            }
        } while (ch != 0);
        System.out.println("Thank you and Have a great day!");
    }
}
