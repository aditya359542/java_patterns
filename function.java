import java.util.Scanner;

public class function {


    // static int sum(int a, int b){
    //   return a*b;
    // }

    static int fact(int a){

        int num = 1;
        for (int i = num ; i >= 1; i--){
            num = num * i;
            System.out.println(num);
        }



        
        return num;
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("provide numbers");
        int a = sc.nextInt();


        System.out.println(fact(a));



    }
    
}
