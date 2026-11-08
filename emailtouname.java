import java.util.Scanner;

public class emailtouname {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String uname,email,domain;
        System.out.print("Enter Your Email: ");
        email = scanner.nextLine();
        uname = email.substring(0, email.indexOf("@"));
        domain = email.substring(email.indexOf("@" +1 ));
        System.out.println("\nYour default usermame is: "+ uname);
        System.out.println("Your domain of email is: "+ domain);
        System.out.println("\nThank You For Using This Program");

        scanner.close();
    }
}
