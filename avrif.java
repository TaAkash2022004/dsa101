import java.util.Scanner;
public class avrif {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c,g,m,avg;
        System.out.println("chemistry");
        c=s.nextInt();

        System.out.println("geometry");
        g=s.nextInt();
        System.out.println("mths");
        m=s.nextInt();
        avg=(c+g+m)/3;
        System.out.println("avrage = "+avg);

        if(avg>=7){
            System.out.println("good job");
        }
        else if (avg>=4 && avg<=6){
            System.out.println("You need to work harder");
        }
        else if (avg<4){
            System.out.println("Failed, you really need to work harder!");
        }



    }
    }
