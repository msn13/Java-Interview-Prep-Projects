package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCap;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        password = "";
        department = setDepartment();
        mailboxCap = 0;
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

    private String randPassword(int length) {
        String setPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%&-";
        char[] password = new char[length];

        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * setPassword.length());
            password[i] = setPassword.charAt(rand);
        }

        return new String(password);
    }
}
