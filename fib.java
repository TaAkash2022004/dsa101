import java.util.Scanner;
public class fib {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,i,a=0,b=1,nxt;
        System.out.println("Enter the limit");
        n=s.nextInt();
        System.out.println(a);
        System.out.println(b);
        nxt=a+b;
        for(i=0;i<n-2;i++){
            System.out.println(nxt);
            a=b;
            b=nxt;
            nxt=a+b;

        }


    }
    }
