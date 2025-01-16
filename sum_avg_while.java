import java.util.Scanner;
public class sum_avg_while {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,sum=0,i,avg;

        System.out.println("enter the limit");
        n=s.nextInt();
        i=1;
        while (i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println("sum of "+n+ "no:"+sum);
        avg=sum/n;
        System.out.println("average is"+avg);





    }
    }
