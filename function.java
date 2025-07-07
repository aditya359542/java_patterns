import java.util.Scanner;

public class function {


    static int sum(int a, int b){
      return a*b;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("provide two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();


        System.out.println(sum(a,b));



    }
    
}
