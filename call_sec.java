import java.util.Scanner;
public class call_sec {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sec,fc;
        fc=25;
        System.out.println("how many seconds was the calls duration");
        sec=s.nextInt();
        if (sec<=500){
            System.out.println("charge is"+(25+500*0.01));
        }
        else if (sec<=800){
            System.out.println("charge is"+(25+500*0.01+(sec-500)*0.008));
        }
        else {
            System.out.println("charge is"+(25+500*0.01+300*0.008+(sec-800)*0.005));
        }




    }
    }
