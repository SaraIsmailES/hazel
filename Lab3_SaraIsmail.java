package com.example.JavaUV;

import java.util.Scanner;


public class App {
    
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        
        String Name = "";
        double Balance = 0.0  , BookPrice = 0;
        int StudentId = 0,  Option = 0 ;
        
        
        System.out.println("Enter student name :");
        Name = input.nextLine();
                
        System.out.println("Enter student ID :");
        StudentId = input.nextInt();
        
        System.out.println("Enter available wallet balance :");
        Balance = input.nextDouble();
        
        
        
        System.out.println(
                "________ University Bookstore _______\n"+
                "       ______ OPTIONS ______ \n"+
                "1. Purchase a Textbook\n"+
                "2. Add Funds to Wallet\n"+
                "3. Display Student Information\n" +
                        "\n Enter a Valid Choise : ");
        
        Option = input.nextInt();
        
        if (Option == 1)
        {
            System.out.println(
                    "_______ Purchasing a Textbook _______\n"+
                    "      ___Available Textbooks___\n"+
                    "1. Introduction to Computer Science - $ 250.0\n"+
                    "2. Data Structure and Algorithms - $ 300.0\n"+
                    "3. Operating System Concepts - $ 400.0\n"+
                    "4. Database Systems: Design and Use - $ 350.0\n"+
                    "5. Software Engineering Principles - $ 275.0\n"+
                            "\nEnter a Valid Book ID\n");
            
            Option = input.nextInt();
            
            switch(Option)
            {
                case 1:
                    BookPrice = 250.0;
                    break;
                case 2:
                    BookPrice = 300.0;
                    break;
                case 3:
                    BookPrice = 400.0;
                    break;    
                case 4:
                    BookPrice = 350.0;
                    break;
                case 5:
                    BookPrice = 275.0;
                    break;
                default:
                    BookPrice = -1;                    
                    break;
            }
            
            if (BookPrice != -1)
            {
                if (Balance >= BookPrice)
                {
                    Balance -= BookPrice;
                    
                    System.out.println(
                            "Purchase successful! You bought the book for : $ "+ BookPrice +
                            "\nRemaining wallet balance is : $ " + Balance); 
                    return ;
                }
                else
                {
                    System.out.println("Not enough balance , Please Add Funds to the Wallet and try again!!!");
                    return ;
                }
            }
            else
            {
                System.out.println("Not a valid book ID");
                return ;
            }
        }
        else if (Option == 2)
        {
            System.out.println(
                    "_______ Adding Funds to the Wallet _______\n"+
                    "Enter Amount To add\n");
            Balance += input.nextDouble();
            
            System.out.println("Funds added successfully! New wallet balance is : "+ Balance);
        }
        else if (Option ==3)
        {
            System.out.println(
                    "_______ Student Information _______\n"+
                    "\nName : " + Name +
                    "\nStudent ID : " + StudentId +
                    "\nWallet Balance : "+Balance);
        }
        else 
        {
            System.out.println("Please enter a valid choice from the list");
        }
       
        input.close();
    }
}

