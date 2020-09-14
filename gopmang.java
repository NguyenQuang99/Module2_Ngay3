package gop_mang;

import java.util.Scanner;

public class aggregation {
    public static void main(String[] args) {
        int[] arrA;
        int[] arrB;
        int[] arrC;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap kich thuoc mang");
        int n = sc.nextInt();
        arrA = new int[n];
        for (int i = 0; i < arrA.length; i++) {
            System.out.println("Phần tử thứ " + i + " ");
            arrA[i] = sc.nextInt();
        }
        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i] + " ");
        }
        //mảng b
        System.out.println("Nhập  kích thước mảng ");
        int m = sc.nextInt();
        arrB = new int[m];
        for (int j = 0; j < arrB.length; j++) {
            System.out.println("Phần tử thứ " + j + " ");
            arrB[j] = sc.nextInt();
        }
        for (int i = 0; i < arrB.length; i++) {
            System.out.print(arrB[i] + " ");
        }
        System.out.println();
        //mảng C
        arrC = new int[arrA.length + arrB.length];
        for (int i = 0; i < arrA.length; i++) {
            arrC[i] = arrA[i];
        }
        for (int i = 0; i < arrB.length; i++) {
            arrC[arrA.length + i] = arrB[i];
        }
        for (int i = 0; i < arrC.length; i++) {
            System.out.print(arrC[i] + " ");
        }
    }
}