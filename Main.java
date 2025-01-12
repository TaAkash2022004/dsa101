import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c,g,m;
        System.out.println("chemistry");
        c=s.nextInt();

        System.out.println("geometry");
        g=s.nextInt();
        System.out.println("mths");
        m=s.nextInt();
        System.out.println("avrage = "+(c+g+m)/3);

    }
    }
