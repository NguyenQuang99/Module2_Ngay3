package Xoa_phan_tu;

import java.util.Scanner;

public class delete {
    public static void main(String[] args) {
        int [] array = {5, 7, 11, 14, 20 , 6};
        Scanner sc = new Scanner(System.in);
        int input;

        System.out.println("Nhap phan tu can xoa");
        input = sc.nextInt();
        int N = array.length;
        for(int j = 0; j< array.length;j++) {
            if (input == array[j]) {
                for(int k = 0; k< array.length -1; k++) {
                    array [k] = array[k+1];
                }
                array[array.length -1] = 0;
            }

        }
        for(int a = 0; a < array.length; a++ ) {
            System.out.println(array[a] + "");
        }



    }

}

