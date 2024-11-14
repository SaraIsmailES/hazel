
package com.mycompany.testexercises;

import java.util.*;

public class TestExercises {

    public static void main(String[] args)
    {
        Scanner input;        
        input = new Scanner(System.in);
        String studentName = "";
        double quiz1 = 0;
        double quiz2 = 0;
        double midterm = 0;
        double finalExam = 0;
        
        System.out.println("Welcome to the Grade Calculator program!");
        
        System.out.println("Enter student name : ");
        studentName = input.nextLine();
        
        System.out.println("Enter quize 1 grade : ");
        quiz1 = input.nextDouble();
        
        System.out.println("Enter quize 2 grade : ");
        quiz2 = input.nextDouble();
        
        System.out.println("Enter midterm grad : ");
        midterm = input.nextDouble();
        
        System.out.println("Enter final exam grad : ");
        finalExam = input.nextDouble();
        
        double totalGrade = calculateTotal(quiz1, quiz2, midterm, finalExam);
        
        char gradeLetter = getGradeLetter(totalGrade);
        
        displayGradeReport(studentName , totalGrade, gradeLetter);
               
    }
    
    public static double calculateTotal(double quiz1, double quiz2, double midterm, double finalExam)
    {
        double total = quiz1 + quiz2 + midterm + finalExam ;
        return total / 4;
    }
    
    public static char getGradeLetter(double total)
    {
        char gradeLetter = 'z';
        
        if(total>= 90 && total <=100)
        {
            gradeLetter = 'A';           
        }
        else if (total>= 80 && total <=89)
        {
             gradeLetter = 'B';
        }
        else if (total>= 70 && total <=79)
        {
             gradeLetter = 'C';
        }
        else if (total>= 60 && total <=69)
        {
             gradeLetter = 'D';
        }
        else if (total>= 0 && total <=59)
        {
             gradeLetter = 'F';
        }
                
        return gradeLetter;
    }
    
    public static void displayGradeReport(String name , double total, char letter)
    {
        System.out.println("Grade report for "+ name);
        System.out.println("Total grade : " + total);
        System.out.println("Letter Grade : " + letter);
    }
}
 

