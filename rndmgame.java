import java.util.Random;
import java.util.Scanner;

public class rndmgame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n,g,l,h,i=0;
        System.out.println("\nPlease Set lower and upper limit.\n");
        System.out.print("Lowest digit: ");
        l = scanner.nextInt();
        System.out.print("Highest digit: ");
        h = scanner.nextInt();
        n = random.nextInt(l, h+1);
        do{
            i++;
        System.out.print("Guess the number: ");
        g = scanner.nextInt();
        if(g<n){
            System.out.println("Increase your number!");
        }
        else if(g>n){
            System.out.println("Decrese your number");
        }
        else if(g==n){
            System.out.println("Damm Bro!! \nYou got the in "+i+" attempts number!! ");
        }
        }while(g != n);
        scanner.close();
    }
}
