import java.util.*;

public class array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("row");

        int row = sc.nextInt();
        System.out.println("colom");

        int colom = sc.nextInt();

      int [][] arr = new int[row][colom];

        System.out.println("enter value");

for(int i = 0 ; i < row ; i++ ){
    for (int j = 0 ; j < colom; j++){
        arr[i][j] = sc.nextInt();
    }
}

for (int i = 0; i < row ; i++){
    for (int j = 0 ; j< colom ; j++){
        System.out.print(arr[i][j] + " ");

    }
    System.out.println();
}

        System.out.println("what value index find");

int find = sc.nextInt();

for (int i = 0 ; i < row ; i++){
    for (int j = 0 ; j< colom ; j++){
        if (find == arr[i][j]) System.out.println(i + " , " + j);
    }
}





    }
}
