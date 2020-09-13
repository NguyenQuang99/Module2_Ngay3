package chen_phan_tu;

import java.util.Scanner;

public class insert {
    public static void main(String[] args) {
        int [] array = {9, 11, 5, 8, 2, 1, -2};
        Scanner sc = new Scanner(System.in);
        int input;
        int index;

        System.out.println("Nhập phần tử cần chèn :");
        input = sc.nextInt();
        System.out.println("Nhap vi tri can chen");
        index = sc.nextInt();
        if(index < 0 || index > array.length -1) {
            System.out.println("Khong chen dc");
        } else {
            for(int i = array.length -1;i> index; i--) {
                array[i] = array [i-1];
            }
            array[index] = input;
        }
        for(int i = 0;i< array.length; i++) {
            System.out.println(array[i] + "");
        }
    }
}
