import java.util.Random;
import java.util.Scanner;

public class HoT 
{
    public static void main(String[] args) 
    {
        System.out.println("Who are you?");        
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello, "+name+"!\n");

        System.out.println("Tossing a coin...\n");
        Random coin1 = new Random();
        int c1 = coin1.nextInt(2);
        Random coin2 = new Random();
        int c2 = coin2.nextInt(2);
        Random coin3 = new Random();
        int c3 = coin3.nextInt(2);

        int heads = 0;
        int tails = 0;

        System.out.println("Round 1:");
        if(c1==1){System.out.println("Heads\n"); heads++;}
        else{System.out.println("Tails\n"); tails++;}

        System.out.println("Round 2:");
        if(c2==1){System.out.println("Heads\n"); heads++;}
        else{System.out.println("Tails\n"); tails++;}

        System.out.println("Round 3:");
        if(c3==1){System.out.println("Heads\n"); heads++;}
        else{System.out.println("Tails\n"); tails++;}

        System.out.println("Heads: "+heads);
        System.out.println("Tails: "+tails+"\n");

        if(heads>tails)
        {
                System.out.println(name+" won!");
        }
        else
        {
                System.out.println(name+" lost!");
        }

    }
}