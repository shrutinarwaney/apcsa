//Client program for Person/Employee

import java.util.Scanner;

public class ClientEmployee {

    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);

        String last, first, dept;

        double pay_rate;

        int hours;

        Employee prof = new Employee("John", "Doe", 25.50, 50, "COSC"); //subclass alternate constructor invoked

        Employee newEmp = new Employee(); //subclass default constructor invoked

        prof.print();
        prof.printLastFirst();
        newEmp.print();
        newEmp.printLastFirst();

        newEmp.setAll( "Emp", "Loyee", 21, 43, "managerial" );
        newEmp.print();
        newEmp.printLastFirst();

        System.out.println( "Are prof and newEmp equal?" );
        System.out.println( newEmp.equals( prof ) );

        newEmp.copy( prof );

        System.out.println( "Are prof and newEmp equal after copying" );
        System.out.println( newEmp.equals( prof ) );
    }

}