package Xoa_phan_tu;

import java.util.Scanner;

public class delete {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }

        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Element" + (i + 1) + ":");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.print("Property list:");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        int x = deleteValue(array);
        System.out.println("Mang sau khi xoa la");


    }

    public static int deleteValue(int[] array) {

        int value = 7;
        boolean check = false;

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                index = i;
                check = true;
            } else {
                check = false;
            }

        }
        if (check == true) {
            array[index + 1] = array[index];
            array[array.length - 1] = 0;
        }

    }

}
