import java.util.*;

public class array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int colom = sc.nextInt();

      int [][] arr = new int[row][colom];



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





    }
}
