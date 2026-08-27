import java.util.Scanner;

public class ubank {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int pin , bal = 50000, choice,epin,i=0;
        float rem,wd,tot,dep;
        System.out.print("Set a pin for the code: ");
        pin = scanner.nextInt();        
        while( i!=3 ){
            System.out.print("Enter your pin: ");
            epin = scanner.nextInt();
            if(epin == pin){
                System.out.println("\nLogin Sucessfully!!!!\n");
                System.out.println("Press 1 to Withdraw money.\nPress 2 to Deposit Money.\nPress 3 to check Your balance. ");
                System.out.print("Enter Your Choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.print("\nEnter amount you want to Withdraw: ");
                    wd = scanner.nextFloat();
                    rem = bal - wd;
                    if(rem>=0){
                        System.out.println("The remaining amount is: "+ rem);
                    }
                    else if(rem<0){
                        System.out.println("Sorry!!\nYou Doesn't have these much amount");
                    }
                    break;
                case 2:
                    System.out.print("\nEnter The amount you want to deposit: ");
                    dep = scanner.nextFloat();
                    tot = dep + bal;
                    System.out.println("The total amount in the bank is: "+ tot);
                    System.out.println("##########################################\n");

                    break;
                case 3:
                    System.out.println("\nTotal amount in your account is: "+bal);
                    System.out.println("##########################################\n");


                    break;
                default:
                    System.out.println("\nWrong choice!!");
                    System.out.println("##########################################\n");

                }
                i=3;
                break;
            
        }
            else{
                if((2-i)>0){
                System.out.println("\nTry again you have "+ (2-i)+" attempts left!!!");
                System.out.println("##########################################\n");

                }
                else if((2-i)==0){
                    System.out.println("Login Failed!!");
                }
                i++;
            }
        }
        scanner.close();
    }
}
