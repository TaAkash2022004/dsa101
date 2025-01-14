import java.util.Scanner;
public class amazon{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c;
        String l;
        System.out.println("Read the cost of product");
        c=s.nextInt();
        s.nextLine();
        System.out.println("Enter the location");
        l=s.nextLine();
        switch(l){
            case "us":
                System.out.println("It is "+(c+5)+"for product and "+5+"for shipping");

                break;
            case "europe":
                System.out.println("It is "+(c+7) +c+" for product and "+7+"for shipping");

                break;
            case "canada":
                System.out.println("It is "+(c+3));

                break;
            default :
                System.out.println("you have to pay"+(c+9));


        }




    }
    }
