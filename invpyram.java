import java.util.Scanner;
public class invpyram{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter the limit");
        n=s.nextInt();
        for (i=0;i<n;i++) {
            for (j=n-i;j>0;--j) {
                System.out.print("*");
            }
            System.out.println(" ");
        }



    }
    }
