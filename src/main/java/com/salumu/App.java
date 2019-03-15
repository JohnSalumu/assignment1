package com.salumu;

import java.util.Scanner;

/**
 * /* This program assumes that the student has 6 subjects, and it helps gain the status of the grades of the student
 *          .
 *          */



public class App 
{
    public static void main(String args[])
    {

        int marks[] = new int[6];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);


        for(i=0; i<6; i++) {
            System.out.print("Enter Marks of Subject"+(i+1)+":");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }
        scanner.close();
        //Calculating average here
        avg = total/6;
        System.out.print("The student Grade's status is: ");
        if(avg>=75)
        {
            System.out.print("Pass with DISTINCTION");
        }
        else if(avg>=50 && avg<75)
        {
            System.out.print("Pass");
        }
        else if(avg>=0 && avg<50)
        {
            System.out.print("Failed");
        }
        else
        {
            System.out.print("Error! Student mark must be betwen 0-100");
        }
    }
}

