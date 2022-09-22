package JAVABIBLE;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        //create the constructor of the account
        BankAccount account1= new BankAccount();
        //get an input from the user
        Scanner input= new Scanner(System.in);
        //request from user
        System.out.print("please enter your name: ");
        String theName= input.nextLine();

        account1.setName(theName);
        System.out.println(account1.getName());

    }

}
