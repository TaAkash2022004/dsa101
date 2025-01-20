import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int[] num = {2,5,1,6,7};
        for (int i : num){
            if( i > max){
                max=i;
            }
            if(i < min){
                min=i;
            }

        }


        System.out.println("max value is"+max);
        System.out.println("min value is"+min);


    }
    }
