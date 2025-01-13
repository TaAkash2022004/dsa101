import java.util.Scanner;
public class office{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,k,t,m;
        boolean x;
        m=400;
        System.out.println("minimum wage is:"+m);
        System.out.println("Enter the no of years you worked");
        n=s.nextInt();
        System.out.println("Enter the no of kids");
        k=s.nextInt();

        System.out.println("did you miss any day:(true or false)");
        x=s.nextBoolean();
        if(x) {
            System.out.println("total salary is " + (m + 20 * n + 30 * k));
        }
        else {
            System.out.println("total salary is " + (m + 20 * n + 30 * k+100));
        }
    }
    }
