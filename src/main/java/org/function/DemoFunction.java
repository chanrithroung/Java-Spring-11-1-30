package org.function;
import java.util.Scanner;
public class DemoFunction {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] id = new int[100];
        String[] studentName = new String[100];
        String[] gender = new String[100];

        Process(id, studentName, gender);

    }


    public static void line(int n, char symbol) {
        for(int i = 0; i < n; i++) System.out.print(symbol);
        System.out.println();
    }

    static void menu() {
        System.out.println("============[ CRUD WITH FUNCTION ]============");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n%-10s%-10s", "CREATE" ,"READ", "Update".toUpperCase(), "DELETE", "INSERT", "SORT", "SEARCH");
        System.out.println();
        System.out.println("==============================================");

    }

    static void createStudent(int []id, String []studentName, String []gender, int n) {
        for(int i = 0; i < n; i++) {
            System.out.printf("=========[ Student %d ]==========\n", (i + 1));
            System.out.print("Enter student id : ");
            id[i] = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter student Name : ");
            studentName[i] = scanner.nextLine();

            System.out.print("Enter student Gender : ");
            gender[i] = scanner.nextLine();
        }
    }

    static void displayStudents(int []id, String []name, String []gender, int n) {
        System.out.println();
        line(30, '-');
        System.out.printf("%-10s%-15s%-15s\n", "#ID", "StudentName", "Gender");
        for(int i = 0; i < n; i++) {
            System.out.printf("%-10d%-15s%-15s", id[i], name[i], gender[i]);
            System.out.println();
        }
        line(30, '-');
        System.out.println();
    }


    static void Process(int []id, String []name, String []gender) {
        int op, n = 0;
        do {
            menu();
            System.out.print("Please Select one option: ");
            op = scanner.nextInt();

            switch (op) {
                case 1 -> {
                    System.out.print("Enter number of students : ");
                    n = scanner.nextInt();
                    createStudent(id, name, gender, n);
                }
                case 2 -> {
                    displayStudents(id, name, gender, n);
                }
            }

        } while (op != 8);

    }
}