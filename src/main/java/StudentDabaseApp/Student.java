package StudentDabaseApp;

import java.util.Scanner;

public class Student {
    Scanner in = new Scanner(System.in);

    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentID;
    private String courses="";
    private int tuitionBalance= 0;
    private static int courseFee = 600;
    private static int id = 1000;
    private int gradeYearIndex;


    public Student() {
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1. 100L \n2. 200L \n3. 300L \n4. Diploma \n5. Masters \n6. Post Graduate \nSelect student level: ");
       gradeYearIndex= in.nextInt();

            if (gradeYearIndex == 2)
               gradeYear = "200L";
           else if (gradeYearIndex == 3)
               gradeYear = "300L";
           else if (gradeYearIndex == 4)
               gradeYear = "Diploma";
           else if (gradeYearIndex == 5)
               gradeYear = "Masters";
           else if (gradeYearIndex == 6)
               gradeYear = "Post Graduate";
//           else {
//               System.out.println("wrong input please try again");
//               System.out.print("1. 100L \n2. 200L \n3. 300L \n4. Diploma \n5. Masters \n6. Post Graduate \nSelect student level: ");
//               gradeYearIndex = in.nextInt();
//           }




        setStudentID();


        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
        enroll();
        System.out.println("");
        payTuition();
        System.out.println();
        System.out.println(studentInfo());

    }

    //constructor prompt student to get name and year

    // generate id
    private void setStudentID() {
        //grade level + ID
        id++;
        this.studentID = gradeYearIndex + "" + id;
    }

    // enrol course
    public void enroll(){
        // using a loop.
        Scanner input= new Scanner(System.in);
        String course;
        do {


            System.out.println("enter course to enroll and enter Q to quit:");
            course = input.nextLine();
            if (!course.equals("Q")) {
                courses += course + "\n";
                tuitionBalance += courseFee;


            }
            else {
                System.out.println();
                break;
            }
        }while (true);

        System.out.println("enroll in : \n"+ courses);
        System.out.println("cost :"+ tuitionBalance);

    }
    // view balance
    public void viewBalance(){
        System.out.println("Your balance is $" +tuitionBalance);
    }
    //pay tuition
    public void payTuition(){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your payment: ");
       int payment = input.nextInt();

        tuitionBalance= tuitionBalance-payment;
        System.out.println("thank you for paying your tuition of $" + payment);

        viewBalance();

    }
    public String studentInfo(){
        return ("Student Name" + firstName +" " + lastName+"\n"+
        "Grade Level: "+ gradeYear+"\n"+
                "Course: \n" + courses);
    }

    //student status
}
