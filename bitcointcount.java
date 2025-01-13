import java.util.Scanner;
public class bitcoincount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,b,e,l;
        System.out.println("Enter the total amount : ");
        n=s.nextInt();
        System.out.println("Enter the bitcoin amount : ");
        b=s.nextInt();
        System.out.println("bitcoin count ="+(n/b));
        System.out.println("Enter the Ethereum amount : ");
        e=s.nextInt();
        System.out.println("Ethereum count ="+(n/e));
        System.out.println("Enter the Litecoin amount : ");
        l=s.nextInt();
        System.out.println("Litecoin count ="+(n/l));

    }
    }
