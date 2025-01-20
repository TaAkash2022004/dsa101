import java.util.Scanner;
public class pali {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num,temp=0,rev=0,n;
        System.out.println("Enter the number");
        num=s.nextInt();
        temp=num;
        while(num>0){
            n=num%10;
            rev=rev*10+n;
            num=num/10;


        }
        if(rev==temp)
        {
          System.out.println("palindrome");

        }
        else{

            System.out.println("Not palindrome");
        }

    }
    }
