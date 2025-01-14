import java.util.Scanner;
public class wiki{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x,y,t,yt;
        System.out.println("how many mbps uses wikipedia");
        x=s.nextDouble();
        System.out.println("how many mbps uses memes");
        y=s.nextDouble();
        t=((x*0.1)+(y*0.05));
        yt = y * 0.05;
        if(t>100) {
            System.out.println("Too much consumption");
        }
        if(yt>x*0.1)
        {
            System.out.println("WOW MANY MEMES \n SUCH LOL");
        }


    }
    }
