package StudentDabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        // how many user do you want add
//       Student student= new Student();
        //create N number of new student
        System.out.print("Enter the number of student do you to want to create? ");
        Scanner in = new Scanner(System.in);
        int numOfStudent = in.nextInt();
        Student[] students = new Student[numOfStudent];
        for (int i = 0; i < numOfStudent; i++) {
            students[i]= new Student();

        }
    }
}
