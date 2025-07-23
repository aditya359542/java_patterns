import java.util.*;

public class array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Array size");



        int[] arr = new int[sc.nextInt()];

        for (int i= 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("value you find");

        int find = sc.nextInt();

        for (int i= 0 ; i <  arr.length ; i++){

        if (arr[i] == find){
            System.out.println(i);
        }

        }


    }
}
