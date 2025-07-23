import java.util.Scanner;

public class function {


    static int fact(int num){
        int fact = 1;
        for (int i = num ; i >= 1 ; i-- ){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

        System.out.println(fact(sc.nextInt()));

    }
    
}
