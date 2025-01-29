import java.util.Scanner;
public class flippyram{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,i,j,k;
        System.out.println("Enter the limit");
        n=s.nextInt();
        for (i=0;i<n;i++) {
            for(k=0;k<i;k++) {
                System.out.print(" ");
             }
                for (j=n-i;j>0;--j)
                {
                System.out.print("*");
                }
            System.out.println(" ");
            }




    }
    }
