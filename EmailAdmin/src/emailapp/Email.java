package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private final int defPasswordLen = 15;
    private String department;
    private int mailboxCap;
    private String alternateEmail;
    private final String company = "company.com";


    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        department = setDepartment();
        System.out.println("Department selected: " + department);
        password = genPassword(defPasswordLen);
        System.out.println("Your password is: " + password);
        mailboxCap = 0;
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + company;
        alternateEmail = "";
    }

    private String setDepartment() {
        System.out.println("""
                Enter the department:
                1 for Sales
                2 for Development\
                
                3 for Accounting
                0 to exit
                Enter department code:\s""");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        if ( choice == 1 ) {
            return "Sales";
        } else if ( choice == 2 ) {
            return "Development";
        } else if ( choice == 3 ) {
            return "Accounting";
        } else {
            return "";
        }
    }

    private String genPassword(int length) {
        String setPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%&-";
        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * setPassword.length());
            password[i] = setPassword.charAt(rand);
        }

        return new String(password);
    }

    public void setMailboxCap(int cap) {
        mailboxCap = cap;
    }

    public void setAlternateEmail(String email) {
        this.alternateEmail = email;
    }

    public void customPassword(String password) {
            this.password = password;
    }
}
