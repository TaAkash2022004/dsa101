import java.util.Scanner;
public class sumavg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,sum=0,i,avg;

        System.out.println("enter the limit");
        n=s.nextInt();
        for( i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("sum of "+n+ "no:"+sum);
        avg=sum/n;
        System.out.println("average is"+avg);





    }
    }
