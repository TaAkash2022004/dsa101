import java.util.Scanner;
public class bitcoin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,b,inc;
        System.out.println("enter current value");
        n=s.nextInt();
        System.out.println("bitcoin increase");
        b=s.nextInt();
        inc=n*b/100;
        System.out.println("increase"+inc);

        System.out.println("total = "+(inc+n));



    }
    }
