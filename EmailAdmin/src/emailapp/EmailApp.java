package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email email = new Email("John", "Smith");
        email.setMailboxCap(100);
        System.out.println(email.showInfo());
    }
}
