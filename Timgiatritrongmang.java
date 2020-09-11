package Tim_gia_tri;

import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name student :");
        String input_name = sc.nextLine();
        boolean isExits = false;
        for(int i = 0; i< students.length; i++) {
            if(students[i].equals(input_name) ) {
                System.out.println("Position of the student in the list" + input_name +" is :" +(i + 1));
                isExits = true;
                break;
            }
        }
        if(isExits == false) {
            System.out.println("Not found" + input_name + "in the list");
        }
    }
}
