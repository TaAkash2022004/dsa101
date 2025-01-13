import java.util.Scanner;
public class Second{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,a,t;
        System.out.println("Enter a no:");
        n=s.nextInt();
        a=n/10;
        t=a%10;
        System.out.println("Second Last digit is:"+t);


    }
    }
